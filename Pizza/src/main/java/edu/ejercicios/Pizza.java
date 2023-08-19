package edu.ejercicios;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
public class Pizza {

    private String nombre;
    private double precio;
    private List<String> ingredientes;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public List<String> getGetingredientes() {
        return getGetingredientes();
    }
    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public Pizza(String nombre, double precio, List<String> ingredientes) {
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientes = ingredientes;
    }

    public void preparar() {
        System.out.println("La pizza está lista para ser servida.");
    }

    @Override
    public String toString() {
        return "Nombre de la pizza: " + nombre + ", y su precio es: Q. " + precio;
    }

    public Calendar getingredients() {
        return null;
    }
}




