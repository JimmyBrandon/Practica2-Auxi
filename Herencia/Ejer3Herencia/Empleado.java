package Ejer3Herencia;

import java.util.ArrayList;

import Ejer2Herencia.Docente;
import Ejer2Herencia.Estudiante;

public class Empleado {
    protected String nombre, apellido;
    protected double salarioBase;
    protected int aniosAntiguedad;

    public Empleado(String nombre, String apellido, double salarioBase, int aniosAntiguedad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioBase = salarioBase;
        this.aniosAntiguedad = aniosAntiguedad;
    }

    public double calcularSalario() {
        return salarioBase + (salarioBase * 0.05 * aniosAntiguedad);
    }

    public void mostrarInfo() {
        System.out.println(nombre + " " + apellido + " - Salario: " + calcularSalario());
    }

    public String getApellido() {
        return apellido;
    }
    
    public static void mostrarTodos(ArrayList<Desarrollador> desarrolladores, ArrayList<Gerente> gerentes) {
        System.out.println("== Información de los desarrolladores ==");
        for (Desarrollador desarrollador : desarrolladores) {
            desarrollador.mostrarInfo();
        }

        System.out.println("== Información de los gerentes ==");
        for (Gerente gerente : gerentes) {
            gerente.mostrarInfo();
        }
    }

}
