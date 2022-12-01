package visao;

import java.util.ArrayList;
import java.util.Scanner;

import controle.EmpresaDAO;
import modelo.Empresa;

public class MainExemplo {

	public static void main(String[] args) {

		Integer opcaoSelecionada = Integer.MAX_VALUE;
		Scanner leitura = new Scanner(System.in);
		EmpresaDAO bancoPessoa = EmpresaDAO.getInstancia();
		while (opcaoSelecionada != 0) {

			/**
			 * Esta é so uma proposta de menu de sistema.
			 *
			 * Voce nao precisa seguir esta ordem, desde que seu sistema respeite a logica
			 * de incluir, alterar, listar e excluir de alguma forma.
			 */
			System.out.println("- MENU EXEMPLO -");
			System.out.println("0 SAIR");
			System.out.println("1 CADASTRAR");
			System.out.println("2 ALTERAR");
			System.out.println("3 EXCLUIR");
			System.out.println("4 LISTAR");
			System.out.println("5 CADASTRAR MALHAS EMPRESA");
			opcaoSelecionada = Integer.valueOf(leitura.nextLine());

			switch (opcaoSelecionada) {
			case 0: {
				break;
			}
			case 1: {
				Empresa emp = new Empresa();
				System.out.println("Nome:");
				String nome = leitura.nextLine();
// fazer validacao
				System.out.println("Cpf:");
				String cpf = leitura.nextLine();
// fazer validacao
				emp.setNome(nome);

				/**
				 * Exemplo de validacao
				 *
				 */
				if (!cpf.isEmpty()) {
					emp.setCnpj(null);
				} else {
					System.out.println("Erro");
				}

				bancoPessoa.inserir(emp);
				break;
			}
			case 2: {
				System.out.println("Digite o CNPJ da empresa que deseja alterar:");
// finalizar codigo
				break;
			}
			case 3: {
				System.out.println("Digite o CNPJ da empresa que deseja excluir:");
// finalizar codigo
				break;
			}
			case 4: {
				ArrayList<Empresa> lista = bancoPessoa.listarEmpresas();
				for (Empresa empresa : lista) {
					System.out.println("Cnpj: " + empresa.getCnpj());
					System.out.println("Nome: " + empresa.getNome());
				}
				break;
			}

			}

		}

		leitura.close();
	}
}