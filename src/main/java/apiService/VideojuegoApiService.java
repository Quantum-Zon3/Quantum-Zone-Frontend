package apiService;

import java.util.List;
import modelo.VideoJuego;
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
	Call<List<VideoJuego>> getAllVideojuegos(@Header("Authorization") String token);

	@GET("/quantumZone/videojuegos/{id}")
	Call<VideoJuego> getVideojuegoById(@Path("id") String id, @Header("Authorization") String token);

	@POST("/quantumZone/videojuegos")
	Call<VideoJuego> createVideojuego(@Body VideoJuego videojuego, @Header("Authorization") String token);

	@PUT("/quantumZone/videojuegos/{id}")
	Call<VideoJuego> updateVideojuego(@Path("id") String id, @Body VideoJuego videojuego, @Header("Authorization") String token);

	@DELETE("/quantumZone/videojuegos/{id}")
	Call<Void> deleteVideojuego(@Path("id") String id, @Header("Authorization") String token);

	@GET("/quantumZone/videojuegos/buscar")
	Call<List<VideoJuego>> buscarVideojuegos(@Header("Authorization") String token,
			@Query("nombre") String nombre
			//@Query("marca") String marca, 
			//@Query("modelo") String modelo, 
			//@Query("precio") double precio,
			//@Query("fechaRegistro") String fechaRegistro
			
	);
}
