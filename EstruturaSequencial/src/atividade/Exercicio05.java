package atividade;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
 */

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		//Definição das variáveis
		int codigoPeca1;
		int numeroPeca1;
		double valorUniPeca1;
		int codigoPeca2;
		int numeroPeca2;
		double valorUniPeca2;
		double pagar;

		//Recebe o código da peca1
		System.out.print("Informe o codigo da peca 1: ");
		codigoPeca1 = sc.nextInt();

		//Recebe o numero de pecas1
		System.out.print("Informe o numero de pecas 1: ");
		numeroPeca1 = sc.nextInt();

		//Recebe o valor unitário da peca1
		System.out.print("Informe o valor unitario das peca1: ");
		valorUniPeca1 = sc.nextDouble();

		//Recebe o código da peca2
		System.out.print("Informe o codigo da peca 2: ");
		codigoPeca2 = sc.nextInt();

		//Recebe o numero de pecas2
		System.out.print("Informe o numero de pecas 2: ");
		numeroPeca2 = sc.nextInt();

		//Recebe o valor unitário da peca2
		System.out.print("Informe o valor unitario das peca 2: ");
		valorUniPeca2 = sc.nextDouble();

		//Calcula o valor a pagar
		pagar = (numeroPeca1 * valorUniPeca1) + (numeroPeca2 * valorUniPeca2);

		//Imprime o valor a pagar
		System.out.printf("Valor a pagar: R$ %.2f%n", pagar);

		sc.close();
	}

}