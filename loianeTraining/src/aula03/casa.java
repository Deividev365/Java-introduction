package aula03;

import java.util.Scanner;


public class casa {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println("Digite o seu nome completo");
		String nomeCompleto = scan.nextLine();
		
		System.out.println("Digite o seu primeiro nome");
		// s� pega a primeira parte da String // 
		String primeiroNome = scan.next();
		
		System.out.println("Digite a Sua Idade");
		int idade = scan.nextInt();
		
		System.out.println("Seu nome completo � " + nomeCompleto);
		System.out.println("Seu primeiro nome � " + primeiroNome);
		System.out.println("Sua idade � " + idade + " anos");
		
		
		

	}

}
