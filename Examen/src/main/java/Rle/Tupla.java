package Rle;

public class Tupla {
    private char caracter;
    private int cuenta;

    public Tupla(int cuenta, char caracter){
        this.caracter = caracter;
        this.cuenta = cuenta;
    }


    public String toStr(Tupla tupla) {
        String texto = "("+tupla.getCuenta()+",'"+tupla.getCaracter()+"')";
        return texto;
    }


    public char getCaracter() {
        return caracter;
    }

    public int getCuenta() {
        return cuenta;
    }

}
