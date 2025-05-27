
package modelo;
import java.util.UUID;
/**
 *
 */
public class Administrador {
	private Integer id;
    private String nombre;
    private String contraseña;
    private int edad;
    private String cedula;

    public Administrador(String nombre, String contraseña, int edad, String cedula) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.edad = edad;
        this.cedula = cedula;
    }
    public Administrador() {
		
	}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    public Integer getId() {
		return id;
	}
    public void setId(Integer id) {
    	this.id = id;
    }
    
   
	
	@Override
	public String toString() {
		return "Administrador{" +
				"nombre='" + nombre + '\'' +
				", contraseña='" + contraseña + '\'' +
				", edad=" + edad +
				", cedula='" + cedula + '\'' +
				'}';
	}
    
}
