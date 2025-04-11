package apiCliente;
import java.io.IOException;
import java.lang.reflect.Type;
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

import modelo.VideoJuego;
import apiService.PuestoApiService;
import apiService.VideojuegoApiService;
import java.time.LocalDate;
import modelo.Puesto;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PuestoApiClient {
	private static final String BASE_URL = "http://localhost:8080";
	private static PuestoApiService puestoApiService;
	
	public PuestoApiClient() {
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

		puestoApiService = retrofit.create(PuestoApiService.class);

	}
	public static List<Puesto> buscarPuestos(String numeroDePuesto) throws Exception {
		Response<List<Puesto>> puesto = puestoApiService.buscarPuestos(numeroDePuesto).execute();
		if (puesto.isSuccessful()) {
			if (puesto.body() == null) {
				throw new Exception("Puesto no encontrado");
			}
			return puesto.body();
		} else {
			throw new Exception("Datos Incorrectos");
		}
	}
	public static List<Puesto> listarPuestos() {
		try {
			Response<List<Puesto>> response = puestoApiService.getAllPuestos().execute();
			if (response.isSuccessful()) {
				return response.body();
			} else {
				System.out.println("Error" + response.code());
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return null;
	}
	public static Puesto buscarPuestoPorId(String id) throws Exception {
		Response<Puesto> puesto = puestoApiService.getPuestoById(id).execute();
		if (puesto.isSuccessful()) {
			if (puesto.body() == null) {
				throw new Exception("Puesto no encontrado");
			}
			return puesto.body();
		} else {
			throw new Exception("Datos Incorrectos");
		}
	}
	private static Puesto crearPuesto(Puesto puesto) throws Exception {
		try {
			Response<Puesto> response = puestoApiService.createPuesto(puesto).execute();
			if (response.isSuccessful()) {
				return response.body();
			} else {
				System.out.println("Error" + response.code());
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return null;
	}
	private static void eliminarPuesto(String id) throws Exception {
		try {
			Response<Void> response = puestoApiService.deletePuesto(id).execute();
			if (response.isSuccessful()) {
				System.out.println("Puesto eliminado con éxito");
			} else {
				System.out.println("Error" + response.code());
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	public static Puesto actualizarPuesto(String id, Puesto puesto) throws Exception {
		try {
			Response<Puesto> response = puestoApiService.updatePuesto(id, puesto).execute();
			if (response.isSuccessful()) {
				return response.body();
			} else {
				System.out.println("Error" + response.code());
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return null;
	}
}
