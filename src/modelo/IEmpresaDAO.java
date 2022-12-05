package modelo;

import java.util.ArrayList;

public interface IEmpresaDAO {

	public boolean inserir(Empresa empresa);

	public boolean alterar(Empresa empresa, String cnpj);

	public boolean deletar(Empresa empresa, String cnpj);

	public ArrayList<Empresa> listarEmpresas();

}