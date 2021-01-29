package Rle;

import java.util.ArrayList;


public class Tupla {
    private char caracter;
    private int cuenta;
    private ArrayList<String> tuplas = new ArrayList<>();
    private String texto;

    public Tupla(int cuenta, char caracter){
        this.caracter = caracter;
        this.cuenta = cuenta;
    }


    public String toStr(Tupla tupla) {
        texto = "("+tupla.getCuenta()+",'"+tupla.getCaracter()+"')";
        return texto;
    }



    public char getCaracter() {
        return caracter;
    }

    public int getCuenta() {
        return cuenta;
    }

}
