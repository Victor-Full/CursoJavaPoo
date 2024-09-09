package atividade;

import java.util.Scanner;

/*
Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
*/

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//Definição das variáveis
		int a;
		int b;
		int c;
		int d;
		int resultado;

		//Recebe valor de A 
		System.out.print("Valor de A: ");
		a = sc.nextInt();

		//Recebe valor de B 
		System.out.print("Valor de B: ");
		b = sc.nextInt();

		//Recebe valor de C 
		System.out.print("Valor de C: ");
		c = sc.nextInt();

		//Recebe valor de D 
		System.out.print("Valor de D: ");
		d = sc.nextInt();

		//Calculo diferença
		resultado = (a * b - c * d);

		//Imprime o resultado
		System.out.println("Diferenca = " + resultado);

		sc.close();

	}

}