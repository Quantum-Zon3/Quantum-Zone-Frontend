package apiCliente;

import apiService.ConsolaApiService;
import apiService.VideojuegoRentadoApiService;
import modelo.*;
import java.io.IOException;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

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
	
	public static List<VideojuegoRentado> listarVideojuegosRentados() {
		try {
			Response<List<VideojuegoRentado>> response = videoRService.getAllVideojuegosRentados().execute();
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
	
	public static VideojuegoRentado buscarVideojuegoRentadoPorId(String id) {
		try {
			Response<VideojuegoRentado> response = videoRService.getVideojuegoRentadoById(id).execute();
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
	
	public static VideojuegoRentado crearVideojuegoRentado(VideojuegoRentado videojuegoRentado) {
		try {
			Response<VideojuegoRentado> response = videoRService.crearVideojuegoRentado(videojuegoRentado).execute();
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
	
	public static void updateVideojuegoRentado(String id, VideojuegoRentado videojuegoRentado) throws Exception {
			Response<VideojuegoRentado> response = videoRService.updateVideojuegoRentado(id, videojuegoRentado).execute();
        if(response.isSuccessful()){
            System.out.println("Consola actualizada");
        }
        else{
            throw new IOException("Error al actualizar la consola");
        }    
	}
	
	public static void eliminarVideojuegoRentado(String id) throws Exception {
		Response<Void> response = videoRService.deleteVideojuegoRentado(id).execute();
		if(response.isSuccessful()) {
			System.out.println("Consola eliminada con exito");
		}else{
			throw new Exception("Error al eliminar la consola");
		}
	}
	
	public static List<VideojuegoRentado> buscarVideojuegosRentados(String id, String cedula, VideoJuego videojuego, LocalDate fechaDeAlquiler, LocalDate fechaDeDevolucion) {
		try {
			Response<List<VideojuegoRentado>> response = videoRService.buscarVideojuegosRentados(id, cedula, videojuego, fechaDeAlquiler, fechaDeDevolucion).execute();
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
	public static List<VideojuegoRentado> buscarVideojuegosRentadosDelCliente(String cedula) {
		try {
			Response<List<VideojuegoRentado>> response = videoRService.buscarVideojuegosRentados(cedula).execute();
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
	
}
