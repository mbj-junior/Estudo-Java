package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static List<Empresa> listaEmpresas = new ArrayList<Empresa>();

	static {
		Empresa empresa1 = new Empresa();
		empresa1.setNome("Empresa1");
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Empresa2");
		listaEmpresas.add(empresa1);
		listaEmpresas.add(empresa2);
	}

	public void adiciona(Empresa empresa) {
		listaEmpresas.add(empresa);
//		System.out.println("Empresa Add");
	}

	public List<Empresa> getEmpresas() {
		return Banco.listaEmpresas;
	}

}
