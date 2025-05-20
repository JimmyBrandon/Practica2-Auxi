package Ejer4ComposicionAgregacion;

public class Main {
    public static void main(String[] args) {
        Universidad uni = new Universidad("Universidad Nacional");

        Estudiante e1 = new Estudiante("Ana", "Ingeniería", 3);
        Estudiante e2 = new Estudiante("Luis", "Medicina", 5);

        uni.agregarEstudiante(e1);
        uni.agregarEstudiante(e2);

        uni.mostrarUniversidad();
    }
}
