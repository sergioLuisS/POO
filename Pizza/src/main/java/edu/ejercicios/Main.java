package edu.ejercicios;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Pizza pizzaMargarita = new Pizza("DELUXE", 50.00, new ArrayList<>());
        System.out.println(pizzaMargarita);
        pizzaMargarita.preparar();

        List<String> ingredientesPizzaItaliana = new ArrayList<>();
        ingredientesPizzaItaliana.add("Champinon");
        ingredientesPizzaItaliana.add("tomate");
        ingredientesPizzaItaliana.add("jamón");
        ingredientesPizzaItaliana.add("queso");
        PizzaItal pizzaItaliana = new PizzaItal ("Italiana Mollica", 155.00, ingredientesPizzaItaliana, "pesto", 15);
        System.out.println(pizzaItaliana);
        pizzaItaliana.preparar();

        Topping toppingExtraQueso = new Topping("extra queso");
        Topping toppingChampinones = new Topping("champiñones");

        toppingExtraQueso.agregar(pizzaMargarita);
        toppingChampinones.agregar(pizzaItaliana);

        System.out.println("Ingredientes de la pizza Margarita: " + pizzaMargarita.getingredients());
        System.out.println("Ingredientes de la pizza Italiana: " + pizzaItaliana.getingredients());

    }
}





