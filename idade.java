package atv_12_06;

import java.util.Scanner;

public class idade {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int media=0, soma=0;
		
		
		for (int i = 1; i <=20; i++) {
			double numero;
			
			System.out.print("informe a idade :");
			numero = ler.nextDouble();
			
			soma += numero;
			
			System.out.println("A soma é "+ soma);
		}
		media = (soma)/20;
		
		System.out.println("A soma das idades é "+ soma );
		System.out.println("A média das idades é " + media);


	}

}
