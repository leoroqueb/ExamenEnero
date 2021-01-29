package Rle;

import java.util.ArrayList;

public class Main {
    private static final Rle rle= new Rle();
    private static String[] ejemplos;
    private static ArrayList<String> resultado;

    public static void main(String[] args) {
        ejemplos = new String[2];
        ejemplos[0] = "Hello world";
        ejemplos[1] = "";
        for (String ejemplo : ejemplos) {
            resultado = rle.encode(ejemplo);
            System.out.println(resultado.toString());
        }

    }
}
