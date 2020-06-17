package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestArrayReferencia {
    public static void main(String[] args) {

        Object[] referencias = new Object[5];

        ContaCorrente cc1 = new ContaCorrente(111,111);
        referencias[0] = cc1;

        ContaPoupanca cc2 = new ContaPoupanca(111,112);
        referencias[1] = cc2;

        Cliente cliente = new Cliente();
        referencias[2] = cliente;

        //System.out.println(referencias[1].getNumero());

        Object referenciaGenerica = referencias[1];


        ContaPoupanca ref = (ContaPoupanca) referencias[1]; //type cast

        System.out.println(ref.getNumero());
        System.out.println(cc2.getNumero());
    }
}
