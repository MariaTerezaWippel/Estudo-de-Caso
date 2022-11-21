package modelo;

public class Pessoa {

	private String nome;
	private String sexo;
	private String email;
	private Integer numeTelefo;
	private Long cpf;
	 

	public Pessoa(String nome,String sexo, String email,Integer numeTelefo, Long cpf) {
		this.nome = nome;
		this.sexo = sexo;
		this.email = email;
		this.numeTelefo = numeTelefo;
		this.cpf = cpf;
	}

	public Pessoa() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getNumeTelefo() {
		return numeTelefo;
	}

	public void setNumeTelefo(Integer numeTelefo) {
		this.numeTelefo = numeTelefo;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	

}
