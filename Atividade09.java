package ListaAtt02;

import java.util.Scanner;

public class Atividade09 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int soma,idade;



		for (int i= 0; i <20; i++) {
		System.out.println ( i++ + "-Informe sua IDADE: ");
		idade = ler.nextInt();
		soma= i+idade;
		System.out.println("A soma de TODAS as idades é: " + soma);
		
		}
		
	}
}
