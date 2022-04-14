package model;

public class Estabelecimento {
	static private Long ultimoId = 1l;
	private Long id;
	private String nome;
	private int maxParcelas;
	
	public Estabelecimento(String nome, int maxParcelas) {
		this.id = ultimoId++;
		this.nome = nome;
		this.maxParcelas = maxParcelas;
	}
	
	
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
