package tech.d4nkali.composicao;

import java.util.Scanner;

public class Endereco {

	private String rua;
	private String numero;
	private String cep;
	private String cidade;
	private String estado;
	private String pais;

	Scanner sc2 = new Scanner(System.in);

	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public void cadastrar() {

		System.out.print("Informe a rua: ");
		this.rua = sc2.nextLine();

		System.out.print("Informe o numero da rua: ");
		this.numero = sc2.nextLine();

		System.out.print("Informe o CEP: ");
		this.cep = sc2.nextLine();

		System.out.print("Informe a cidade: ");
		this.cidade = sc2.nextLine();

		System.out.print("Informe o estado: ");
		this.estado = sc2.nextLine();

		System.out.print("Informe o pais: ");
		this.pais = sc2.nextLine();

	}

}
