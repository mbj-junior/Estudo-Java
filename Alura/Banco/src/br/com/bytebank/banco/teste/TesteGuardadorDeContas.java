package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TesteGuardadorDeContas {

    public static void main(String[] args) {
        GuardadorDeContas guardador = new GuardadorDeContas();

        Conta conta1 = new ContaCorrente(11,111);
        guardador.adiciona(conta1);

        Conta conta2 = new ContaCorrente(11,222);
        guardador.adiciona(conta2);

        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho);

        Conta ref = guardador.getReferencia(0);
        System.out.println(ref.getNumero());
    }


}
