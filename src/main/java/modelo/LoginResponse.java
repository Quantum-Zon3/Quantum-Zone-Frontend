package modelo;

public class LoginResponse {
	private String token;
	private String cedula;
	private String nombre;

	public LoginResponse(String token, String cedula, String nombre) {
		this.token = token;
		this.cedula = cedula;
		this.nombre = nombre;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}