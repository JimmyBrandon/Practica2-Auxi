package Ejer3ComposicionAgregacion;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private ArrayList<Jugador> jugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public void mostrarEquipo() {
        System.out.println("Equipo: " + nombre);
        for (Jugador jugador : jugadores) {
            jugador.mostrarInfo();
            System.out.println("------------------");
        }
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
}
