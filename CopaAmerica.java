
// Laboratorio Nro 24 - Ejercicio1
// Autor: Fiorela Clariza Quispe Quispe
// Colaboró:
// Tiempo: 1h
// Cree la clase CopaAmerica.java
// Cree dos objetos del tipo Estadio en la clase CopaAmerica (cada objeto que utilice un constructor diferente).
import java.util.*;

public class CopaAmerica {
    public static void main(String[] args) {
        String nombreJugador, posicionJugador, jugadores;
        int camisetaJugador;
        Scanner scan = new Scanner(System.in);
        ArrayList<Jugador> equipo = new ArrayList<>();
        ArrayList<Jugador> equipo1 = new ArrayList<>();
        // equipo = new ArrayList<Jugador>();
        // equipoQ = new ArrayList<Jugador>();
        Jugador jugador0 = new Jugador();
        Jugador jugador1 = new Jugador();
        Jugador jugador2 = new Jugador();
        Jugador jugador3 = new Jugador();
        Jugador jugador4 = new Jugador();
        Jugador jugador5 = new Jugador();
        Jugador jugador6 = new Jugador();
        Jugador jugador7 = new Jugador();
        Jugador jugador8 = new Jugador();
        Jugador jugador9 = new Jugador();
        Jugador jugador10 = new Jugador();
        Jugador jugador11 = new Jugador();


        // for (int i=0;i<11;i++) {
        //     System.out.println("Ingrese el nombre del jugador "+(i)+":");
        //     jugadores="jugador"+String.valueOf(i);
        //     jugadores.setNombre(scan.next());
        //     System.out.println("Ingrese la posición del jugador");
        //     posicionJugador = scan.next();
        //     jugadorx.setPosicion(posicionJugador);
        //     System.out.println("Ingrese el numero de la camiseta del jugador");
        //     camisetaJugador = scan.nextInt();
        //     jugadorx.setNumeroCamiseta(camisetaJugador);
        //     equipo1.add(i, jugadorx);
        //     // jugadorx = new Jugador();
        // }


        // jugador1.setNombre("Advicula");
        // jugador1.setNumeroCamiseta(11);
        // jugador1.setPosicion("defensa");
        // addJugadores(equipo, jugador1);

        // jugador2.setNombre("Guerrero");
        // jugador2.setNumeroCamiseta(9);
        // jugador2.setPosicion("delantero");
        // addJugadores(equipo, jugador2);

        // jugador3.setNombre("Lapadula");
        // jugador3.setNumeroCamiseta(12);
        // jugador3.setPosicion("delantero");
        // addJugadores(equipo, jugador3);

        // jugador4.setNombre("Farfán");
        // jugador4.setNumeroCamiseta(10);
        // jugador4.setPosicion("defensa");
        // addJugadores(equipo, jugador4);

        // jugador5.setNombre("Tapia");
        // jugador5.setNumeroCamiseta(8);
        // jugador5.setPosicion("centrocampista");
        // addJugadores(equipo, jugador5);

        // jugador6.setNombre("Flores");
        // jugador6.setNumeroCamiseta(5);
        // jugador6.setPosicion("delantero");
        // addJugadores(equipo, jugador6);

        // jugador7.setNombre("Gallese");
        // jugador7.setNumeroCamiseta(1);
        // jugador7.setPosicion("portero");
        // addJugadores(equipo, jugador7);

        // jugador8.setNombre("Ramos");
        // jugador8.setNumeroCamiseta(4);
        // jugador8.setPosicion("defensa");
        // addJugadores(equipo, jugador8);

        // jugador9.setNombre("Cueva");
        // jugador9.setNumeroCamiseta(3);
        // jugador9.setPosicion("delantero");
        // addJugadores(equipo, jugador9);

        // jugador10.setNombre("Perez");
        // jugador10.setNumeroCamiseta(2);
        // jugador10.setPosicion("centrocampista");
        // addJugadores(equipo, jugador10);

        // jugador11.setNombre("Trauco");
        // jugador11.setNumeroCamiseta(20);
        // jugador11.setPosicion("defensa");
        // addJugadores(equipo, jugador11);

        Estadio estadio1 = new Estadio();
        Estadio estadio2 = new Estadio("Nacional", "Lima");

        System.out.println(estadio1); // muestra las caracteristicas del estadio 1 cuando no se le asigna un nombre en especifico

        estadio1.setNombreEstadio("UNSA");
        estadio1.setCiudad("Arequipa");
        System.out.println(estadio1); // estadio1 con nombre de estadio y ciudad determinados
        System.out.println(estadio2);

        System.out.println("Los mejores fueron ");
        System.out.println(jugador1.getNombre() + " y " + jugador2.getNombre());
        // Muestra los jugadores almacenados en el arraylist
        for (Jugador i : equipo1) {
            System.out.println(i);
        }
    }

    // Cree un ArrayList de Jugador llamado equipo en la clase CopaAmerica, llénelo
    // con 11 jugadores y muestre cómo queda la alineación final (en la clase
    // Jugador crear el método toString y utilizarlo aquí). No se olvide de crear
    // todos métodos necesarios.

    // Metodo que añade a los jugadores en el arraylist
    public static void addJugadores(ArrayList<Jugador> equip, Jugador jugadorx) {
        equip.add(jugadorx);
    }
}
