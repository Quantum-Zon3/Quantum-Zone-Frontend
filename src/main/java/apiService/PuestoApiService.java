package apiService;

import java.util.List;
import modelo.Puesto;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface PuestoApiService {

	@GET("/quantumZone/puestos")
	Call<List<Puesto>> getAllPuestos(@Header("Authorization") String token);

	@GET("/quantumZone/puestos/{id}")
	Call<Puesto> getPuestoById(@Path("id") String id, @Header("Authorization") String token);

	@POST("/quantumZone/puestos")
	Call<Puesto> createPuesto(@Body Puesto puesto, @Header("Authorization") String token);

	@PUT("/quantumZone/puestos/{id}")
	Call<Puesto> updatePuesto(@Path("id") String id, @Body Puesto puesto, @Header("Authorization") String token);

	@DELETE("/quantumZone/puestos/{id}")
	Call<Void> deletePuesto(@Path("id") String id, @Header("Authorization") String token);

	@GET("/quantumZone/puestos/buscar")
	Call<Puesto> buscarPuestos(
			@Header("Authorization") String token,
			@Query("numeroDePuesto") String numeroDePuesto
	);

}
