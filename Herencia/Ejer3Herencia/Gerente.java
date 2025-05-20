package Ejer3Herencia;

import java.util.ArrayList;

public class Gerente extends Empleado {
    private String departamento;
    private double bonoGerencial;

    public Gerente(String nombre, String apellido, double salarioBase, int aniosAntiguedad,
                   String departamento, double bonoGerencial) {
        super(nombre, apellido, salarioBase, aniosAntiguedad);
        this.departamento = departamento;
        this.bonoGerencial = bonoGerencial;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bonoGerencial;
    }

    @Override
    public void mostrarInfo() {
        System.out.println(nombre + " " + apellido + " - Gerente de " + departamento);
        System.out.println("Salario total: " + calcularSalario());
    }

    public static void mostrarGerentesBonoMayor1000(ArrayList<Gerente> gerentes) {
        for (Gerente g : gerentes) {
            if (g.bonoGerencial > 1000) {
                g.mostrarInfo();
            }
        }
    }
}
