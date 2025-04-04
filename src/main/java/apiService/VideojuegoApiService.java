package apiService;

import java.util.List;
import modelo.Videojuego;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface VideojuegoApiService {

	@GET("/quantumZone/videojuegos")
	Call<List<Videojuego>> getAllVideojuegos();

	@GET("/quantumZone/videojuegos/{id}")
	Call<Videojuego> getVideojuegoById(@Path("id") String id);

	@POST("/quantumZone/videojuegos")
	Call<Videojuego> createVideojuego(@Body Videojuego videojuego);

	@PUT("/quantumZone/videojuegos/{id}")
	Call<Videojuego> updateVideojuego(@Path("id") String id, @Body Videojuego videojuego);

	@DELETE("/quantumZone/videojuegos/{id}")
	Call<Void> deleteVideojuego(@Path("id") String id);

	@GET("/quantumZone/videojuegos/buscar")
	Call<List<Videojuego>> buscarVideojuegos(@Query("id") String id,
			@Query("nombre") String nombre,
			@Query("marca") String marca, 
			@Query("modelo") String modelo, 
			@Query("precio") double precio,
			@Query("fechaRegistro") String fechaRegistro
			
	);
}
