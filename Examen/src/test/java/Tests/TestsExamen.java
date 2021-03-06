package Tests;

import Rle.*;
import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.*;


public class TestsExamen {
    private Rle rle;

    @Before
    public void init(){
        rle = new Rle();
    }
    @Test
    public void _cuentaLetras(){
        String ejemplo = "Hello";
        ArrayList<String> a = new ArrayList<>();
        a.add("(1,'H')");
        a.add("(1,'e')");
        a.add("(2,'l')");
        a.add("(1,'o')");

        assertEquals(a,rle.encode(ejemplo));

    }

    @Test
    public void _noHayLetras(){
        String ejemplo = "";
        ArrayList<String> a = new ArrayList<>();

        assertEquals(a,rle.encode(ejemplo));
    }

    @Test
    public void _decodeEjemplo(){
        String ejemplo = "aaabb";
        Tupla a = new Tupla(3,'a');
        Tupla b = new Tupla(2,'b');
        ArrayList<Tupla> ej = new ArrayList<>();
        ej.add(a);
        ej.add(b);
        assertEquals(ejemplo, rle.decode(ej));
    }

    @Test
    public void _decodeEjemploSinNada(){
        String ejemplo = "";
        ArrayList<Tupla> ej = new ArrayList<>();
        assertEquals(ejemplo, rle.decode(ej));
    }
}
