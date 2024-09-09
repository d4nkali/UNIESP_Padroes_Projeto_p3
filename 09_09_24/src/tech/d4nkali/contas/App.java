package tech.d4nkali.contas;
public class App {

    public static void main(String[] args) throws Exception {

        //* Criando objetos

		//Conta conta1 = new Conta(); 
		Conta conta2 = new Conta(02, 5000000);
		ContaEspecial ContaE1 = new ContaEspecial();
		ContaInvestimento ContaI1 = new ContaInvestimento();

		// Utilização dos estados

			//conta1.limite = 100000;
			//conta1.saldo = 50000;
			//conta1.nome = "Junin do Carro";
			//conta1.numero = 01;

		//conta1.sacar(650); //* Utilização do Comportamento
		conta2.sacar(650); //* Utilização do Comportamento
		ContaE1.sacar(900);
		ContaI1.sacar(1122);
		ContaI1.depositar(50000);

    }

}
