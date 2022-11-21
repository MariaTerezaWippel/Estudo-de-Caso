package modelo;

abstract public class Pedido {

	private String formaPagamento;
	private String Enderecoentrega;
	
	abstract public String atualizarpagamento();
	abstract public String atualizarendereco();
}
