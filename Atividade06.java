package ListaAtt02;

import java.util.Scanner;

public class Atividade06 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nome;
		System.out.println ("Informe seu NOME: ");
		nome = ler.next();
		int i=0;
		while (i<10) {
			System.out.println("Seu NOME é: " + nome);
			System.out.println(i++);
		}
        ler.close();
        }

}
