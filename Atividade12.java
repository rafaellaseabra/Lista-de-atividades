package ListaAtt02;

import java.util.Scanner;

public class Atividade12 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int media,idade,soma;
        int i=0;

		while(i<19) {
		System.out.println ( i++ + "-Informe sua IDADE: ");
		idade = ler.nextInt();
		soma=i+idade;
		
		media= (soma)/20;
		System.out.println("A media de TODAS as idades é: " + media);
		
		}
		ler.close();
	}
}

