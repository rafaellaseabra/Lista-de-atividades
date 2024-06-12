package ListaAtt02;

import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nome;
		System.out.println ("Informe seu NOME: ");
		nome = ler.next();

		for (int i= 0; i <10; i++) {
			System.out.println("Seu NOME é: " +nome);
		}
        ler.close();
	}

}
