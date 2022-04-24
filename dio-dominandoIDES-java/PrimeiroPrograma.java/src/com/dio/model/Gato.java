package com.dio.model;

import java.util.Objects;

public class Gato {

	private String nome;
	private String cor;
	private Integer Idade;

	public Gato() {
	}

	public Gato(String nome, String cor, Integer idade) {
		super();
		this.nome = nome;
		this.cor = cor;
		Idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getIdade() {
		return Idade;
	}

	public void setIdade(Integer idade) {
		Idade = idade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Idade, cor, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gato other = (Gato) obj;
		return Objects.equals(Idade, other.Idade) && Objects.equals(cor, other.cor) && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Gato [nome=" + nome + ", cor=" + cor + ", Idade=" + Idade + "]";
	}

	/*
	 * public Gato(String nome, String cor, Integer Idade){ this.nome = nome;
	 * this.cor = cor; this.Idade = Idade; }
	 */

}
