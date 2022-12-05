package visao;

import java.util.ArrayList;
import java.util.Scanner;

import controle.EmpresaDAO;
import controle.MalhaDAO;
import modelo.Empresa;
import modelo.Malha;

public class Main {

	public static void main(String[] args) {

		Integer opcaoSelecionada = Integer.MAX_VALUE;
		Scanner leitura = new Scanner(System.in);
		EmpresaDAO bancoProduto = EmpresaDAO.getInstancia();
		MalhaDAO bancoProdutos = MalhaDAO.getInstanciamalha();
		EmpresaDAO bancoCadastro = EmpresaDAO.getInstancia();
		
		while (opcaoSelecionada != 0) {

			
			System.out.println("- MENU EXEMPLO -");
			System.out.println("0 SAIR");
			System.out.println("1 LOGIN DA EMPRESA");
			System.out.println("2 ALTERAR");
			System.out.println("3 EXCLUIR");
			System.out.println("4 CADASTRAR MALHAS NA EMPRESA ");
			System.out.println("5 LISTAR CADASTRO");

			opcaoSelecionada = Integer.valueOf(leitura.nextLine());

			switch (opcaoSelecionada) {
			case 0: {
				break;
			}
			case 1: {
				Empresa emp = new Empresa();
				Empresa emp2 = new Empresa();
				System.out.println("Nome:");
				String nome = leitura.nextLine();
				emp.setNomeEmpresa(nome);
				if (!nome.isEmpty()) {
					emp.setNomeEmpresa(nome);
				} 
				else {
					System.out.println("Erro");
				}
				
				System.out.println("Cnpj:");
				String cnpj = leitura.nextLine();
				
				if (!cnpj.isEmpty()) {
					emp.setCnpj(cnpj);
				} 
				else {
					System.out.println("Erro");
				}
				

				System.out.println("Empresa Cadastrada");
				System.out.println("----------------------------");
				
				
				bancoCadastro.inserir(emp2);
				
				break;
			}
			case 2: {
				Empresa empresa = new Empresa();
				Empresa emp2 = new Empresa();
				
				System.out.println("Digite o CNPJ da empresa que deseja alterar:");
				String cnpj = leitura.nextLine();
				
				if (!cnpj.isEmpty()) {
					empresa.setCnpj(cnpj);
				} 
				else {
					System.out.println("Erro");
				}
				System.out.println("Cnpj novo:");
				String cnpjnovo = leitura.nextLine();
				
				if (!cnpjnovo.isEmpty()) {
					empresa.setCnpj(cnpjnovo);
				} 
				else {
					System.out.println("Erro");
				}
				
				System.out.println("Cnpj Alterado");
				bancoProduto.inserir(empresa);
				bancoCadastro.inserir(emp2);
				System.out.println("---------------------------------------------------");
				
				break;
			}
			case 3: {
				Empresa emp1 = new Empresa();
				Empresa emp2 = new Empresa();
				
				System.out.println("Digite o CNPJ da empresa que deseja excluir:");
				String cnpj = leitura.nextLine();
				if (!cnpj.isEmpty()) {
					emp1.setCnpj(cnpj);
				} 
				else {
					System.out.println("Erro");
				}
				System.out.println("Cnpj da Empresa excluido");
				System.out.println("---------------------------------------------------");
				
				bancoCadastro.inserir(emp2);
				break;
				
			}
			
			case 4: {
				Malha mal = new Malha();
				Malha mal1 = new Malha();
				
				System.out.println("Codigo Malha:");
				String codMalha = leitura.nextLine();

				mal.setCodMalha(codMalha);
				if (!codMalha.isEmpty()) {
					mal.setCodMalha(codMalha);
				} 
				else {
					System.out.println("Erro");
				}
				
				System.out.println("Estilo da malha:");
				String estiloMalha = leitura.nextLine();
				if (!estiloMalha.isEmpty()) {
					mal.setEstiloMalha(estiloMalha);
				} 
				else {
					System.out.println("Erro");
				}
				
				System.out.println("Cor da malha:");
				String corMalha = leitura.nextLine();
				if (!corMalha.isEmpty()) {
					mal.setCorMalha(corMalha);
				} 
				else {
					System.out.println("Erro");
				}
				
				System.out.println("Tipo de fio da malha:");
				String tiposfiosMalha = leitura.nextLine();
				if (!tiposfiosMalha.isEmpty()) {
					mal.setTiposfiosMalha(tiposfiosMalha);
				} 
				else {
					System.out.println("Erro");
				}
				System.out.println("Malha  Cadastrada na Empresa");
				System.out.println("-----------------------------------");
				bancoProduto.cadastrarMalhas(); 

				break;
				
			}
			case 5: {
				
				
				ArrayList<Empresa> lista = bancoCadastro.listarEmpresas();
				Empresa emp = new Empresa();
				for (Empresa emp1 : lista) {
					System.out.println("Nome da empresa:"+emp.getNomeEmpresa());
					System.out.println("Cnpj da empresa:"+emp.getCnpjNovo());

				}
				ArrayList<Malha> lista1 = bancoProdutos.listarMalhas();
				Malha ma11 = new Malha();
				for (Malha mal : lista1) {
					System.out.println("Código da malha:"+ma11.getCodMalha());
					System.out.println("Cor da malha:"+ma11.getCorMalha());
					System.out.println("Tipos da malha:"+ma11.getTiposfiosMalha());
					System.out.println("Estilo da malha:"+ma11.getEstiloMalha());

				}
				break;
			}

			}
			
			
		}

	 
	}
}
