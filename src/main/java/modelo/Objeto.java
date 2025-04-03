package modelo;

import java.util.UUID;

/**
 *
 * @author shadow111285
 */
public class Objeto {
	private String id;
    private String nombre;
    private String descripcion;
    private String fecha;
    private String estado;
    private String Categoria;

    public Objeto(String nombre, String descripcion, String fecha, String estado, String categoria) {
		this.id = UUID.randomUUID().toString();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fecha = fecha;
		this.estado = estado;
		Categoria = categoria;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCategoria() {
		return Categoria;
	}

	public void setCategoria(String categoria) {
		Categoria = categoria;
	}

	@Override
	public String toString() {
		return "Objeto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", fecha=" + fecha
				+ ", estado=" + estado + ", Categoria=" + Categoria + "]";
	}
    
    
    
    
    
}
