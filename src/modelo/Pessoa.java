package modelo;

 public class Pessoa {



	private Long cpf;
	private String cidade;
	private String estado;
	
public Pessoa (Long cpf,String cidade, String Estado) {
		this.cidade = cidade;
		this.estado = estado;
		this.cpf = cpf;
	}

	public Pessoa() {

	}

	public String getcidade() {
		return cidade;
	}

	public void setcidade(String cidade) {
		this.cidade = cidade;
	}

	public String getestado() {
		return estado;
	}

	public void setestado(String estado) {
		this.estado = estado;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	

 }

