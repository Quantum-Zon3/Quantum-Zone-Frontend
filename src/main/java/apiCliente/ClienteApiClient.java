package apiCliente;
import apiService.ClienteApiService;
import modelo.*;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
public class ClienteApiClient {
	private static final String BASE_URL = "http://localHost:8080";
	private static ClienteApiService clienteApiService;
	
	public ClienteApiClient() {
		// Configurar Retrofit
		Retrofit retrofit = new Retrofit.Builder()
				.baseUrl(BASE_URL)
				.addConverterFactory(GsonConverterFactory.create())
				.build();
		
		clienteApiService = retrofit.create(ClienteApiService.class);
		}	
	
	public static List<Cliente> listarCliente() {
		try {
			Response<List<Cliente>> response = clienteApiService.getAllUsuarios().execute();
			if(response.isSuccessful()){
				return response.body();
				//admins.forEach(admin -> System.out.println(admin));
			}else {
				System.out.println("Error " + response.code());
			}
			
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		return null;
	}
	public static Cliente buscarClientePorCedula(String cedula) throws Exception {
		Response<List<Cliente>> cliente = clienteApiService.buscarUsuarios(cedula).execute();
		if(cliente.isSuccessful()) {
			if(cliente.body().isEmpty()){
				throw new Exception("Cliente no encontrado");
			}
			return cliente.body().get(0);
		}else{
			throw new Exception("Datos Incorrectos");
		}
	}
	public static void deleteCliente(String id) throws Exception {
		Response<Void> response = clienteApiService.deleteUsuario(id).execute();
		if(response.isSuccessful()) {
			System.out.println("Cliente eliminado con exito");
		}else{
			throw new Exception("Error al eliminar el cliente");
		}
	}
	public static Cliente saveCliente(Cliente cliente) throws Exception {
		Response<Cliente> response = clienteApiService.createUsuario(cliente).execute();
		if(response.isSuccessful()) {
			return response.body();
		}else{
			throw new Exception("Error al guardar el cliente");
		}
	}
}
