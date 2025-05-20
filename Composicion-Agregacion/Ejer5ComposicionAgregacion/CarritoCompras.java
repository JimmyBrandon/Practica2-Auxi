package Ejer5ComposicionAgregacion;

import java.util.ArrayList;

public class CarritoCompras {
    private ArrayList<Producto> productos;
    private final int LIMITE = 10;

    public CarritoCompras() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        if (productos.size() < LIMITE) {
            productos.add(producto);
            System.out.println("Producto agregado: " + producto.getNombre());
        } else {
            System.out.println("No se puede agregar más productos. Límite alcanzado.");
        }
    }

    public void mostrarCarrito() {
        System.out.println("Carrito de Compras:");
        for (Producto p : productos) {
            p.mostrarInfo();
        }
        System.out.println("Total de productos: " + productos.size());
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }
}
