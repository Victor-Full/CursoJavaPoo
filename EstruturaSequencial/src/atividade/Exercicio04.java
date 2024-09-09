package atividade;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.
 */

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		//Definição das variáveis
		int funcionario;
		double horasTrabalhadas;
		double valorHora;
		double salario;

		//Recebe o número do funcionário digitado pelo usuário
		System.out.print("Numero do funcionario: ");
		funcionario = sc.nextInt();

		//Recebe o a quantidade de horas trabalhadas do funcionário digitado pelo usuário
		System.out.print("Horas trabalhadas: ");
		horasTrabalhadas = sc.nextDouble();

		//Recebe o valor da hora trabalhada do funcionário digitado pelo usuário
		System.out.print("Valor da hora de trabalho: ");
		valorHora = sc.nextDouble();

		//Calculo do salário
		salario =  horasTrabalhadas * valorHora;

		//Imprime o resultado
		System.out.println("Numero = " + funcionario);
		System.out.printf("Salario = %.2f%n", salario);

		sc.close();
	}

}