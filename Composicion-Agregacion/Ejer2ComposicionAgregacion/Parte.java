package Ejer2ComposicionAgregacion;

public class Parte {
    private String nombre;
    private double peso;

    public Parte(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public void mostrarInfo() {
        System.out.println("Parte: " + nombre + ", Peso: " + peso + " kg");
    }
}
