package Ejer2ComposicionAgregacion;

public class Main {
    public static void main(String[] args) {
        Avion avion = new Avion("Boeing 747", "Boeing");

        avion.agregarParte(new Parte("Motor", 5000));
        avion.agregarParte(new Parte("Alas", 3000));
        avion.agregarParte(new Parte("Tren de aterrizaje", 1500));

        avion.mostrarAvion();
    }
}
