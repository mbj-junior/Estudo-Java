package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayListEquals {
    public static void main(String[] args) {
        ArrayList<Conta> list = new ArrayList<Conta>();

        Conta cc1 = new ContaCorrente(11,11);
        list.add(cc1);
        Conta cc2 = new ContaCorrente(22,22);
        list.add(cc2);
        Conta cc3 = new ContaCorrente(22,22);


        boolean exist = list.contains(cc2);
        System.out.println("Já existe? "+ exist);

        exist = list.contains(cc3);
        System.out.println("Já existe? "+ exist);

        boolean equals = cc1.equals(cc2);
        System.out.println("Já existe? "+ equals);

        equals = cc2.equals(cc3);
        System.out.println("Já existe? "+ equals);



    }
}
