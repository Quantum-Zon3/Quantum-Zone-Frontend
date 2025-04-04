package apiService;

import java.util.List;
import modelo.Cliente;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ClienteApiService {
	
	@GET("/quantumZone/clientes")
    Call<List<Cliente>> getAllUsuarios();

    @GET("/quantumZone/clientes/{id}")
    Call<Cliente> getUsuarioById(@Path("id") String id);

    @POST("/quantumZone/clientes")
    Call<Cliente> createUsuario(@Body Cliente usuario);

    @PUT("/quantumZone/clientes/{id}")
    Call<Cliente> updateUsuario(@Path("id") String id, @Body Cliente usuario);

    @DELETE("/quantumZone/clientes/{id}")
    Call<Void> deleteUsuario(@Path("id") String id);

    @GET("/quantumZone/clientes/buscar")
    Call<List<Cliente>> buscarUsuarios(
        @Query("id") String id,
        @Query("nombre") String nombre,
        @Query("edad") int edad,
        @Query("direccion") String direccion,
        @Query("cedula") String cedula,
        @Query("telefono") String telefono,
        @Query("fechaRegistro") String fechaRegistro,
        @Query("email") String email
        
    );

    @GET("/quantumZone/clientes/auth")
    Call<Cliente> getUserByToken(@Header("Authorization") String authToken);
}

