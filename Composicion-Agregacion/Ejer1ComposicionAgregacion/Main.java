package Ejer1ComposicionAgregacion;

public class Main {
    public static void main(String[] args) {
        Casa casa = new Casa("Av. Siempre Viva 123");

        casa.agregarHabitacion(new Habitacion("Sala", 20));
        casa.agregarHabitacion(new Habitacion("Cocina", 10));
        casa.agregarHabitacion(new Habitacion("Dormitorio", 15));

        casa.mostrarCasa();
    }
}
