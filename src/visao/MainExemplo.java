package visao;

import java.util.ArrayList;
import java.util.Scanner;

import controle.PessoaDAO;
import modelo.Pessoa;

public class MainExemplo {

	public static void main(String[] args) {

		Integer opcaoSelecionada = Integer.MAX_VALUE;
		Scanner leitura = new Scanner(System.in);
		PedidoDAO bancoPessoa = PedidoDAO.getInstancia();
		while (opcaoSelecionada != 0) {

			
			System.out.println("- MENU EXEMPLO -");
			System.out.println("0 SAIR");
			System.out.println("1 CADASTRAR");
			System.out.println("2 ALTERAR");
			System.out.println("3 EXCLUIR");
			System.out.println("4 LISTAR");
			opcaoSelecionada = Integer.valueOf(leitura.nextLine());

			switch (opcaoSelecionada) {
			case 0: {
				break;
			}
			case 1: {
				Pessoa p = new Pessoa();
				System.out.println("Nome:");
				String nome = leitura.nextLine();
				
				System.out.println("Cpf:");
				String cpf = leitura.nextLine();
				
				System.out.println("Sexo:");
				String sexo = leitura.nextLine();
				
				System.out.println("Email:");
				String email = leitura.nextLine();
				
				System.out.println("Numero de telefone:");
				String numeTelefo = leitura.nextLine();
				
				
				
				p.setNome(nome);

				/**
				 * Exemplo de validacao
				 * 
				 */
				if (!cpf.isEmpty()) {
					p.setCpf(Long.valueOf(cpf));
				} else {
					System.out.println("Erro");
				}

				bancoPessoa.inserir(p);

			}
			case 2: {
				System.out.println("Digite o codigo da pessoa que deseja alterar:");
				// finalizar codigo
			}
			case 3: {
				System.out.println("Digite o codigo da pessoa que deseja excluir:");
				// finalizar codigo
			}
			case 4: {
				ArrayList<Pessoa> lista = bancoPessoa.listarPessoas();
				for (Pessoa pessoa : lista) {
					System.out.println("Cpf: " + pessoa.getCpf());
					System.out.println("Nome: " + pessoa.getNome());
				}
			}

			}

		}

		leitura.close();
	}
}
