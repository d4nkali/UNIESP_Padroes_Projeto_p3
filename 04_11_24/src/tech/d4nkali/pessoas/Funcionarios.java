package tech.d4nkali.pessoas;

import java.time.LocalDate;

import tech.d4nkali.composicao.Cargo;
import tech.d4nkali.interfaces.Cadastramento;

public class Funcionarios extends Pessoa implements Cadastramento {

	private int matricula;

	private Cargo cargo;

	private double salario;

	private LocalDate dataAdimissao;

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public LocalDate getDataAdimissao() {
		return dataAdimissao;
	}

	public void setDataAdimissao(LocalDate dataAdimissao) {
		this.dataAdimissao = dataAdimissao;
	}

}
