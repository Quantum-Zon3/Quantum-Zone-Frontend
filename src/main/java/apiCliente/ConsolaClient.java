package apiCliente;

import apiService.ConsolaApiService;
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

public class ConsolaClient {

    private static final String BASE_URL = "http://localHost:8080";
    private static ConsolaApiService consolaService;

    public ConsolaClient() {
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

        consolaService = retrofit.create(ConsolaApiService.class);
    }
    
    public static List<Consola> listarConsola() {
		try {
			Response<List<Consola>> response = consolaService.getAllConsolas().execute();
			if(response.isSuccessful()){
				return response.body();
			}else {
				System.out.println("Error " + response.code());
			}
			
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		return null;
	}

    public void createConsola(Consola consola) {
        try {
            Response<Consola> response = consolaService.createConsola(consola).execute();
            if (response.isSuccessful()) {
                System.out.println("Consola creada exitosamente: " + response.body());
            } else {
                System.out.println("Error: " + response.code());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Consola buscarConsola(String id) throws Exception {
        Response<Consola> response = consolaService.getConsolaById(id).execute();
        if (response.isSuccessful()) {
            System.out.println(response.body());
            return response.body();
        } else {
            System.out.println("Consola no encontrada: " + response.code());
            throw new Exception("No se ha encontrado una consola");
        }
    }
    
    public static void eliminarConsola(String id) throws Exception {
		Response<Void> response = consolaService.deleteConsola(id).execute();
		if(response.isSuccessful()) {
			System.out.println("Consola eliminada con exito");
		}else{
			throw new Exception("Error al eliminar la consola");
		}
	}
    
    public static void actualizarConsola(String id, Consola consola) throws Exception {
        Response<Consola> response = consolaService.updateConsola(id, consola).execute();
        if(response.isSuccessful()){
            System.out.println("Consola actualizada");
        }
        else{
            throw new Exception("Error al actualizar la consola");
                    }
        
    }
}
