package exercicio01;

public class PessoaPrincipal {

	public static void main(String[] args) {
		
		// criando um objeto da classe Pessoa // 
		Pessoa pessoa = new Pessoa();

		// passando os valores para os atributos através do 'set'
		
		pessoa.setAltura(1.74);
		pessoa.setDataNascimento(2002);
		pessoa.setNome("Deivid Aleixo");
		pessoa.exibirDadosPessoa();
		
	}

}
