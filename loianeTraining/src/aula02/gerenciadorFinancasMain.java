package aula02;

public class gerenciadorFinancasMain {

	public static void main(String[] args) {
		gerenciadorFinancas deivid = new gerenciadorFinancas("Deivid", "Banco Inter", 1247);
		gerenciadorFinancas Giovana = new gerenciadorFinancas("Giovana", "Banco Santander", 25487);
		gerenciadorFinancas Beatriz = new gerenciadorFinancas("Beatriz", "Banco Safra", 47788);
		gerenciadorFinancas Gabriel = new gerenciadorFinancas("Gabriel", "Banco Bradesco", 1247);
		
		
		System.out.println("Meu nome �: " + deivid.name + " meu banco �: " + deivid.bankName + ", o valor: " + deivid.budget);
		
		System.out.println("Meu nome �: " + Giovana.name + " meu banco �: " + Giovana.bankName + ", o valor: " + Giovana.budget);
		
		System.out.println("Meu nome �: " + Beatriz.name + " meu banco �: " + Beatriz.bankName + ", o valor: " + Beatriz.budget);
		
		System.out.println("Meu nome �: " + Gabriel.name + " meu banco �: " + Gabriel.bankName + ", o valor: " + Gabriel.budget);
	}

}
