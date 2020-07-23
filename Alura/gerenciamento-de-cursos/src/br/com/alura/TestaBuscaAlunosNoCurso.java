package br.com.alura;

public class TestaBuscaAlunosNoCurso {
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
		
		System.out.println("aluno com matricula 12333");
		Aluno aluno = javaColecoes.buscaMatriculado(12333);
		System.out.println("aluno : " + aluno);
	}
}
