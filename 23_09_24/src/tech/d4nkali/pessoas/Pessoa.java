package tech.d4nkali.pessoas;

import java.util.Scanner;

import tech.d4nkali.composicao.Endereco;
import tech.d4nkali.composicao.Telefone;

public class Pessoa {

	private String nome;
	private String dataNascimento;
	private Endereco endereco;
	private Telefone telContato;

	Scanner sc = new Scanner(System.in);

	public Telefone getTelContato() {
		return telContato;
	}

	public void setTelContato(Telefone telContato) {
		this.telContato = telContato;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void cadastrar() {

		System.out.println("Informe o nome: ");
		this.nome = sc.nextLine();

		System.out.print("Informe o data de nascimento: ");
		this.dataNascimento = sc.nextLine();

		endereco = new Endereco();
		endereco.cadastrar();

		telContato = new Telefone();
		telContato.cadastrar();

	}

	public String obterIdade() {

		return "";

	}

}
