package atv_12_06;

import java.util.Scanner;

public class IDADEPT4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		int soma=0;
		
		for (int i = 1; i <=20; i++) {
		double numero;
		
		System.out.print("informe sua idade: ");
		
		numero = ler.nextDouble();
		
		soma += numero;
		
		System.out.println("A soma é "+ soma);
		
		}
		System.out.println("A soma das idades é "+ soma);
		

	}

}
