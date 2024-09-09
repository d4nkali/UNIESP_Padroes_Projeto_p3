package tech.d4nkali.contas;

public class Conta {

	int numero;
	String nome;
	double saldo;
	double limite;

	void sacar (double quantidade) {

		double novoSaldo = this.saldo - quantidade;
		this.saldo = novoSaldo;

	}

	public Conta() {

		System.out.println("Conta VAZIA criada.");

	}

	public Conta(int numero, String nome, double saldo, double limite) {

		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
		this.limite = limite;

	}

}
