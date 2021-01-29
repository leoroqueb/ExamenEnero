package Rle;

import java.util.ArrayList;

public class Rle {

    private Tupla tupla;
    private ArrayList<String> tuplas = new ArrayList<>();

    public ArrayList<String> encode(String a){
        if (a.equals("")){
            return tuplas;
        }else {
            char letra;
            for (int i = 0; i < a.length(); i++) {
                letra = a.charAt(i);
                int count = 1;
                while (i < a.length() - 1 &&
                        a.charAt(i) == a.charAt(i + 1)) {
                    count++;
                    i++;
                }
                crearTuplaYmeterEnArraylist(count,letra);
            }
        }
        return tuplas;
    }

    public void crearTuplaYmeterEnArraylist(int cuenta, char letra){
        tupla = new Tupla(cuenta, letra);
        String b = tupla.toStr(tupla);
        tuplas.add(b);
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
