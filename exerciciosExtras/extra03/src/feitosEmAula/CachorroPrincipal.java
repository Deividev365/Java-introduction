package feitosEmAula;

public class CachorroPrincipal {

	public static void main(String[] args) {
		
		Cachorro cachorro1 = new Cachorro();
		
		cachorro1.setNome("Meg");
		cachorro1.setIdade(7);
		
		
		System.out.println("O nome do meu cachorro é: " + cachorro1.getNome() + " e tem: " + cachorro1.getIdade() + "Anos" );
	}

}
