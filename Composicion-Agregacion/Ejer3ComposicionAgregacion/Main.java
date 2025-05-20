package Ejer3ComposicionAgregacion;

public class Main {
    public static void main(String[] args) {
        Equipo equipo = new Equipo("Barcelona");

        Portero p = new Portero("Tek", 1, "Atajadas");
        Defensa d = new Defensa("Cubarsi", 4, "Marcaje");
        Mediocampista m = new Mediocampista("Pedri", 8, "Pases");
        Delantero dl = new Delantero("Lamine", 9, "Goles");

        equipo.agregarJugador(p);
        equipo.agregarJugador(d);
        equipo.agregarJugador(m);
        equipo.agregarJugador(dl);

        equipo.mostrarEquipo();
    }
}
