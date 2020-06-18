package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;
import br.com.bytebank.banco.modelo.GuardadorDeReferencias;

public class TesteGuardadosDeReferencias {

    public static void main(String[] args) {
        GuardadorDeReferencias guardador = new GuardadorDeReferencias();

        Conta conta1 = new ContaCorrente(11,111);
        guardador.adiciona(conta1);

        Conta conta2 = new ContaCorrente(11,222);
        guardador.adiciona(conta2);

        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho);

        Conta ref = (Conta) guardador.getReferencia(0);
        System.out.println(ref.getNumero());
    }


}
