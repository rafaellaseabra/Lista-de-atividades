package ListaAtt02;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int soma=0,val, i=0;
	
		
		while(soma<14 ) {
			System.out.println ("Informe um valor: ");
			val=ler.nextInt();
			
			soma= (val+i);
			System.out.print(i++);
			System.out.println (" - A soma é: " + soma);
		}

	}

}
