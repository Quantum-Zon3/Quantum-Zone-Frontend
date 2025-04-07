package apiCliente;

import apiService.AdministradorApiService;
import modelo.*;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AdministradorApiClient {
	private static final String BASE_URL = "http://localHost:8080";
	private static AdministradorApiService administradorApiService;
	
	public AdministradorApiClient() {
		// Configurar Retrofit
		Retrofit retrofit = new Retrofit.Builder()
				.baseUrl(BASE_URL)
				.addConverterFactory(GsonConverterFactory.create())
				.build();

		administradorApiService = retrofit.create(AdministradorApiService.class);
        }	
	
	private static void listarAdministradores() {
		try {
			Response<List<Administrador>> response = administradorApiService.getAdministradores().execute();
			if(response.isSuccessful()){
				List <Administrador> admins = response.body();
				admins.forEach(admin -> System.out.println(admin));
			}else {
				System.out.println("Error " + response.code());
			}
			
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		
	}
	public static Administrador loggearAdmin(String id) throws Exception {
			Response<Administrador> admin = administradorApiService.getAdministradorById(id).execute();
			if(admin.isSuccessful()) {
				return admin.body();
                        }else{
                            throw new Exception("Datos Incorrectos");
                        }
	}
	private static void buscarAdministradorPorToken() {
		/*System.out.println("Introduzca el token");
		int id = scanner.nextInt();
		try {
			Response<Administrador> admin = null;
			
		}catch(IOException e) {
			e.printStackTrace();
		}*/
	}
	
}
