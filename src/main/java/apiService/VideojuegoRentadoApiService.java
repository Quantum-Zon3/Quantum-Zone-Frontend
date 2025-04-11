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
	Call<List<VideojuegoRentado>> getAllVideojuegosRentados();

	@GET("/quantumZone/videojuegos/rentados/{id}")
	Call<VideojuegoRentado> getVideojuegoRentadoById(@Path("id") String id);

	@POST("/quantumZone/videojuegos/rentados")
	Call<VideojuegoRentado> crearVideojuegoRentado(@Body VideojuegoRentado videojuegoRentado);

	@PUT("/quantumZone/videojuegos/rentados/{id}")
	Call<VideojuegoRentado> updateVideojuegoRentado(@Path("id") String id, @Body VideojuegoRentado videojuegoRentado);

	@DELETE("/quantumZone/videojuegos/rentados/{id}")
	Call<Void> deleteVideojuegoRentado(@Path("id") String id);


	@GET("/quantumZone/videojuegos/rentados/filtros")
	Call<List<VideojuegoRentado>> buscarVideojuegosRentados(
			@Query("id") String id,
			@Query("cedula") String cedula,
			@Query("Videojuego") VideoJuego videojuego,
			@Query("FechaDeAlquiler") LocalDate modelo,
			@Query("FechaDeDevolucion") LocalDate precio
	);
	@GET("/quantumZone/videojuegos/rentados/filtros")
	Call<List<VideojuegoRentado>> buscarVideojuegosRentados(
			@Query("cedula") String cedula
	);
			
}
