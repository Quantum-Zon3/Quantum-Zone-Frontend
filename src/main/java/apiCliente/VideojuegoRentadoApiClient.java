package apiCliente;

import apiService.ConsolaApiService;
import apiService.VideojuegoRentadoApiService;
import modelo.*;
import java.io.IOException;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class VideojuegoRentadoApiClient {

	private static final String BASE_URL = "http://localHost:8080";
	private static VideojuegoRentadoApiService videoRService;
	
	public VideojuegoRentadoApiClient() {
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
    			.addConverterFactory(GsonConverterFactory.create(gson)) // 👈 Este Gson sí importa
    			.build();

        videoRService = retrofit.create(VideojuegoRentadoApiService.class);
    }
	
	public static List<VideojuegoRentado> listarVideojuegosRentados(String token) {
		try {
			Response<List<VideojuegoRentado>> response = videoRService.getAllVideojuegosRentados("Bearer "+token).execute();
			if(response.isSuccessful()){
				return response.body();
			}else {
				System.out.println("Error " + response.code());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static VideojuegoRentado buscarVideojuegoRentadoPorId(String id,String token) {
		try {
			Response<VideojuegoRentado> response = videoRService.getVideojuegoRentadoById(id,"Bearer "+token).execute();
			if(response.isSuccessful()){
				return response.body();
			}else {
				System.out.println("Error " + response.code());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static VideojuegoRentado crearVideojuegoRentado(VideojuegoRentado videojuegoRentado,String token) {
		try {
			Response<VideojuegoRentado> response = videoRService.crearVideojuegoRentado(videojuegoRentado,"Bearer "+ token).execute();
			if(response.isSuccessful()){
				return response.body();
			}else {
				System.out.println("Error " + response.code());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void updateVideojuegoRentado(String id, VideojuegoRentado videojuegoRentado, String token) throws Exception {
			Response<VideojuegoRentado> response = videoRService.updateVideojuegoRentado(id, videojuegoRentado,"Bearer "+ token).execute();
        if(response.isSuccessful()){
            System.out.println("Consola actualizada");
        }
        else{
            throw new IOException("Error al actualizar la consola");
        }    
	}
	
	public static void eliminarVideojuegoRentado(String id, String token) throws Exception {
		Response<Void> response = videoRService.deleteVideojuegoRentado(id,"Bearer "+ token).execute();
		if(response.isSuccessful()) {
			System.out.println("Consola eliminada con exito");
		}else{
			throw new Exception("Error al eliminar la consola");
		}
	}
	public static Integer buscarClientePorCedula(String Cedula, String token) throws Exception {
		Cliente cliente = ClienteApiClient.buscarClientePorCedula(Cedula,"Bearer "+ token);
			return cliente != null ? cliente.getId() : null;
	}
	
	public static List<VideojuegoRentado> buscarVideojuegosRentadosDelCliente(String cedula, String token) {
		try {
			Integer idCliente = buscarClientePorCedula(cedula,"Bearer "+ token);
			if (idCliente == null) {
				JOptionPane.showMessageDialog(null, "Cliente no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
				return null;
			}
			Response<List<VideojuegoRentado>> response = videoRService.buscarVideojuegosRentados(idCliente,"Bearer "+ token).execute();
			if(response.isSuccessful()){
				return response.body();
			}else {
				JOptionPane.showMessageDialog(null,"Error " + response.code());
			}
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Error al buscar el videojuego", "Error", JOptionPane.ERROR_MESSAGE);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al buscar el cliente", "Error", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
		return null;
	}
	
	
}
