package com.d4nkali.beecrowd;

import java.util.Scanner;

public class Att1006 {

public static void main(String[] args) {

	Scanner leitor = new Scanner(System.in);

	double notaA = leitor.nextDouble();
	double notaB = leitor.nextDouble();
	double notaC = leitor.nextDouble();

	int pesoA = 2;
	int pesoB = 3; 
	int pesoC = 5;

	double media = (notaA*pesoA + notaB*pesoB + notaC*pesoC)/ (pesoA + pesoB + pesoC);
	System.out.println(String.format("Media = %.1f", media));

}

}
