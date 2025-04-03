package apiService;

import java.util.List;
import modelo.Administrador;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;


public interface AdministradorApiService {
		@GET("/quantumZone/administradores")
		Call<List<Administrador>> getAdministradores();

		@GET("/quantumZone/administradores/{id}")
		Call<Administrador> getAdministradorById(@Path("id") int id);

		@GET("/quantumZone/administradores/auth")
		Call<Administrador> getrAuthAdministrador();	
}

