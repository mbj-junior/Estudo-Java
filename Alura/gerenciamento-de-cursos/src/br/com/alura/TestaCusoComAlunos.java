package br.com.alura;

import sun.net.www.content.audio.aiff;

public class TestaCusoComAlunos {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("NomeCurso1", "Junior");

		javaColecoes.adiciona(new Aula("NomeAula2", 11));
		javaColecoes.adiciona(new Aula("NomeAula3", 22));
		javaColecoes.adiciona(new Aula("NomeAula1", 33));
		
		Aluno a1 = new Aluno("Junior", 12333);
		Aluno a2 = new Aluno("Paula", 32541);
		Aluno a3 = new Aluno("Ana", 51668);
		
 		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Alunos matriculados");
		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		});
		
		System.out.print(a1.getNome() + " está matriculado? = ");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		Aluno junior = new Aluno("Junior", 12333);
		System.out.println("O Junio ja estava matriculado ?");
		System.out.println(javaColecoes.estaMatriculado(junior));
		
		
		System.out.println("o a1 é igual ao Junior?");
		System.out.println(a1.equals(junior));
		
		System.out.println(a1.hashCode());
		System.out.println(junior.hashCode());
		System.out.println(a1.hashCode() == junior.hashCode());
	}
}
