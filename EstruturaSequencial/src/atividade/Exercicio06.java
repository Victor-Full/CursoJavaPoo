package atividade;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
 */

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		//Definição das variáveis
		double a;
		double b;
		double c;
		double pi = 3.14159;
		double triangulo;
		double circulo;
		double trapezio;
		double quadrado;
		double retangulo;

		//Recebe o valor de A
		System.out.print("Informe valor de A: ");
		a = sc.nextDouble();

		//Recebe o valor de B
		System.out.print("Informe valor de B: ");
		b = sc.nextDouble();

		//Recebe o valor de C
		System.out.print("Informe valor de C: ");
		c = sc.nextDouble();

		//A área do triângulo retângulo que tem A por base e C por altura.
		triangulo = (a * c) / 2;
		System.out.printf("Triangulo = %.3f%n", triangulo);

		//A área do círculo de raio C. (pi = 3.14159)
		circulo = pi * (c * c);
		System.out.printf("Circulo = %.3f%n", circulo);

		//A área do trapézio que tem A e B por bases e C por altura.
		trapezio = ((a + b) * c) / 2;
		System.out.printf("Trapezio = %.3f%n", trapezio);

		//A área do quadrado que tem lado B.
		quadrado = b * b;
		System.out.printf("Quadrado = %.3f%n", quadrado);

		//A área do retângulo que tem lados A e B.
		retangulo = a * b;
		System.out.printf("Retangulo = %.3f%n", retangulo);

		sc.close();

	}

}