package ListaAtt02;

import java.util.Scanner;

public class Atividade11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int media,soma=0,idade;


		for (int i= 0; i <20; i++) {
		System.out.println ( i++ + "-Informe sua IDADE: ");
		idade = ler.nextInt();
		System.out.println("A soma de TODAS as idades é: " + soma);
		soma=i+idade;
		
		}
		
		
		media=soma/20;
		System.out.println("A media de TODAS as idades é: " + media);
		
		}

	}


