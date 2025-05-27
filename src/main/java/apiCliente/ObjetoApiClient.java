/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apiCliente;
import apiService.ObjetoApiService;
import modelo.*;
import java.io.IOException;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.List;

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

/**
 *
 * @author DARIO LOPEZ
 */
public class ObjetoApiClient {
	private static final String BASE_URL = "http://localHost:8080";
	private static ObjetoApiService objetoApiService;

	public ObjetoApiClient() {
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

			objetoApiService = retrofit.create(ObjetoApiService.class);
	}

	public List<Objeto> obtenerObjetos(String token) throws IOException {
		try {
			Response<List<Objeto>> response = objetoApiService.getAllObjetos(token).execute();
			if (response.isSuccessful()) {
				return response.body();
			} else {
				System.out.println("Error " + response.code());
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return null;
	}

	public Objeto obtenerObjetoPorId(String id,String token) throws IOException {
		try {
			Response<Objeto> response = objetoApiService.getObjetoById(id,token).execute();
			if (response.isSuccessful()) {
				return response.body();
			} else {
				System.out.println("Error " + response.code());
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return null;
	}
	public Objeto crearObjeto(Objeto objeto,String token) throws IOException {
		try {
			Response<Objeto> response = objetoApiService.createObjeto(objeto,token).execute();
			if (response.isSuccessful()) {
				return response.body();
			} else {
				System.out.println("Error " + response.code());
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return null;
	}
	public Objeto actualizarObjeto(String id, Objeto objeto,String token) throws Exception {
		try {
			Response<Objeto> response = objetoApiService.updateObjeto(id, objeto, token).execute();
			if (response.isSuccessful()) {
				return response.body();
			} else {
				 if (response.code() == 404) {
			            throw new Exception("Objeto no encontrado");
			        } else {	
			            throw new Exception("Error al actualizar el objeto: " + response.code());
			        }
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return null;
	}
	public void eliminarObjeto(String id,String token) throws IOException {
		try {
			Response<Void> response = objetoApiService.deleteObjeto(id,token).execute();
			if (response.isSuccessful()) {
				System.out.println("Objeto eliminado con éxito");
			} else {
				System.out.println("Error " + response.code());
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	public static List<Objeto> buscarObjetos(String categoria,String token) throws IOException {
		try {
			Response<List<Objeto>> response = objetoApiService.buscarObjetos(categoria,token).execute();
			if (response.isSuccessful()) {
				return response.body();
			} else {
				System.out.println("Error " + response.code());
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return null;
	}
	

}
