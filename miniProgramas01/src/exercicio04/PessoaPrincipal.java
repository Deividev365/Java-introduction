package exercicio04;

public class PessoaPrincipal {

	public static void main(String[] args) {
		Pessoa familia1 = new Pessoa();
		
		familia1.setNome("Deivid");
		familia1.setIdade(18);
		familia1.setNomeMae("Maria");
		familia1.setIdadeMae(46);
		familia1.setNomePai("Paulo");
		familia1.setIdadePai(48);
		
		
		familia1.exibirArvoreGenealogica();
		

	}

}
