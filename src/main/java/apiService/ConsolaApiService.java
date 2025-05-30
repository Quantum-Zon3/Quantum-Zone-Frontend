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
	Call<List<Consola>> getAllConsolas(@Header("Authorization") String token);

	@GET("/quantumZone/consolas/{id}")
	Call<Consola> getConsolaById(@Path("id") Integer id, @Header("Authorization") String token);

	@POST("/quantumZone/consolas")
	Call<Consola> createConsola(@Body Consola consola, @Header("Authorization") String token);

	@PUT("/quantumZone/consolas/{id}")
	Call<Consola> updateConsola(@Path("id") Integer id, @Body Consola consola, @Header("Authorization") String token);

	@DELETE("/quantumZone/consolas/{id}")
	Call<Void> deleteConsola(@Path("id") Integer id, @Header("Authorization") String token);

	@GET("/quantumZone/consolas/buscar")
	Call<List<Consola>> buscarConsolasPorNombre(
			@Query("nombre") String nombre
	);
}
