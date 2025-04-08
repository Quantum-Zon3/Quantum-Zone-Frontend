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
	Call<List<Puesto>> getAllPuestos();

	@GET("/quantumZone/puestos/{id}")
	Call<Puesto> getPuestoById(@Path("id") String id);

	@POST("/quantumZone/puestos")
	Call<Puesto> createPuesto(@Body Puesto puesto);

	@PUT("/quantumZone/puestos/{id}")
	Call<Puesto> updatePuesto(@Path("id") String id, @Body Puesto puesto);

	@DELETE("/quantumZone/puestos/{id}")
	Call<Void> deletePuesto(@Path("id") String id);

	@GET("/quantumZone/puestos/buscar")
	Call<List<Puesto>> buscarPuestos(
			@Query("id") String id,
			@Query("nombre") String nombre,
			@Query("marca") String marca,
			@Query("modelo") String modelo,
			@Query("precio") double precio,
			@Query("fechaRegistro") String fechaRegistro
	);
}
