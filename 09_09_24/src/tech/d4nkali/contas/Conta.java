package tech.d4nkali.contas;

public class Conta {

	int numero;
	String nome;
	double saldo;

	boolean sacar (double quantidade) {

		if (this.saldo < quantidade) {
			return false;
		}

		else {

			double novoSaldo = this.saldo - quantidade;
			this.saldo = novoSaldo;
			return true;

		}

	}

	boolean depositar (double quantidade) {

		if (quantidade == 0 || quantidade < 0) {
			return false;
		}

		else {

			this.saldo = this.saldo + quantidade;
			return true;

		}

	}

	public Conta() {

		System.out.println("Conta VAZIA criada.");

	}

	public Conta(int numero, String nome, double saldo) {

		System.out.println("Objeto PREENCHIDO criado");
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;

	}

}
