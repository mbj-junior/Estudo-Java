package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteContas {

	public static void main(String[] args) {

		ContaCorrente cc1 = new ContaCorrente(1337, 23334);
		cc1.deposita(200);

		ContaPoupanca cp1 = new ContaPoupanca(2222,2222);
		cp1.deposita(300);

		System.out.println(cc1.getSaldo() + " " + cp1.getSaldo());

		try {
			cc1.transfere(10,cp1);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}

		System.out.println(cc1.getSaldo() + " " + cp1.getSaldo());
		
	}
	
}
