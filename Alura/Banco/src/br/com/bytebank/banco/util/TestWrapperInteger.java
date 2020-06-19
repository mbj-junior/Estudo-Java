package br.com.bytebank.banco.util;

import java.util.ArrayList;
import java.util.List;

public class TestWrapperInteger {
    public static void main(String[] args) {

        int[] idades = new int[5];
        String[] nome = new String[5];

        int idade = 29;

        Integer idadeRef = Integer.valueOf(29);
        idadeRef.intValue();

        String s = args[0];

        //Integer numeroDoString = Integer.valueOf(s);
        Integer numeroDoString = Integer.parseInt(s);

        System.out.println(numeroDoString);


        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(29);

    }
}
