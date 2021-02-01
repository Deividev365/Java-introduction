package exercicios;

public class TelevisoesPrincipal {

	public static void main(String[] args) {
		Televisoes televisaoSala = new Televisoes();
		
		
		System.out.println(
			"Está Televisao é da marca " + televisaoSala.fabricante + 
			"  E a televisão está: " + (televisaoSala.ligado == true ? "ligada" : "desligada") + " o volume é " + televisaoSala.volume
				
				
				);
		televisaoSala.ligar();
		televisaoSala.aumentarVolume();
		
		
		
		
		System.out.println(
				"Está Televisao é da marca " + televisaoSala.fabricante + 
				"  E a televisão está: " + (televisaoSala.ligado == true ? "ligada" : "desligada") + " o volume é " + televisaoSala.volume
					);
		
		

	}

}
