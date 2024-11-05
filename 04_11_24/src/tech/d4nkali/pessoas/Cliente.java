package tech.d4nkali.pessoas;

import tech.d4nkali.composicao.Profissao;

import java.time.LocalDate;
import java.util.Scanner;

public class Cliente extends Pessoa{

    private String codigo;
    private Profissao profissao;
    private String tipoProfissaoOutros;
    private Scanner leitor = new Scanner(System.in);

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Profissao getProfissao() {
        return profissao;
    }

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }

    public void cadastrar() {

        super.cadastrar();
        System.out.println("Informe o código do cliente: ");
        this.codigo = leitor.nextLine();
        System.out.println("Informe a profissão do cliente: ");
        Profissao profissao = Profissao.valueOf(leitor.nextLine());
        if(profissao == Profissao.OUTROS){

            System.out.println(("Informe sua profissão: "));
            this.tipoProfissaoOutros = leitor.nextLine();

        }

    }

	public void atualizaInformacoes() {

		System.out.println("Deseja atualiza as informações? (S/n) ");
		String respostaAtt = leitor.nextLine();

		if (respostaAtt.equalsIgnoreCase("S")) {

			System.out.println("Qual o novo nome: ");
			setNome(leitor.nextLine());
			System.out.print("Qual a nova profissao: ");
			setProfissao(Profissao.valueOf(leitor.nextLine()));

			System.out.print("Deseja atualizar a data de nascimento? (S/n) ");

			if (respostaAtt.equalsIgnoreCase("S")) {

				System.out.print("Informe o dia de nascimento: ");
				int dia = leitor.nextInt();
				System.out.print("Informe o mes de nascimento: ");
				int mes = leitor.nextInt();
				System.out.print("Informe o ano de nascimento: ");
				int ano = leitor.nextInt();
				leitor.nextLine();

				this.setDataNascimento((LocalDate.of(dia, mes, ano)));

			}

			System.out.print("Deseja cadastrar um novo endereço: (S/n) ");
			if (respostaAtt.equalsIgnoreCase("S")) {

				this.getEndereco().cadastrar();

			}

			System.out.print("Deseja cadastrar um novo telefone: (S/n) ");
			if (respostaAtt.equalsIgnoreCase("S")) {

				this.getTelsContato().cadastrar();

			}


			System.out.println("Deseja atualizar o código do cliente? (S/N)");
			respostaAtt = leitor.nextLine();
			if (respostaAtt.equalsIgnoreCase("S")) {

				System.out.println("Informe o novo código: ");
				this.codigo = leitor.nextLine();

			}

			if (respostaAtt.equalsIgnoreCase("S")) {

				System.out.println("Informe a nova profissão: ");
				Profissao novaProfissao = Profissao.valueOf(leitor.nextLine());
				this.setProfissao(novaProfissao);

				if (novaProfissao == Profissao.OUTROS) {
					System.out.println("Informe a nova profissão personalizada: ");
					this.tipoProfissaoOutros = leitor.nextLine();
				} else {
					this.tipoProfissaoOutros = null;
				}

			}

		}

		else {

			System.out.println("Nao atualizar!");

		}

	}

    public String toString() {
        return "Cliente{" +
                "codigo='" + codigo + '\'' +
                ", profissao=" + profissao +
                ", tipoProfissaoOutros='" + tipoProfissaoOutros + '\'' +
                "} ";
    }

}
