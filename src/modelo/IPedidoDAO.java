package modelo;

import java.util.ArrayList;

public interface IPedidoDAO {

	public boolean inserir(Pedido p);

	public boolean alterar(Pedido p, String nome);

	public boolean excluir(Pedido p, String nome);

	public ArrayList<Pedido> listarPedidos();

}
