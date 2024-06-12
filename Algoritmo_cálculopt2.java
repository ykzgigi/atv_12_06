package atv_12_06;

import java.util.Scanner;

public class Algoritmo_cálculopt2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		double numero, G=1;
		int soma=0;
		while (G <= 10) {
			G++;
			System.out.print("informe o numero :");
			numero = ler.nextDouble();
			soma += numero;
			System.out.println("A soma é "+ soma);
			
		}
		
		System.out.println("A soma dos numeros é "+ soma + " |");
		
	}
}



