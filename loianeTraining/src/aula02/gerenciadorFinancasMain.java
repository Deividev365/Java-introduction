package aula02;

public class gerenciadorFinancasMain {

	public static void main(String[] args) {
		gerenciadorFinancas deivid = new gerenciadorFinancas("Deivid", "Banco Inter", 1247);
		gerenciadorFinancas Giovana = new gerenciadorFinancas("Giovana", "Banco Santander", 25487);
		gerenciadorFinancas Beatriz = new gerenciadorFinancas("Beatriz", "Banco Safra", 47788);
		gerenciadorFinancas Gabriel = new gerenciadorFinancas("Gabriel", "Banco Bradesco", 1247);
		
		
		System.out.println("Meu nome é: " + deivid.name + " meu banco é: " + deivid.bankName + ", o valor: " + deivid.budget);
		
		System.out.println("Meu nome é: " + Giovana.name + " meu banco é: " + Giovana.bankName + ", o valor: " + Giovana.budget);
		
		System.out.println("Meu nome é: " + Beatriz.name + " meu banco é: " + Beatriz.bankName + ", o valor: " + Beatriz.budget);
		
		System.out.println("Meu nome é: " + Gabriel.name + " meu banco é: " + Gabriel.bankName + ", o valor: " + Gabriel.budget);
	}

}
