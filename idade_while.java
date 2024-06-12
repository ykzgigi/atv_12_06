package atv_12_06;

import java.util.Scanner;

public class idade_while {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		double numero, G=1;
		
		int soma=0;
		
		while (G <= 20) {
			
			G++;
			System.out.print("informe a idade :");
			
			numero = ler.nextDouble();
			soma += numero;
			
			System.out.println("A soma é "+ soma);
		}
		System.out.println("| A soma das idades é "+ soma + " |");


	}

}
