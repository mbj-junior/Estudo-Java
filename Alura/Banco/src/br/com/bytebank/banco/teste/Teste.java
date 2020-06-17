package br.com.bytebank.banco.teste;

public class Teste {
    public static void main(String[] args) {

        int [] idade = new int[7];

        System.out.println(idade[2]);

        idade[2] = 30;

        System.out.println(idade[2]);

        for (int i = 0; i < idade.length; i++) {
            idade[i] = i*i;
            System.out.println(idade[i]);
        }





    }
}
