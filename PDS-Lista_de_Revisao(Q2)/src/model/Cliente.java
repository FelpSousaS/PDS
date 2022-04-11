package model;

public class Cliente {
	private String nome;
	private String cpf;
	private String senha;
	private String numCartao;
	private double limiteCreditoMax;
	private double limiteCreditoAtual;
	
	
	public Cliente(String nome, String cpf, String senha, String numCartao, double limiteCreditoMax,
			double limiteCreditoAtual) {
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
		this.numCartao = numCartao;
		this.limiteCreditoMax = limiteCreditoMax;
		this.limiteCreditoAtual = limiteCreditoAtual;
	}
	public Cliente(String nome2, String cpf2, String senha2, String cartao, double limiteMax) {}
	public Cliente() {}
		
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNumCartao() {
		return numCartao;
	}
	public void setNumCartao(String numCartao) {
		this.numCartao = numCartao;
	}
	public double getLimiteCreditoMax() {
		return limiteCreditoMax;
	}
	public void setLimiteCreditoMax(double limiteCreditoMax) {
		this.limiteCreditoMax = limiteCreditoMax;
	}
	public double getLimiteCreditoAtual() {
		return limiteCreditoAtual;
	}
	public void setLimiteCreditoAtual(double limiteCreditoAtual) {
		this.limiteCreditoAtual = limiteCreditoAtual;
	}
	
	
}
