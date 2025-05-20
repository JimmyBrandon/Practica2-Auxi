package Ejer1Herencia;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Coche> coches = new ArrayList<>();
        ArrayList<Moto> motos = new ArrayList<>();

        coches.add(new Coche("Toyota", "Corolla", 2025, 20000, 4, "Gasolina"));
        coches.add(new Coche("Ford", "Explorer", 2025, 30000, 5, "Diesel"));
        coches.add(new Coche("Honda", "Civic", 2024, 22000, 4, "Híbrido"));

        motos.add(new Moto("Yamaha", "R3", 2025, 15000, 321, "4 tiempos"));
        motos.add(new Moto("Kawasaki", "Ninja 400", 2023, 17000, 399, "4 tiempos"));

        Vehiculo.mostrarTodos(coches, motos);
        Vehiculo.mostrarCochesConMasDe4Puertas(coches);
        Vehiculo.mostrarVehiculosDel2025(coches, motos);
    }
}

