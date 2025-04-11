package apiService;

import java.util.List;
import modelo.Objeto;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ObjetoApiService {
	
	@GET("/quantumZone/objetos")
	Call<List<Objeto>> getAllObjetos();

	@GET("/quantumZone/objetos/{id}")
	Call<Objeto> getObjetoById(@Path("id") String id);

	@POST("/quantumZone/objetos")
	Call<Objeto> createObjeto(@Body Objeto objeto);

	@PUT("/quantumZone/objetos/{id}")
	Call<Objeto> updateObjeto(@Path("id") String id, @Body Objeto objeto);

	@DELETE("/quantumZone/objetos/{id}")
	Call<Void> deleteObjeto(@Path("id") String id);

	@GET("/quantumZone/objetos/filtros")
	Call<List<Objeto>> buscarObjetos(
		//@Query("id") String id,
		//@Query("nombre") String nombre,
		//@Query("marca") String marca,
		//@Query("modelo") String modelo,
		//@Query("precio") double precio,
		@Query("categoria") String categoria
	);
}
