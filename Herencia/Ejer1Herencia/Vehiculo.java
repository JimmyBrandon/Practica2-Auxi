package Ejer1Herencia;

import java.util.ArrayList;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int año;
    private double precioBase;

    public Vehiculo(String marca, String modelo, int año, double precioBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precioBase = precioBase;
    }

    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getAño() { return año; }
    public double getPrecioBase() { return precioBase; }

    public void setMarca(String marca) { this.marca = marca; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public void setAño(int año) { this.año = año; }
    public void setPrecioBase(double precioBase) { this.precioBase = precioBase; }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
        System.out.println("Precio base: $" + precioBase);
    }

    // ✅ Métodos estáticos de gestión

    public static void mostrarTodos(ArrayList<Coche> coches, ArrayList<Moto> motos) {
        System.out.println("== Información de los coches ==");
        for (Coche coche : coches) {
            coche.mostrarInfo();
        }

        System.out.println("== Información de las motos ==");
        for (Moto moto : motos) {
            moto.mostrarInfo();
        }
    }

    public static void mostrarCochesConMasDe4Puertas(ArrayList<Coche> coches) {
        System.out.println("== Coches con más de 4 puertas ==");
        for (Coche coche : coches) {
            if (coche.getNumPuertas() > 4) {
                coche.mostrarInfo();
            }
        }
    }

    public static void mostrarVehiculosDel2025(ArrayList<Coche> coches, ArrayList<Moto> motos) {
        System.out.println("== Vehículos del año 2025 ==");
        for (Coche coche : coches) {
            if (coche.getAño() == 2025) {
                coche.mostrarInfo();
            }
        }
        for (Moto moto : motos) {
            if (moto.getAño() == 2025) {
                moto.mostrarInfo();
            }
        }
    }
}
