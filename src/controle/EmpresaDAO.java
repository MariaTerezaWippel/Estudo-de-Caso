package controle;

import java.util.ArrayList;

import modelo.Empresa;
import modelo.IEmpresaDAO;

public class EmpresaDAO implements IEmpresaDAO {

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
	public boolean inserir(Empresa malha) {
		if (malha != null) {
			empresas.add(malha);
			return true;
		}
		return false;
	}

	@Override
	public boolean alterar(Empresa empresaAlterar, Long cnpj) {
		for (Empresa empresa : empresas) {

			if (empresa.getCnpj() == cnpj) {
				empresa.setNome(empresaAlterar.getNome());
// terminar TODO botar sets
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deletar(Empresa malhaExcluir, Long cnpj) {
		for (Empresa malha : empresas) {
			if (malha.getCnpj() == cnpj) {
				empresas.remove(malhaExcluir);
				return true;
			}
		}

		return false;
	}

	@Override
	public ArrayList<Empresa> listarEmpresas() {
		return empresas;
	}

}