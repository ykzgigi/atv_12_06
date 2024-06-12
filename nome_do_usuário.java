package atv_12_06;

import java.util.Scanner;

public class nome_do_usuário {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String nome;
		
		System.out.print("informe seu nome: ");
		nome = ler.next();
		
		for (int i = 0; i <=10; i++) {
			
		System.out.println("o nome digitado é "+ nome);
		}

	}

}
