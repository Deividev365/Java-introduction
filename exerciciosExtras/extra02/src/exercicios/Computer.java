package exercicios;

public class Computer {
	
	// setting attributes from my "computer class"
	public String modelo;
	public int preco;
	public String cor;
	
	public int volume = 1;
	
	
	
	public void ligarComputador() {
		System.out.println("Computador Ligado");
	}
	
	
	public void desligarComputador() {
		System.out.println("Computador Desligado");
	}
	
	
	public void aumentarVolume(int volume) {
		volume = volume + 1;
	}
	
	public void diminuirVolume(int volume) {
		volume = volume - 1;
	}
	
	
	
	
}
