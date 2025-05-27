package modelo;
import java.time.LocalDate;

import modelo.*;

public class VideojuegoRentado {
        private Integer id;
	private Integer idCliente;
	private Integer idVideojuego;
	private LocalDate fechaAlquiler;
	private LocalDate fechaDevolucion;
	
	public VideojuegoRentado(Integer idCliente, Integer idVideojuego, LocalDate fechaAlquiler, LocalDate fechaDevolucion) {
		this.idCliente = idCliente;
		this.idVideojuego = idVideojuego;
		this.fechaAlquiler = fechaAlquiler;
		this.fechaDevolucion = fechaDevolucion;
	}

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdVideojuego() {
        return idVideojuego;
    }

    public void setIdVideojuego(Integer idVideojuego) {
        this.idVideojuego = idVideojuego;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "VideojuegoRentado{" + "id=" + id + ", cliente=" + idCliente + ", videojuego=" + idVideojuego + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion=" + fechaDevolucion + '}';
    }

    
	
    
	
}
