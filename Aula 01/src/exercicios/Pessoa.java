package exercicios;

public class Pessoa {
	
	// defining attributes
	String name;
	String gender;
	int age;
	int height;
	String eyeColor;
	
	// constructor method // 
	public Pessoa(String name) {
		this.name = name;
	}
	
	// defining methods
	public void falar() {
		System.out.println("Humanos Falam");
	}
	
	public void andar() {
		
		System.out.println("Humanos Andam");
	}

}
