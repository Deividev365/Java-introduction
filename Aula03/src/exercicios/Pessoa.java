package exercicios;

public class Pessoa {
	
	
	private String nome;
	private int dataNascimento;
	private double altura;
	
	
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
	
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	
	public void exibirDadosPessoa() {
		
		nome = "Deivid";
		dataNascimento = 2002;
		altura = 1.74;
	}
	
	
	public void calcularIdade() {
		
		//calcAge = anoAtual - dataNascimento;
		
	}
	
	
	
	
}
