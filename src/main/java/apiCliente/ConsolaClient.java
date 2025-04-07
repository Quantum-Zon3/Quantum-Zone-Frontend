package apiCliente;

import apiService.ConsolaApiService;
import modelo.*;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ConsolaClient {

    private static final String BASE_URL = "http://localHost:8080";
    private static ConsolaApiService consolaService;

    public ConsolaClient() {
        // Configurar Retrofit
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        consolaService = retrofit.create(ConsolaApiService.class);
    }

    public void createConsola(Consola consola) {
        try {
            Response<Consola> response = consolaService.createConsola(consola).execute();
            if (response.isSuccessful()) {
                System.out.println("Consola creada exitosamente: " + response.body());
            } else {
                System.out.println("Error: " + response.code());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Consola buscarConsola(String id) throws Exception {
        Response<Consola> response = consolaService.getConsolaById(id).execute();
        if (response.isSuccessful()) {
            System.out.println(response.body());
            return response.body();
        } else {
            System.out.println("Usuario no encontrado: " + response.code());
            throw new Exception("No se ha encontrado una consola");
        }
    }
}
