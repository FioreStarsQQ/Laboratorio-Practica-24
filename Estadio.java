// Tomando como modelo la clase Jugador, cree una nueva clase llamada Estadio Esta clase tendrá dos atributos: nombreEstadio y ciudad. Además, deberá crear dos constructores sobrecargados, los métodos accesosores (get) y los métodos accesores (set).
public class Estadio {
    private String nombreEstadio, nombreCiudad;
    // constructor
    public Estadio() {
        nombreEstadio = "Desconocido";
        nombreCiudad = "Desconocida";
    }
    // constructor inicializado
    public Estadio(String nombre, String ciudad) {
        setNombreEstadio(nombre);
        setCiudad(ciudad);
    }
    // establece el nombre del estadio
    public void setNombreEstadio(String nom) {
        nombreEstadio = nom;
    }
    // establece la ciudad
    public void setCiudad(String ciudad) {
        nombreCiudad = ciudad;
    }
    // devuelve el nombre del estadio
    public String getNombreEstadio() {
        return nombreEstadio;
    }
    // devuelve el nombre de la ciudad
    public String getCiudad() {
        return nombreCiudad;
    }
    // metodo toString para mostrar los atributos de Estadio
    public String toString() {
        return "> Estadio: " + nombreEstadio + "\n> Ciudad: " + nombreCiudad;
    }
}
