package Ejer3ComposicionAgregacion;

public class Mediocampista extends Jugador {
    private String habilidadEspecial;

    public Mediocampista(String nombre, int numero, String habilidadEspecial) {
        super(nombre, numero, "Mediocampista");
        this.habilidadEspecial = habilidadEspecial;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Habilidad Especial: " + habilidadEspecial);
    }

    public String getHabilidadEspecial() { return habilidadEspecial; }
    public void setHabilidadEspecial(String habilidadEspecial) { this.habilidadEspecial = habilidadEspecial; }
}
