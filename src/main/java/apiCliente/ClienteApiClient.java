package apiCliente;
import apiService.ClienteApiService;
import modelo.*;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import com.google.gson.*;
import java.lang.reflect.Type;
import java.time.LocalDate;
public class ClienteApiClient {
	private static final String BASE_URL = "http://localHost:8080";
	private static ClienteApiService clienteApiService;
	
	public ClienteApiClient() {
		Gson gson = new GsonBuilder()
			.registerTypeAdapter(LocalDate.class, new JsonDeserializer<LocalDate>() {
				@Override
				public LocalDate deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
					return LocalDate.parse(json.getAsString());
				}
			})
			.registerTypeAdapter(LocalDate.class, new JsonSerializer<LocalDate>() {
				@Override
				public JsonElement serialize(LocalDate src, Type typeOfSrc, JsonSerializationContext context) {
					return new JsonPrimitive(src.toString());
				}
			})
			.create();

		Retrofit retrofit = new Retrofit.Builder()
			.baseUrl(BASE_URL)
			.addConverterFactory(GsonConverterFactory.create(gson))
			.build();

		clienteApiService = retrofit.create(ClienteApiService.class);
	}
	
	
	public static List<Cliente> listarCliente(String token) {
		try {
			Response<List<Cliente>> response = clienteApiService.getAllUsuarios("Bearer "+token).execute();
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
	public static Cliente buscarClientePorCedula(String cedula, String token) throws Exception {
	    String authHeader = "Bearer " + token;
	    Response<List<Cliente>> response = clienteApiService.buscarUsuarios(cedula, authHeader).execute();

	    if (response.isSuccessful()) {
	        List<Cliente> clientes = response.body();

	        if (clientes == null || clientes.isEmpty()) {
	            throw new Exception("Cliente no encontrado con cédula: " + cedula);
	        }

	        return clientes.get(0);
	    } else {
	        String errorMessage;
	        try {
	            errorMessage = response.errorBody() != null
	                ? response.errorBody().string()
	                : "Respuesta con código HTTP: " + response.code();
	        } catch (Exception e) {
	            errorMessage = "No se pudo leer el cuerpo del error. Código HTTP: " + response.code();
	        }

	        // Agrega logs para depurar
	        System.out.println("Código HTTP: " + response.code());
	        System.out.println("Mensaje error: " + errorMessage);

	        throw new Exception("Error al buscar cliente: " + errorMessage);
	    }
	}
	public static void deleteCliente(Integer id,String token) throws Exception {
		Response<Void> response = clienteApiService.deleteUsuario(id,"Bearer "+token).execute();
		if(response.isSuccessful()) {
			System.out.println("Cliente eliminado con exito");
		}else{
			throw new Exception("Error al eliminar el cliente");
		}
	}
	public static Cliente saveCliente(Cliente cliente,String token) throws Exception {
		Response<Cliente> response = clienteApiService.createUsuario(cliente,"Bearer "+token).execute();
		if(response.isSuccessful()) {
			return response.body();
		}else{
			throw new Exception("Error al guardar el cliente");
		}
	}
	public Cliente updateCliente(Integer idCliente, Cliente cliente, String token) throws Exception {
		Response<Cliente> response = clienteApiService.updateUsuario(idCliente, cliente,"Bearer "+token).execute();
		if(response.isSuccessful()) {
			return response.body();
		}else{
			throw new Exception("Error al actualizar el cliente");
		}
	}
	public static Cliente buscarClientePorId(Integer id,String token) throws Exception {
		Response<Cliente> response = clienteApiService.getUsuarioById(id,"Bearer "+token).execute();
		if(response.isSuccessful()) {
			return response.body();
		}else{
			throw new Exception("Error al buscar el cliente");
		}
	}
}
