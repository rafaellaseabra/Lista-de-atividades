package ListaAtt02;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int soma=0,num;
		for (int i = 0; i <14; i ++) {

			System.out.println("Informe um valor: ");
			num= ler.nextInt();
			soma=num+i;
			System.out.println("Calculando a soma de 1 a 15: " + soma);

		}


	}

}
