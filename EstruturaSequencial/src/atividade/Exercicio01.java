package atividade;
import java.util.Scanner;

/*
Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.
*/

public class Exercicio01 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		
		//Definição das variáveis
		int x;
		int y;
		int resultado;

		//Recebe o primeiro valor 
		System.out.print("Informe o primeiro valor: ");
		x = sc.nextInt();
		
		//Recebe o segundo valor 
		System.out.print("Informe o segundo valor: ");
		y = sc.nextInt();
		
		//Soma os valores
		resultado = x + y;
		
		//Imprime o resultado
		System.out.println("Soma = " + resultado);

		sc.close();
	}

}