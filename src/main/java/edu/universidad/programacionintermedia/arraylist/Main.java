package edu.universidad.programacionintermedia.arraylist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();

        frutas.add("Mango");
        frutas.add("Banano");
        frutas.add("Naranja");
        frutas.add(1,"Fresa");

        System.out.println("---- STEP 1 ----");
        System.out.println(frutas);

        String primera = frutas.get(0);
        String segunda = frutas.get(1);
        System.out.println("\n---- STEP 2 ----");
        System.out.println("[" + primera + ", " + segunda + "]");

        frutas.set(0, "Papaya");
        System.out.println("\n---- STEP 3 ----");
        System.out.println(frutas);

        frutas.remove(2);
        frutas.remove("Fresa");
        System.out.println("\n---- STEP 4 ----");
        System.out.println(frutas);

        System.out.println("\n---- STEP 5 ----");
        System.out.println(frutas.size());

        System.out.println("\n---- STEP 6 ----");
        System.out.println(frutas.contains("Naranja"));
        System.out.println(frutas.contains("Banano"));
    }
}
