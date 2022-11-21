package modelo;

abstract public class ItemPedido {

	private Integer itempedido;
	private Integer quantpedido;
	private Float precopedido;
	
	abstract  public  Integer atualizarpedido();
	abstract public Integer atualizarquantpedido();
}
