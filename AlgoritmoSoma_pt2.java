package atv_12_06;

import java.util.Scanner;

public class AlgoritmoSoma_pt2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int X=0, soma=0;
		
		while (X < 15 ) {
			
			X++;
			
			soma=soma + X;
			
			System.out.println(soma);
		}

	}

}