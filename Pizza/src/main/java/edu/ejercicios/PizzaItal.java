package edu.ejercicios;
import java.util.List;

public class PizzaItal extends Pizza {
    private String salsa;
    private int tiempoEnHorno;

    public PizzaItal(String nombre, double precio, List<String> ingredientes, String salsa, int tiempoEnHorno) {
        super(nombre, precio, ingredientes);
        this.salsa = salsa;
        this.tiempoEnHorno = tiempoEnHorno;
    }

    @Override
    public void preparar() {
        super.preparar();
        System.out.println("Agregando salsa " + salsa + " a la pizza.");
        System.out.println("La pizza italiana se hornea durante " + tiempoEnHorno + " minutos.");
    }

    @Override
    public String toString() {
        return super.toString() + ", salsa: " + salsa + ", tiempo en horno: " + tiempoEnHorno + " minutos";
    }
}

