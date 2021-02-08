package exercicio04;

public class Pessoa {

	private String nome;
	private int idade;
	private String nomePai;
	private int idadePai;
	private String nomeMae;
	private int idadeMae;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getNomePai() {
		return nomePai;
	}
	
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	
	public int getIdadePai() {
		return idadePai;
	}
	
	public void setIdadePai(int idadePai) {
		this.idadePai = idadePai;
	}
	
	public String getNomeMae() {
		return nomeMae;
	}
	
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	
	public int getIdadeMae() {
		return idadeMae;
	}
	
	public void setIdadeMae(int idadeMae) {
		this.idadeMae = idadeMae;
	}
	
	
	public void exibirArvoreGenealogica() {
		System.out.println("O meu nome é: " + getNome() + " e tenho: " + getIdade() + " anos " + " minha mae se chama" + getNomeMae() + " e tem" + getIdadeMae() + " anos" + " meu pai se chama " + getNomePai() + " e tem " + getIdadePai() + " anos " );
	}
	
	
	
	
	
	
	
	
}
