/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apiCliente;
import apiService.ObjetoApiService;
import modelo.*;
import java.io.IOException;
import java.util.List;
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
		Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create())
				.build();
		objetoApiService = retrofit.create(ObjetoApiService.class);
	}

	public List<Objeto> obtenerObjetos() throws IOException {
		try {
			Response<List<Objeto>> response = objetoApiService.getAllObjetos().execute();
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

	public Objeto obtenerObjetoPorId(String id) throws IOException {
		try {
			Response<Objeto> response = objetoApiService.getObjetoById(id).execute();
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
	public Objeto crearObjeto(Objeto objeto) throws IOException {
		try {
			Response<Objeto> response = objetoApiService.createObjeto(objeto).execute();
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
	public Objeto actualizarObjeto(String id, Objeto objeto) throws IOException {
		try {
			Response<Objeto> response = objetoApiService.updateObjeto(id, objeto).execute();
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
	public void eliminarObjeto(String id) throws IOException {
		try {
			Response<Void> response = objetoApiService.deleteObjeto(id).execute();
			if (response.isSuccessful()) {
				System.out.println("Objeto eliminado con éxito");
			} else {
				System.out.println("Error " + response.code());
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	public static List<Objeto> buscarObjetos(String categoria) throws IOException {
		try {
			Response<List<Objeto>> response = objetoApiService.buscarObjetos(categoria).execute();
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
