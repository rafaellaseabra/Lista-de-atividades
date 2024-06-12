package ListaAtt02;
import java.util.Scanner;

public class Atividade08 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int soma=0,num;
        int i=0;
        
		while (i<10) {
			System.out.println(" -Informe um NÚMERO: ");
			num= ler.nextInt();
			soma=soma+num;
			System.out.println ("A soma dos Números é igual: " + soma);
			System.out.print(i++);
		}
		ler.close();
	}

}
