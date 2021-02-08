package feitosEmAula;

public class Cachorro {
	
	// modificadores de acesso //
	// ((Public, Private, Protected)) //
	
	// def the attributes of my class 'Cachorro'
	private String nome;
	private int peso;
	private String corOlhos;
	private int idade;
	private int tamanho;
	
	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getPeso() {
		return peso;
	}



	public void setPeso(int peso) {
		this.peso = peso;
	}



	public String getCorOlhos() {
		return corOlhos;
	}



	public void setCorOlhos(String corOlhos) {
		this.corOlhos = corOlhos;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public int getTamanho() {
		return tamanho;
	}



	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}



	// constructor method from my class // 
	public Cachorro(String nome, int peso, String corOlhos, int idade, int tamanho) {
		// instanciando//
		this.nome = nome;
		this.peso = peso;
		this.corOlhos = corOlhos;
		this.idade = idade;
		this.tamanho = tamanho;
	}
	
	
	
	// Criei o método da minha classe, ou função como chamaos em outras linguagens
	public void latir() {
		if(tamanho > 60) {
			System.out.println("Latido Alto");
		} else if(tamanho > 25) {
			System.out.println("Latido Medio");
		} else {
			System.out.println("Não Assusta");
		}
	}
	
	
}
