package teste;

import modelo.CalculadoImposto;
import modelo.ContaCorrente;
import modelo.SeguroDeVida;

public class TesteTributaveis {
    public static void main(String[] args) {
        modelo.ContaCorrente cc222 = new modelo.ContaCorrente(222,111);
        cc222.deposita(100);

        SeguroDeVida seguro1 = new SeguroDeVida();

        modelo.CalculadoImposto calcularImposto = new modelo.CalculadoImposto();

        calcularImposto.registra(cc222);
        calcularImposto.registra(seguro1);

        System.out.println(calcularImposto.getTotalImposto());


    }
}
