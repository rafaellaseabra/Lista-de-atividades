package ListaAtt02;

import java.util.Scanner;

public class Atividade07 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int soma=0,num;


		for (int i = 0; i <10; i ++) {

			System.out.println("Informe um NÚMERO: ");
			num= ler.nextInt();
			soma=soma+num;
			System.out.println ("A soma dos Números é igual: " + soma);

		}

	}

}
