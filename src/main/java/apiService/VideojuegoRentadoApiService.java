package apiService;

import java.time.LocalDate;
import java.util.List;

import modelo.Cliente;
import modelo.Puesto;
import modelo.VideoJuego;
import modelo.VideojuegoRentado;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface VideojuegoRentadoApiService {
	@GET("/quantumZone/videojuegos/rentados")
	Call<List<VideojuegoRentado>> getAllVideojuegosRentados(@Header("Authorization") String token);

	@GET("/quantumZone/videojuegos/rentados/{id}")
	Call<VideojuegoRentado> getVideojuegoRentadoById(@Path("id") Integer id,@Header("Authorization") String token);

	@POST("/quantumZone/videojuegos/rentados")
	Call<VideojuegoRentado> crearVideojuegoRentado(@Body VideojuegoRentado videojuegoRentado,@Header("Authorization") String token);

	@PUT("/quantumZone/videojuegos/rentados/{id}")
	Call<VideojuegoRentado> updateVideojuegoRentado(@Path("id") Integer id, @Body VideojuegoRentado videojuegoRentado,@Header("Authorization") String token);

	@DELETE("/quantumZone/videojuegos/rentados/{id}")
	Call<Void> deleteVideojuegoRentado(@Path("id") Integer id,@Header("Authorization") String token);

	@GET("/quantumZone/videojuegos/rentados/filtros")
	Call<List<VideojuegoRentado>> buscarVideojuegosRentados(
			@Query("idCliente") Integer idCliente,
			@Header("Authorization") String token
	);
			
}
