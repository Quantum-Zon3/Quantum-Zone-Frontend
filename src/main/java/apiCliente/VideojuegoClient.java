package apiCliente;

import java.io.IOException;
import java.lang.reflect.Type;
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

import modelo.VideoJuego;

import apiService.VideojuegoApiService;
import java.time.LocalDate;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class VideojuegoClient {
	private static final String BASE_URL = "http://localhost:8080";
	private static VideojuegoApiService videojuegoApiService;

	public VideojuegoClient() {
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
		videojuegoApiService = retrofit.create(VideojuegoApiService.class);

	}

	public static List<VideoJuego> listarVideojuego(String token) {
		try {
			Response<List<VideoJuego>> response = videojuegoApiService.getAllVideojuegos("Bearer "+token).execute();
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

	public static VideoJuego buscarVideojuegoPorId(String id,String token) throws Exception {
		Response<VideoJuego> videojuego = videojuegoApiService.getVideojuegoById(id,"Bearer "+token).execute();
		if (videojuego.isSuccessful()) {
			if (videojuego.body() == null) {
				throw new Exception("Videojuego no encontrado");
			}
			return videojuego.body();
		} else {
			throw new Exception("Datos Incorrectos");
		}
	}

	public static VideoJuego crearVideojuego(VideoJuego videojuego,String token) throws Exception {
		try {
			Response<VideoJuego> response = videojuegoApiService.createVideojuego(videojuego,"Bearer "+token).execute();
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

	public static void eliminarVideojuego(String id,String token) throws Exception {

		try {
			Response<Void> response = videojuegoApiService.deleteVideojuego(id,"Bearer "+token).execute();
			if (response.isSuccessful()) {
				System.out.println("Videojuego eliminado");
			} else {
				System.out.println("Error " + response.code());
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	public static VideoJuego actualizarVideojuego(String id, VideoJuego videojuego, String token) throws Exception {
		try {
			Response<VideoJuego> response = videojuegoApiService.updateVideojuego(id, videojuego,"Bearer "+ token).execute();
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
