package Ejer3Herencia;

import java.util.ArrayList;

public class Desarrollador extends Empleado {
    private String lenguajeProgramacion;
    private int horasExtras;

    public Desarrollador(String nombre, String apellido, double salarioBase, int aniosAntiguedad,
                         String lenguajeProgramacion, int horasExtras) {
        super(nombre, apellido, salarioBase, aniosAntiguedad);
        this.lenguajeProgramacion = lenguajeProgramacion;
        this.horasExtras = horasExtras;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (horasExtras * 20);
    }

    @Override
    public void mostrarInfo() {
        System.out.println(nombre + " " + apellido + " - Dev " + lenguajeProgramacion);
        System.out.println("Salario total: " + calcularSalario());
    }

    public static void mostrarDesarrolladoresConMasDe10Horas(ArrayList<Desarrollador> desarrolladores) {
        for (Desarrollador d : desarrolladores) {
            if (d.horasExtras > 10) {
                d.mostrarInfo();
            }
        }
    }
}
