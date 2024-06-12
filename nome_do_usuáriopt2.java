package atv_12_06;

import java.util.Scanner;

public class nome_do_usuáriopt2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String nome;
		int i=0;

		System.out.println( "Informe seu nome:");
		nome= ler.next();
		
		while ( i<10) {
			System.out.println( "O nome digitado é: " + nome);
			System.out.println(i++);
		}
	}
}
