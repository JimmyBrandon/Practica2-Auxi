package Ejer2Herencia;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        ArrayList<Docente> docentes = new ArrayList<>();

        estudiantes.add(new Estudiante("123", "Luis", "Gomez", "77711111", LocalDate.of(1997, 1, 10),
                "RU123", LocalDate.of(2020, 2, 1), 8, "Masculino"));
        estudiantes.add(new Estudiante("456", "Ana", "Perez", "77722222", LocalDate.of(2007, 5, 5),
                "RU456", LocalDate.of(2023, 3, 1), 2, "Femenino"));

        docentes.add(new Docente("789", "Carlos", "Gomez", "77733333", LocalDate.of(1970, 3, 20),
                "NIT789", "Ingeniero", "Sistemas", "Masculino"));
        docentes.add(new Docente("012", "Maria", "Lopez", "77744444", LocalDate.of(1985, 7, 15),
                "NIT012", "Licenciada", "Matemática", "Femenino"));
        
        
        Persona.mostrarTodos(estudiantes, docentes);
        System.out.println("---------Requerimentos---------");
        Estudiante.mostrarMayores25(estudiantes);
        Docente.mostrarIngenieroMayor(docentes);
        Estudiante.mostrarMismoApellido(estudiantes, docentes);
    }
}
