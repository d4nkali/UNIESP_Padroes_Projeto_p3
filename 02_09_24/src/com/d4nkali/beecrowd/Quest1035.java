package com.d4nkali.beecrowd;

import java.util.Scanner;

/*

Questão 1035:

Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D for maior do que A, e a soma de C 
com D for maior que a soma de A e B e se C e D, ambos, forem positivos e se a variável A for par escrever a 
mensagem "Valores aceitos", senão escrever "Valores nao aceitos".

Entrada
Quatro números inteiros A, B, C e D.

Saída
Mostre a respectiva mensagem após a validação dos valores.

*/

public class Quest1035 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int valorA = sc.nextInt();
		int valorB = sc.nextInt();
		int valorC = sc.nextInt();
		int valorD = sc.nextInt();

		if ((valorB > valorC) && (valorD > valorA) 
		&& (valorC + valorD) > (valorA + valorB) 
		&& (valorA % 2 == 0)) {

			System.out.println("Valores Aceitos");

		}

		else {

			System.out.println("Valores nao Aceitos");

		}

		sc.close();

	}

}
