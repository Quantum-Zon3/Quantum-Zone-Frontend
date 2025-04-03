package apiService;

import java.util.List;
import modelo.Administrador;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;


public interface AdministradorApiService {
		@GET("/quantumZone/administrador")
		Call<List<Administrador>> getAdministradores(@Header("Authorization") String token);

		@GET("/quantumZone/administrador/{id}")
		Call<Administrador> getAdministradorById(@Path("id") int id, @Header("Authorization") String token);

		@GET("/quantumZone/administrador/auth")
		Call<Administrador> getrAuthAdministrador(@Header("Authorization") String authToken);	
}

