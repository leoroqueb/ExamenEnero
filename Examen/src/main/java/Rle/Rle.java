package Rle;

import java.util.ArrayList;

public class Rle {

    private Tupla tupla;
    private ArrayList<String> tuplas;

    public ArrayList<String> encode(String a){
        if (a.equals("")){
            tuplas = new ArrayList<>();
        }else {
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
        }
        return tuplas;
    }

    public String decode(ArrayList<Tupla> tuplas){
        String result = "";
        for (int i = 0; i < tuplas.size(); i++) {
            Tupla aux = tuplas.get(i);
            int cuantasVeces = aux.getCuenta();
            char letra = aux.getCaracter();
            result += trascribir(cuantasVeces,letra);
        }
        return result;
    }

    private String trascribir(int a, char b){
        String result = "";
        for (int i = 0; i < a; i++) {
            result += b;
        }
        return result;
    }


}
