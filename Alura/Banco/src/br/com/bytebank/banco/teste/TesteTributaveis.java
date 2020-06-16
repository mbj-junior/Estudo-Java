package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroDeVida;

public class TesteTributaveis {
    public static void main(String[] args) {
        ContaCorrente cc222 = new ContaCorrente(222,111);
        cc222.deposita(100);

        SeguroDeVida seguro1 = new SeguroDeVida();

        br.com.bytebank.banco.modelo.CalculadoImposto calcularImposto = new br.com.bytebank.banco.modelo.CalculadoImposto();

        calcularImposto.registra(cc222);
        calcularImposto.registra(seguro1);

        System.out.println(calcularImposto.getTotalImposto());


    }
}
