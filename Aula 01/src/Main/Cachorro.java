package Main;

public class Cachorro {
	// Creating Attributes // 
	String name;
	int age;
	int height;
	
	
	// metodo construtor para o cachorro // 
	public Cachorro(String name) {
		this.name = name;
	}
	
	// Creating Methods/functions related to the class Cachorro
	public void latir() {
		
		if(height > 60) {
			System.out.println("Latido For!!");
		} else if(height > 25 ) {
			System.out.println("Latido Medio!!");
		} else {
			System.out.println("Nao Assusta!!");
		}
		
		
	}
	
}
