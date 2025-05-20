package Ejer5ComposicionAgregacion;

public class Main {
    public static void main(String[] args) {
        CarritoCompras carrito = new CarritoCompras();

        carrito.agregarProducto(new Producto("Leche", 1.50));
        carrito.agregarProducto(new Producto("Pan", 0.80));
        carrito.agregarProducto(new Producto("Huevos", 2.00));
        carrito.agregarProducto(new Producto("Queso", 3.00));
        carrito.agregarProducto(new Producto("Café", 4.00));
        carrito.agregarProducto(new Producto("Azúcar", 1.20));
        carrito.agregarProducto(new Producto("Arroz", 2.50));
        carrito.agregarProducto(new Producto("Frijoles", 1.90));
        carrito.agregarProducto(new Producto("Jugo", 1.75));
        carrito.agregarProducto(new Producto("Mantequilla", 2.80));

        carrito.agregarProducto(new Producto("Chocolate", 2.00));

        carrito.mostrarCarrito();
    }
}
