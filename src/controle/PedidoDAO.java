package controle;

import java.util.ArrayList;

import modelo.IPedidoDAO;
import modelo.Pedido;
import modelo.Pessoa;
import modelo.Produto;

public class PedidoDAO {

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

	public boolean inserir1(Pedido p) {
		if (p != null) {
			PedidoProduto.add(p);
			return true;
		}
		return false;
	}

	public boolean alterar1(Pedido p, String formaPagamento) {
		for (Pedido pedido : PedidoProduto) {

			if (pedido.getformaPagamento() == formaPagamento) {
				pedido.setNome(p.getformaPagamento());
				return true;
			}
		}
		return false;
	}

	public boolean excluir1(Pedido p, String nome) {
		for (Pedido pedido :PedidoProduto) {
			if (pedido.getNome() == nome) {
				PedidoProduto.remove(pedido);
				return true;
			}
		}

		return false;
	}

	public ArrayList<Pedido> listarPedido() {
		return PedidoProduto;
	}

	public boolean inserir(Pedido p) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean alterar(Pedido p, String nome) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean excluir(Pedido p, String nome) {
		// TODO Auto-generated method stub
		return false;
	}

	public ArrayList<Pedido> listarPedidos() {
		// TODO Auto-generated method stub
		return null;
	}

}
