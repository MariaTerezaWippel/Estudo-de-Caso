package modelo;

abstract public class Pedido {

	private String formaPagamento;
	private String Enderecoentrega;
	private String Cliente;
	
	abstract public String atualizarpagamento();
	abstract public String atualizarendereco();
}
