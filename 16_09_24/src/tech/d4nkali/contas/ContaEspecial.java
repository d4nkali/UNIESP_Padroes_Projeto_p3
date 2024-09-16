package tech.d4nkali.contas;

public class ContaEspecial extends Conta {

	private double limite;

	public boolean sacar (double quantidade) {

			double QtdEspecial = quantidade * 0.99;
			return super.sacar(QtdEspecial);

		

	}

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

}
