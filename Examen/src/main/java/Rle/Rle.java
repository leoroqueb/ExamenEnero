package Rle;

import java.util.ArrayList;

public class Rle {

    private Tupla tupla;
    private ArrayList<String> tuplas;

    public ArrayList<String> encode(String a){
        tuplas = new ArrayList<>();
        char letra;
        for (int i = 0; i < a.length(); i++) {
            letra = a.charAt(i);
            int count = 1;
            while (i < a.length() - 1 &&
                    a.charAt(i) == a.charAt(i + 1)) {
                count++;
                i++;
            }
            tupla = new Tupla(count, letra);
            String b = tupla.toStr(tupla);

            tuplas.add(b);
        }
        return tuplas;
    }

}
