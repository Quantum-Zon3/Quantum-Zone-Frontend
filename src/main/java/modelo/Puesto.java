

package modelo;
import java.util.UUID;
/**
 *
 * @author shadow111285
 */
public class Puesto {
	private Integer id;
    private String numeroDePuesto;
    private int idConsola;
    private int cantidadDeSillas;
    private int canditadDeControles;
    

    public Puesto(String numeroDePuesto, int idConsola, int cantidadDeSillas, int cantidadDeControles) {
        this.numeroDePuesto = numeroDePuesto;
        this.idConsola = idConsola;
        this.cantidadDeSillas = cantidadDeSillas;
        this.canditadDeControles = cantidadDeControles;
    }

    public String getNumeroDePuesto() {
        return numeroDePuesto;
    }

    public void setNumeroDePuesto(String numeroDePuesto) {
        this.numeroDePuesto = numeroDePuesto;
    }

    public int getConsola() {
        return idConsola;
    }

    public void setConsola(int consola) {
        this.idConsola = consola;
    }

    public int getCantidadDeSillas() {
        return cantidadDeSillas;
    }

    public void setCantidadDeSillas(int cantidadDeSillas) {
        this.cantidadDeSillas = cantidadDeSillas;
    }

    public int getCanditadDeControles() {
        return canditadDeControles;
    }

    public void setCanditadDeControles(int canditadDeControles) {
        this.canditadDeControles = canditadDeControles;
    }
    public Integer getId() {
    		return id;
    }
    public void setId(Integer id) {
			this.id = id;
	}

	@Override
	public String toString() {
		return "Puesto [id=" + id + ", numeroDePuesto=" + numeroDePuesto + ", consola=" + idConsola
				+ ", cantidadDeSillas=" + cantidadDeSillas + ", canditadDeControles=" + canditadDeControles + "]";
	}
    
    
}
