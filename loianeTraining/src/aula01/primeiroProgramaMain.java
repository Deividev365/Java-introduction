package aula01;

public class primeiroProgramaMain {

	public static void main(String[] args) {
		
		primeiroPrograma teste = new primeiroPrograma();
		primeiroPrograma teste1 = new primeiroPrograma();
		
		teste.name = "Deivid";
		teste.age = 18;
		
		System.out.println("Meu nome é: " + teste.name + " e eu tenho "  + teste.age + " anos");
		
		
		teste1.name = "Joao";
		teste1.age = 27;
		
		System.out.println("Meu nome é: " + teste1.name + " e eu tenho "  + teste1.age + " anos");
	}

}
