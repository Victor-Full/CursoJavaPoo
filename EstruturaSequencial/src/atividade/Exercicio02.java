package atividade;

import java.util.Scanner;
import java.util.Locale;

/*
Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159
*/

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		//Definição das variáveis
		double raio;
		double area;
		double pi = 3.14159;
		
		//Recebe valor do raio 
		System.out.print("Valor do raio do circulo: ");
		raio = sc.nextDouble();
		
		//Calculo area
		area = pi * raio * raio;
		
		//Imprime o resultado
		System.out.printf("Area = %.4f%n", area);
		
		sc.close();

	}

}