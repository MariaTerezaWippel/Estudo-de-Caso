package modelo;

import java.util.ArrayList;

public class Empresa {

	private Long cnpj;
	private String nome;
	private ArrayList<Empresa> malhas;

	public Long getCnpj() {
		return cnpj;
	}

	public void setCnpj(Long cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Empresa> getEmpresas() {
		return malhas;
	}

	public void setMalhas(ArrayList<Empresa> empresas) {
		this.malhas = malhas;
	}

}
