package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TesteSaca {

    public static void main(String[] args) {
        Conta conta = new ContaCorrente(123, 333);

        conta.deposita(200);
        System.out.println(conta.getSaldo());
        try {
            conta.saca(100);
        } catch (SaldoInsuficienteException e) {
            e.printStackTrace();
        }
        System.out.println(conta.getSaldo());
        try {
            conta.saca(100);
        } catch (SaldoInsuficienteException e) {
            e.printStackTrace();
        }
        System.out.println(conta.getSaldo());

    }

}
