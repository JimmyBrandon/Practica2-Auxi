package Ejer2Herencia;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

import Ejer1Herencia.Coche;
import Ejer1Herencia.Moto;

public class Persona {
    protected String ci, nombre, apellido, celular;
    protected LocalDate fechaNac;
    protected String sexo;

    public Persona(String ci, String nombre, String apellido, String celular, LocalDate fechaNac, String sexo) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.fechaNac = fechaNac;
        this.sexo = sexo;
    }

    public int getEdad() {
        return Period.between(fechaNac, LocalDate.now()).getYears();
    }

    public String getApellido() {
        return apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void mostrarInfo() {
        System.out.println(nombre + " " + apellido + " (" + getEdad() + " años)");
    }
    
    public static void mostrarTodos(ArrayList<Estudiante> estudiantes, ArrayList<Docente> docentes) {
        System.out.println("== Información de los estudiantes ==");
        for (Estudiante estudiante : estudiantes) {
            estudiante.mostrarInfo();
        }

        System.out.println("== Información de los docentes ==");
        for (Docente docente : docentes) {
            docente.mostrarInfo();
        }
    }
}
