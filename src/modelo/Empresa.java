package modelo;

import java.util.ArrayList;

public class Empresa {

	private String cnpj;
	private String nomeEmpresa;
	private Integer telefonaEmpresa;
	private String cnpjNovo;
	
	private ArrayList<Empresa> empresas;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public Integer getTelefonaEmpresa() {
		return telefonaEmpresa;
	}

	public void setTelefonaEmpresa(Integer telefonaEmpresa) {
		this.telefonaEmpresa = telefonaEmpresa;
	}

	public String getCnpjNovo() {
		return cnpjNovo;
	}

	public void setCnpjNovo(String cnpjNovo) {
		this.cnpjNovo = cnpjNovo;
	}

	public ArrayList<Empresa> getEmpresas() {
		return empresas;
	}

	public void setEmpresas(ArrayList<Empresa> empresas) {
		this.empresas = empresas;
	}
	


	
}
