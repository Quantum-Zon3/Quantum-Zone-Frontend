package apiService;

import modelo.Consola;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ConsolaApiService {
	@GET("/quantumZone/consolas")
	Call<List<Consola>> getAllConsolas();

	@GET("/quantumZone/consolas/{id}")
	Call<Consola> getConsolaById(@Path("id") String id);

	@POST("/quantumZone/consolas")
	Call<Consola> createConsola(@Body Consola consola);

	@PUT("/quantumZone/consolas/{id}")
	Call<Consola> updateConsola(@Path("id") String id, @Body Consola consola);

	@DELETE("/quantumZone/consolas/{id}")
	Call<Void> deleteConsola(@Path("id") String id);

	@GET("/quantumZone/consolas/buscar")
	Call<List<Consola>> buscarConsolas(
		@Query("id") String id,
		@Query("nombre") String nombre,
		@Query("marca") String marca,
		@Query("modelo") String modelo,
		@Query("precio") double precio,
		@Query("fechaRegistro") String fechaRegistro
	);
}
