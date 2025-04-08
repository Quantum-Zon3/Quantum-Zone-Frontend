package apiCliente;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
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
		// Configurar Retrofit
		Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create())
				.build();

		videojuegoApiService = retrofit.create(VideojuegoApiService.class);

	}

	private static List<VideoJuego> listarVideojuego() {
		try {
			Response<List<VideoJuego>> response = videojuegoApiService.getAllVideojuegos().execute();
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

	public static VideoJuego buscarVideojuegoPorId(String id) throws Exception {
		Response<VideoJuego> videojuego = videojuegoApiService.getVideojuegoById(id).execute();
		if (videojuego.isSuccessful()) {
			if (videojuego.body() == null) {
				throw new Exception("Videojuego no encontrado");
			}
			return videojuego.body();
		} else {
			throw new Exception("Datos Incorrectos");
		}
	}

	private static VideoJuego crearVideojuego(VideoJuego videojuego) throws Exception {
		try {
			Response<VideoJuego> response = videojuegoApiService.createVideojuego(videojuego).execute();
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

	private static void eliminarVideojuego(String id) throws Exception {

		try {
			Response<Void> response = videojuegoApiService.deleteVideojuego(id).execute();
			if (response.isSuccessful()) {
				System.out.println("Videojuego eliminado");
			} else {
				System.out.println("Error " + response.code());
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	private static VideoJuego actualizarVideojuego(String id, VideoJuego videojuego) throws Exception {
		try {
			Response<VideoJuego> response = videojuegoApiService.updateVideojuego(id, videojuego).execute();
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
