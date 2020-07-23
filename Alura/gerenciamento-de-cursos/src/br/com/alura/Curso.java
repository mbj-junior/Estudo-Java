package br.com.alura;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> aluno = new HashSet<Aluno>();
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	public int getTempoTotal() {
		int tempoTotal = 0;
		for (Aula aula : aulas) {
			tempoTotal += aula.getTempo();
		}
		return tempoTotal;
	}

	@Override
	public String toString() {
		return "[Curso:" + this.getNome() + ", tempo: " + this.getTempoTotal() + "]";
	}

	public void matricula(Aluno aluno) {
		this.aluno.add(aluno);
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
	}
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(aluno);
	}

	public boolean estaMatriculado(Aluno a1uno) {
		return this.aluno.contains(a1uno);
	}

	public Aluno buscaMatriculado(int numInformado) {
		if (!matriculaParaAluno.containsKey(numInformado)) {
			throw new NoSuchElementException("Matricula não encontrada");
		}
		return matriculaParaAluno.get(numInformado);
	}



}
