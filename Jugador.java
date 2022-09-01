// Cree la clase Jugador.

public class Jugador {
    private String nombre;
    private int numeroCamiseta;
    private String posicion;

    // constructor
    public Jugador() {
        nombre = "anónimo";
    }
    // establece el nombre del jugador
    public void setNombre(String nom) {
        nombre = nom;
    }
    // devuelve el nombre del jugador
    public String getNombre() {
        return nombre;
    }
    // establece el numero de la camiseta del jugador
    public void setNumeroCamiseta(int numero) {
        numeroCamiseta = numero;
    }
    // devuelve el numero de la camiseta del jugador
    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }
    // establece la posicion del jugador
    public void setPosicion(String pos) {
        posicion = pos;
    }
    // devuelve la posicion del jugador
    public String getPosicion() {
        return posicion;
    }
    // metodo toString que permite ver los atributos de Jugador
    public String toString() {
        return "\nJugador: " + nombre + "  > Número de camiseta: " + numeroCamiseta + "  > Posición: " + posicion;
    }
}
