package Ejer2Herencia;

import java.time.LocalDate;
import java.util.ArrayList;

public class Docente extends Persona {
    private String nit, profesion, especialidad;

    public Docente(String ci, String nombre, String apellido, String celular, LocalDate fechaNac,
                   String nit, String profesion, String especialidad, String sexo) {
        super(ci, nombre, apellido, celular, fechaNac, sexo);
        this.nit = nit;
        this.profesion = profesion;
        this.especialidad = especialidad;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Prof: " + profesion + " | Esp: " + especialidad);
    }

    public String getProfesion() {
        return profesion;
    }

    public static void mostrarIngenieroMayor(ArrayList<Docente> docentes) {
        Docente mayor = null;
        for (Docente d : docentes) {
            if (d.getProfesion().equalsIgnoreCase("Ingeniero") &&
                d.getSexo().equalsIgnoreCase("Masculino")) {
                if (mayor == null || d.getEdad() > mayor.getEdad()) {
                    mayor = d;
                }
            }
        }
        if (mayor != null) {
            mayor.mostrarInfo();
        }
    }
}

