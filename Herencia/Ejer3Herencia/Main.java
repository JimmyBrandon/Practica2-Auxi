package Ejer3Herencia;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Gerente> gerentes = new ArrayList<>();
        ArrayList<Desarrollador> desarrolladores = new ArrayList<>();

        gerentes.add(new Gerente("Ana", "Lopez", 5000, 10, "Recursos Humanos", 1500));
        gerentes.add(new Gerente("Carlos", "Perez", 4000, 5, "Marketing", 800));

        desarrolladores.add(new Desarrollador("Luis", "Gomez", 3000, 3, "Java", 15));
        desarrolladores.add(new Desarrollador("Marta", "Suarez", 3200, 2, "Python", 8));
        
        
        Empleado.mostrarTodos(desarrolladores, gerentes);
        System.out.println("====Requerimentos===");
        Gerente.mostrarGerentesBonoMayor1000(gerentes);
        Desarrollador.mostrarDesarrolladoresConMasDe10Horas(desarrolladores);
    }
}
