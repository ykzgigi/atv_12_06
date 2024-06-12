package atv_12_06;

import java.util.Scanner;

public class Algoritmo_soma {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int soma = 0;

		for (int i = 1; i <=15; i++) {
			
			soma=soma + i;
			
			System.out.println(soma);

		}
	} 
}
