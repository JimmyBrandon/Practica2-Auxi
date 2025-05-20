package Ejer2Herencia;

import java.time.LocalDate;
import java.util.ArrayList;

public class Estudiante extends Persona {
    private String ru;
    private LocalDate fechaIngreso;
    private int semestre;

    public Estudiante(String ci, String nombre, String apellido, String celular, LocalDate fechaNac,
                      String ru, LocalDate fechaIngreso, int semestre, String sexo) {
        super(ci, nombre, apellido, celular, fechaNac, sexo);
        this.ru = ru;
        this.fechaIngreso = fechaIngreso;
        this.semestre = semestre;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("RU: " + ru + " | Semestre: " + semestre);
    }

    public static void mostrarMayores25(ArrayList<Estudiante> estudiantes) {
        for (Estudiante e : estudiantes) {
            if (e.getEdad() > 25) {
                e.mostrarInfo();
            }
        }
    }

    public static void mostrarMismoApellido(ArrayList<Estudiante> estudiantes, ArrayList<Docente> docentes) {
        for (Estudiante e : estudiantes) {
            for (Docente d : docentes) {
                if (e.getApellido().equalsIgnoreCase(d.getApellido())) {
                    e.mostrarInfo();
                    d.mostrarInfo();
                }
            }
        }
    }
}


