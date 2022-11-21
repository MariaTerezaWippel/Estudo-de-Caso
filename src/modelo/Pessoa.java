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

	

}
