package controle;

import java.util.ArrayList;

import modelo.IPedidoDAO;
import modelo.Pedido;
import modelo.Pessoa;
import modelo.Produto;

public class PedidoDAO implements IPedidoDAO {

	private static ArrayList<Pedido> PedidoProduto;
	private static PedidoDAO instancia;

	
	private PedidoDAO() {
	}

	
	public static PedidoDAO getInstancia() {

		if (instancia == null) {
			instancia = new PedidoDAO();
			PedidoProduto = new ArrayList<>();
		}

		return instancia;
	}

	@Override
	public boolean inserir1(Pedido p) {
		if (p != null) {
			PedidoProduto.add(p);
			return true;
		}
		return false;
	}

	@Override
	public boolean alterar1(Pedido p, String formaPagamento) {
		for (Pedido pedido : PedidoProduto) {

			if (pedido.getformaPagamento() == formaPagamento) {
				pedido.setNome(p.getformaPagamento());
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean excluir(Pedido p, String nome) {
		for (Pedido pedido :PedidoProduto) {
			if (pedido.getNome() == nome) {
				PedidoProduto.remove(pedido);
				return true;
			}
		}

		return false;
	}

	@Override
	public ArrayList<Pedido> listarPedido() {
		return PedidoProduto;
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
