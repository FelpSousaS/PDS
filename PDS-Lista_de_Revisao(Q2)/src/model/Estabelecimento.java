package model;

public class Estabelecimento {
	private Long id;
	private String nome;
	private int maxParcelas;
	
	public Estabelecimento(Long id, String nome, int maxParcelas) {
		this.id = id;
		this.nome = nome;
		this.maxParcelas = maxParcelas;
	}
	public Estabelecimento(){}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMaxParcelas() {
		return maxParcelas;
	}
	public void setMaxParcelas(int maxParcelas) {
		this.maxParcelas = maxParcelas;
	}
}
