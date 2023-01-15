package br.com.meubuscadordecep.dominio;

public class Endereco {
	String logradouro;
	String bairro;
	String localidade;
	String qtdPopulacao;
	
	public String getLogradouro() {
		return logradouro;
	}
	
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getLocalidade() {
		return localidade;
	}
	
	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}
	
	public String getQtdPopulacao() {
		return qtdPopulacao;
	}
	
	public void setQtdPopulacao(String qtdPopulacao) {
		this.qtdPopulacao = qtdPopulacao;
	}
	
	@Override
	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", bairro=" + bairro + ", localidade=" + localidade + ", qtdPopulacao" + qtdPopulacao + "]";
	}
	
	
}
