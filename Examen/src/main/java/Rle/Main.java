package Rle;

import java.util.ArrayList;

public class Main {
    private static final Rle rle= new Rle();
    private static String[] ejemplos;
    private static ArrayList<String> resultado;
    private static ArrayList<Tupla> tuplas;

    public static void main(String[] args) {
        ejemplos = new String[2];
        ejemplos[0] = "Hello world";
        ejemplos[1] = "";

        for (String ejemplo : ejemplos) {
            resultado = rle.encode(ejemplo);
            System.out.println(resultado.toString());
        }

        tuplas = new ArrayList<>();
        Tupla a = new Tupla(3,'b');
        Tupla b = new Tupla(4,'a');
        Tupla c = new Tupla(1,'c');
        tuplas.add(a);
        tuplas.add(b);
        tuplas.add(c);
        String resultado = "";

        resultado = rle.decode(tuplas);

        System.out.println(resultado);


    }
}
