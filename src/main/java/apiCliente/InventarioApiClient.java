package apiCliente;
import java.io.IOException;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import apiService.InventarioApiService;
import modelo.*;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
public class InventarioApiClient {
	private static final String BASE_URL = "http://localHost:8080";
	private static InventarioApiService inventarioApiService;
	
	public InventarioApiClient() {
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
		inventarioApiService = retrofit.create(InventarioApiService.class);
	}
	// Obtener todos los inventarios
	public List<Inventario> obtenerInventarios() throws IOException {
		try {
			Response<List<Inventario>> response = inventarioApiService.getAllInventarios().execute();
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
	public Inventario obtenerInventarioPorId(String id) throws IOException {
		try {
			Response<Inventario> response = inventarioApiService.getInventarioById(id).execute();
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
	public List<Consola> obtenerConsolas() throws IOException {
		try {
			Response<List<Consola>> response = inventarioApiService.getConsolas().execute();
			if (response.isSuccessful()) {
				return response.body();
			} else {
				System.out.println("Error " + response.code());
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return new ArrayList<>();
	}

	public List<VideoJuego> obtenerVideoJuegos() throws IOException {
		try {
			Response<List<VideoJuego>> response = inventarioApiService.getVideoJuegos().execute();
			if (response.isSuccessful()) {
				return response.body();
			} else {
				System.out.println("Error " + response.code());
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return new ArrayList<>();
	}

	public List<Objeto> obtenerObjetos() throws IOException {
		try {
			Response<List<Objeto>> response = inventarioApiService.getObjetos().execute();
			if (response.isSuccessful()) {
				return response.body();
			} else {
				System.out.println("Error " + response.code());
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return new ArrayList<>();
	}

	public List<Puesto> obtenerPuestos() throws IOException {
		try {
			Response<List<Puesto>> response = inventarioApiService.getPuestos().execute();
			if (response.isSuccessful()) {
				return response.body();
			} else {
				System.out.println("Error " + response.code());
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return new ArrayList<>();
	}
}
