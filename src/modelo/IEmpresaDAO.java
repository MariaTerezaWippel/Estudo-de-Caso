package modelo;

import java.util.ArrayList;

public interface IEmpresaDAO {

	public boolean inserir(Empresa empresa);

	public boolean alterar(Empresa empresa, Long cnpj);

	public boolean deletar(Empresa empresa, Long cnpj);

	public ArrayList<Empresa> listarEmpresas();

}
