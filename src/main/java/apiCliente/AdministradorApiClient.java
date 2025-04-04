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
	private static final String BASE_URL = "http://localHost:8080/quantumZone/";
	private static AdministradorApiService administradorApiService;
	private static Scanner scanner;
	
	public static void main(String[] args) {
		// Configurar Retrofit
		Retrofit retrofit = new Retrofit.Builder()
				.baseUrl(BASE_URL)
				.addConverterFactory(GsonConverterFactory.create())
				.build();

		administradorApiService = retrofit.create(AdministradorApiService.class);
		scanner = new Scanner(System.in);

		int opcion;
		do {
			System.out.println("Escoja un opción"+
					"\n"+ "1. Listar Administradores"+
					"\n + Buscar Administrador por id"+
					"\n"+ "0. Finalizar");
			opcion = scanner.nextInt();
			

			switch (opcion) {
				case 1:
					listarAdministradores();
					break;
				case 2:
					buscarAdministradorPorId();
					break;
				case 3:
					//autenticarAdministrador();
					break;
				case 0:
					System.out.println("Gracias por usar el sistema.");
					break;
				default:
					System.out.println("Seleccione una opción válida.");
			}
		} while (opcion != 0);
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
	private static void buscarAdministradorPorId() {
		System.out.println("Ingrese una id");
		int id = scanner.nextInt(); 
		try {
			Response<Administrador> admin = administradorApiService.getAdministradorById(id).execute();
			if(admin.isSuccessful()) {
				System.out.println(admin.body());
			}else {
				System.out.println("Error "+ admin.code());
			}
			
		}catch(IOException e) {
			e.printStackTrace();
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
