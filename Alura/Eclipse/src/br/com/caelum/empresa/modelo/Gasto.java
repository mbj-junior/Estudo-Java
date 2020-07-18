package br.com.caelum.empresa.modelo;

import java.util.Calendar;

public class Gasto {

	private final double valor;
	private final String tipo;
	private final Funcionario funcionario;
	private final Calendar data;

	public Gasto(double valor, String tipo, Funcionario funcionario, Calendar data) {
		this.valor = valor;
		this.tipo = tipo;
		this.funcionario = funcionario;
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public String getTipo() {
		return tipo;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public Calendar getData() {
		return data;
	}

	@Override
	public String toString() {
		return this.getTipo() + " do " + this.getFuncionario() + " total " + this.getValor();
	}

}
