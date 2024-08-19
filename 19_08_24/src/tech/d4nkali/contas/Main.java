package tech.d4nkali.contas;

public class Main {
    public static void main(String[] args) throws Exception {

		Conta conta1 = new Conta(); //* Criando objeto

		// Utilização dos estados

			conta1.limite = 100000;
			conta1.saldo = 50000;
			conta1.nome = "Junin do Carro";
			conta1.numero = 01;

		conta1.sacar(650); //* Utilização do Comportamento

    }

}
