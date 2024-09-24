package tech.d4nkali.composicao;

import java.util.Scanner;

public class Telefone {

	private int ddd;
	private String numero;

	Scanner sc3 = new Scanner(System.in);

	public int getDdd() {
		return ddd;
	}
	public void setDdd(int ddd) {
		this.ddd = ddd;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void cadastrar() {

		System.out.print("Informe o DDD: ");
		this.ddd = sc3.nextInt();

		System.out.print("Informe o numero: ");
		this.numero = sc3.nextLine();

	}

}
