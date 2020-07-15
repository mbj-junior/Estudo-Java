package br.com.alura;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Curso1", "Junior");
		List<Aula> aulas = javaColecoes.getAulas();
		System.out.println(aulas);

		javaColecoes.getAulas().add(new Aula("Trabalhando", 33));

		System.out.println(aulas);
		System.out.println(javaColecoes.getAulas());
		System.out.println(aulas == javaColecoes.getAulas());

	}

}
