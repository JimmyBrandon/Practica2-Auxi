package Ejer1ComposicionAgregacion;

public class Habitacion {
    private String nombre;
    private double tamano;

    public Habitacion(String nombre, double tamano) {
        this.nombre = nombre;
        this.tamano = tamano;
    }

    public void mostrarInfo() {
        System.out.println("Habitación: " + nombre + ", Tamaño: " + tamano + " m²");
    }
}
