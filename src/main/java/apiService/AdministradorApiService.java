package apiService;

import java.util.List;
import modelo.*;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface AdministradorApiService {
		@GET("/quantumZone/administradores")
		Call<List<Administrador>> getAdministradores();

		@GET("/quantumZone/administradores/{id}")
		Call<Administrador> getAdministradorById(@Path("id") String id);

		@GET("/quantumZone/administradores/auth")
		Call<Administrador> getrAuthAdministrador();	
		
		@GET("/quantumZone/administradores/filtros")
	    Call<List<Administrador>> buscarAdministradores(
	        //@Query("id") String id,
	        //@Query("nombre") String nombre,
	        //@Query("edad") int edad,
	        //@Query("direccion") String direccion,
	        @Query("cedula") String cedula
	        //@Query("telefono") String telefono,
	        //@Query("fechaRegistro") String fechaRegistro,
	        //@Query("email") String email
	        
	    );
		@POST("/quantumZone/administradores/login")
		Call<LoginResponse> loginAdministrador(@Body LoginRequest loginRequest);
}

