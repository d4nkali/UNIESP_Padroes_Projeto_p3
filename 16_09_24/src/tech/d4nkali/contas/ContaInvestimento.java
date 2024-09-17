package tech.d4nkali.contas;

public class ContaInvestimento extends Conta{

	private double taxa;
	private int prazo;

	public boolean sacar (double quantidade) {

		return super.sacar(quantidade * 1.01);

	}

	public boolean depositar (double quantidade) {

			return super.depositar(quantidade * 1.01);

	}

	public void aplicarRendimento(double taxa) {

		super.depositar(getSaldo() * taxa / 100);

	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	public int getPrazo() {
		return prazo;
	}

	public void setPrazo(int prazo) {
		this.prazo = prazo;
	}

}
