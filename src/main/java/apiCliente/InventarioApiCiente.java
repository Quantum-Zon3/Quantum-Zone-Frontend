package apiCliente;
import java.io.IOException;
import java.util.List;

import apiService.InventarioApiService;
import modelo.Inventario;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
public class InventarioApiCiente {
	private static final String BASE_URL = "http://localHost:8080";
	private static InventarioApiService inventarioApiService;
	
	public InventarioApiCiente() {
		Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create())
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
}
