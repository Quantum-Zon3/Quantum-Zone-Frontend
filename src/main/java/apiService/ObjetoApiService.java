package apiService;

import java.util.List;
import modelo.Objeto;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ObjetoApiService {
	
	@GET("/quantumZone/objetos")
	Call<List<Objeto>> getAllObjetos(@Header("Authorization") String token);

	@GET("/quantumZone/objetos/{id}")
	Call<Objeto> getObjetoById(@Path("id") String id,	@Header("Authorization") String token);

	@POST("/quantumZone/objetos")
	Call<Objeto> createObjeto(@Body Objeto objeto, @Header("Authorization") String token);

	@PUT("/quantumZone/objetos/{id}")
	Call<Objeto> updateObjeto(@Path("id") String id, @Body Objeto objeto, @Header("Authorization") String token);

	@DELETE("/quantumZone/objetos/{id}")
	Call<Void> deleteObjeto(@Path("id") String id, @Header("Authorization") String token);

	@GET("/quantumZone/objetos/filtros")
	Call<List<Objeto>> buscarObjetos(
		@Header("Authorization") String token,
		//@Query("id") String id,
		//@Query("nombre") String nombre,
		//@Query("marca") String marca,
		//@Query("modelo") String modelo,
		//@Query("precio") double precio,
		@Query("categoria") String categoria
	);
}
