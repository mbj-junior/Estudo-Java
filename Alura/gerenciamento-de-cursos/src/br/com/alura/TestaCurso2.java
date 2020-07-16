package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.sound.sampled.SourceDataLine;

public class TestaCurso2 {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("NomeCurso1", "Junior");

		javaColecoes.adiciona(new Aula("NomeAula2", 11));
		javaColecoes.adiciona(new Aula("NomeAula3", 22));
		javaColecoes.adiciona(new Aula("NomeAula1", 33));

		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		
		System.out.println(aulasImutaveis);

		List<Aula> aulas = new ArrayList<>(aulasImutaveis);

		Collections.sort(aulas);
		System.out.println(aulas);

		System.out.println(javaColecoes.getTempoTotal());
		System.out.println(javaColecoes);

	}

}
