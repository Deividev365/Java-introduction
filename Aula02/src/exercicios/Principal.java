package exercicios;

public class Principal {

	public static void main(String[] args) {
		
		Computer computador1 = new Computer();
		
		computador1.modelo = "Asus";
		computador1.preco = 2000;
		computador1.cor = "Preto";
		
		
		computador1.ligarComputador();
		
		System.out.println("O modelo do computador1 é " + computador1.modelo + " O preço é: " +
		computador1.preco + " A cor e" + computador1.cor );
		
		
		computador1.desligarComputador();
		
		
		
				
		

	}

}
