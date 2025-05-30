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
	private static final String BASE_URL = "https://quantumzone3-qz.onrender.com";
	private static PuestoApiService puestoApiService;
	
	public PuestoApiClient() {

		// Configurar Retrofit
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

            puestoApiService = retrofit.create(PuestoApiService.class);

	}
	public static List<Puesto> listarPuestos(String token) {
		try {
			Response<List<Puesto>> response = puestoApiService.getAllPuestos("Bearer "+token).execute();
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
	public static Puesto buscarPuestoPorId(Integer id,String token) throws Exception {
		Response<Puesto> puesto = puestoApiService.getPuestoById(id,"Bearer "+token).execute();
		if (puesto.isSuccessful()) {
			if (puesto.body() == null) {
				throw new Exception("Puesto no encontrado");
			}
			return puesto.body();
		} else {
			throw new Exception("Datos Incorrectos");
		}
	}
	public static Puesto crearPuesto(Puesto puesto,String token) throws Exception {
		try {
			Response<Puesto> response = puestoApiService.createPuesto(puesto,"Bearer "+token).execute();
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
	public static void eliminarPuesto(Integer id,String token) throws Exception {
		try {
			Response<Void> response = puestoApiService.deletePuesto(id,"Bearer "+token).execute();
			if (response.isSuccessful()) {
				System.out.println("Puesto eliminado con éxito");
			} else {
				System.out.println("Error" + response.code());
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	public static Puesto actualizarPuesto(Integer id, Puesto puesto,String token) throws Exception {
		try {
			Response<Puesto> response = puestoApiService.updatePuesto(id, puesto,"Bearer "+ token).execute();
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
	public static Puesto buscarPuestoPorNumero(String numeroDePuesto,String token) throws Exception {
		Response<Puesto> puesto = puestoApiService.buscarPuestos(numeroDePuesto,"Bearer "+token).execute();
		if (puesto.isSuccessful()) {
			if (puesto.body() == null) {
				throw new Exception("Puesto no encontrado");
			}
			return puesto.body();
		} else {
			throw new Exception("Datos Incorrectos");
		}
	}
}
