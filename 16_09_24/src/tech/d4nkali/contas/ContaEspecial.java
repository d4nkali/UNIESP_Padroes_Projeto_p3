package tech.d4nkali.contas;

public class ContaEspecial extends Conta {

	double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	boolean sacar (double quantidade) {

		if (this.saldo < quantidade) {
			return false;
		}

		else {

			double novoSaldo = this.saldo - (quantidade * 0.99);
			this.saldo = novoSaldo;
			return true;

		}

	}

}
