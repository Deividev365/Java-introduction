package exercicio01;

public class Pessoa {
	
	
	
	// Atributos da classe Pessoa  //
	private String nome;
	private int dataNascimento;
	private double altura;
	private int idade;
	
	int anoAtual = 2021;
	
	
	// getters and Setters // 
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(int dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
	public void exibirDadosPessoa() {
		System.out.println("O " + nome + " nasceu em " + dataNascimento +  " e tem " + altura + " de altura" + " com " + calcularIdadePessoa(idade) + " anos de idade ");
	}
	
	
	public int calcularIdadePessoa(int idade) {
		idade = anoAtual - this.dataNascimento;
		
		this.idade = idade;
		return this.idade;
	}
	
	
	
	

	
	
	
	
	
	
}
