package controle;

import java.util.ArrayList;

import modelo.IPedidoDAO;
import modelo.Pedido;
import modelo.Pessoa;

public class PedidoDAO implements IPedidoDAO {

	private static ArrayList<Pessoa> tabelaPessoas;
	private static PedidoDAO instancia;

	
	private PedidoDAO() {
	}

	
	public static PedidoDAO getInstancia() {

		if (instancia == null) {
			instancia = new PedidoDAO();
			tabelaPessoas = new ArrayList<>();
		}

		return instancia;
	}

	@Override
	public boolean inserir(Pedido p) {
		if (p != null) {
			tabelaPessoas.add(p);
			return true;
		}
		return false;
	}

	@Override
	public boolean alterar(Pessoa p, long cpf) {
		for (Pessoa pessoa : tabelaPessoas) {

			if (pessoa.getCpf() == cpf) {
				pessoa.setNome(p.getNome());
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean excluir(Pessoa p, long cpf) {
		for (Pessoa pessoa : tabelaPessoas) {
			if (pessoa.getCpf() == cpf) {
				tabelaPessoas.remove(pessoa);
				return true;
			}
		}

		return false;
	}

	@Override
	public ArrayList<Pessoa> listarPessoas() {
		return tabelaPessoas;
	}

	@Override
	public boolean inserir(Pedido p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean alterar(Pedido p, String nome) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean excluir(Pedido p, String nome) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Pedido> listarPedidos() {
		// TODO Auto-generated method stub
		return null;
	}

}
