package poo.sininterfaces;

public class coche {

    // 1. atributos
    String marca;
    String modelo;
    int anio;
    boolean alta;

    // 2. constructores

    public coche(String marca, String modelo, int anio, boolean alta){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.alta = alta;

    }

    public coche() {

    }

    // 3. metodos


    @Override
    public String toString() {
        return "coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio=" + anio +
                ", alta=" + alta +
                '}';
    }
}
