package modelo;

public abstract class Produto {

	private String nomeProduto;
	private String corProduto;
	private Integer quantidade;
	private Float precos;
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getCorProduto() {
		return corProduto;
	}
	public void setCorProduto(String corProduto) {
		this.corProduto = corProduto;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Float getPrecos() {
		return precos;
	}
	public void setPrecos(Float precos) {
		this.precos = precos;
	}
}
