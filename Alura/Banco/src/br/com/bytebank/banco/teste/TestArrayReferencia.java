package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TestArrayReferencia {
    public static void main(String[] args) {

        ContaCorrente[] conta = new ContaCorrente[5];

        ContaCorrente cc1 = new ContaCorrente(111,111);

        conta[0] = cc1;


        ContaCorrente cc2 = new ContaCorrente(111,112);
        conta[1] = cc2;

        System.out.println(conta[1].getNumero());

        ContaCorrente ref = conta[1];

        System.out.println(ref.getNumero());

        System.out.println(cc2.getNumero());





    }
}
