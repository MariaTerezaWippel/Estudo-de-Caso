package controle;

import java.util.ArrayList;

import modelo.Empresa;
import modelo.IEmpresaDAO;
import modelo.Malha;

public  class EmpresaDAO implements IEmpresaDAO {

	private static ArrayList<Empresa> empresas;
	private static EmpresaDAO instancia;
	public static EmpresaDAO getInstancia() {

		if (instancia == null) {
			instancia = new EmpresaDAO();
			empresas = new ArrayList<>();
		}

		return instancia;
	}

	@Override
	public boolean inserir(Empresa empresa) {
		if (empresa != null) {
			empresas.add(empresa);
			return true;
		}
		return false;
	}

	@Override
	public boolean alterar(Empresa empresaAlterar, String cnpj) {
		for (Empresa empresa : empresas) {

			if (empresa.getCnpj() == cnpj) {
				empresa.setNomeEmpresa(empresaAlterar.getNomeEmpresa());
				empresa.setEmpresas(empresas);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deletar(Empresa empresaExcluir, String cnpj) {
		for (Empresa empresa : empresas) {
			if (empresa.getCnpj() == cnpj) {
				empresas.remove(empresaExcluir);
				return true;
			}
		}

		return false;
	}

	@Override
	public ArrayList<Empresa> listarEmpresas() {
		return empresas;
	}


	public void listarMalhas() {
		
	}

	public void cadastrarMalhas() {
		
	}

	

	
}