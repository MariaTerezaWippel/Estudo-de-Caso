package modelo;

abstract public class Pedido {

	private String formaPagamento;
	private String Enderecoentrega;
	private String Cliente;
	
	abstract public String atualizarpagamento();
	abstract public String atualizarendereco();
	public abstract String getformaPagamento();
	public abstract void setNome(String getformaPagamento);
	public abstract String getNome();
}
