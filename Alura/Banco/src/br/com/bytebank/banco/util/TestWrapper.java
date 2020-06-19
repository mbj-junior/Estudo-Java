package br.com.bytebank.banco.util;

import java.util.ArrayList;
import java.util.List;

public class TestWrapper {
    public static void main(String[] args) {

        Integer iRef = Integer.valueOf(29);
        System.out.println(iRef.intValue());

        Double dRef = Double.valueOf(2.3);
        System.out.println(dRef.doubleValue());

        Boolean bRef = false;
        System.out.println(bRef.booleanValue());

        Number nRef = Float.valueOf(19.8f);

        List<Number> lista = new ArrayList<>();
        lista.add(10);
        lista.add(23.4);
    }
}
