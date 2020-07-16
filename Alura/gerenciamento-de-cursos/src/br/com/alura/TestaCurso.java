package br.com.alura;

public class TestaCurso {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Curso1", "Junior");

		javaColecoes.adiciona(new Aula("Aula1", 11));
		javaColecoes.adiciona(new Aula("Aula2", 22));
		javaColecoes.adiciona(new Aula("Aula3", 33));

		System.out.println(javaColecoes.getAulas());

	}

}
