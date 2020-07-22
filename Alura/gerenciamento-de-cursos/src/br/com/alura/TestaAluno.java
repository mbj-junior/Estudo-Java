package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TestaAluno {

	public static void main(String[] args) {

		Set<String> alunos = new HashSet<>();
		alunos.add("Aluno0");
		alunos.add("Aluno1");
		alunos.add("Aluno2");
		alunos.add("Aluno3");
		alunos.add("Aluno4");
		alunos.add("Aluno5");
		alunos.add("Aluno5");
		alunos.add("Aluno6");
		alunos.add("Aluno7");
		
		
		System.out.println(alunos);
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
	}

}
