package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Compra {
	   static private Long ultimoId = 1l;
	    private final List<Parcela> parcelas = new ArrayList<>();
	    private Long id;
	    private Long idEstabelecimento;
	    private String cartaoCliente;
	    private Double valorTotal;
	    private String dataRealizacao;
	    private Integer numParcelas;

	    public Compra(Long idEstabelecimento, String cartaoCliente,
	                  Double valorTotal, String dataRealizacao, Integer numParcelas) {
	        this.id = ultimoId++;
	        this.idEstabelecimento = idEstabelecimento;
	        this.cartaoCliente = cartaoCliente;
	        this.valorTotal = valorTotal;
	        this.dataRealizacao = dataRealizacao;
	        this.numParcelas = numParcelas;
	        for (int i = 0; i < numParcelas; i++){
	            this.parcelas.add(new Parcela(this.id,valorTotal/numParcelas,
	                                this.dataRealizacao+"_"+i+"mês"));
	        }
	    }
	    
	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public Long getIdEstabelecimento() {
	        return idEstabelecimento;
	    }

	    public void setIdEstabelecimento(Long idEstabelecimento) {
	        this.idEstabelecimento = idEstabelecimento;
	    }

	    public String getCartaoCliente() {
	        return cartaoCliente;
	    }

	    public void setCartaoCliente(String cartaoCliente) {
	        this.cartaoCliente = cartaoCliente;
	    }

	    public Double getValorTotal() {
	        return valorTotal;
	    }

	    public void setValorTotal(Double valorTotal) {
	        this.valorTotal = valorTotal;
	    }

	    public String getDataRealizacao() {
	        return dataRealizacao;
	    }

	    public void setDataRealizacao(String dataRealizacao) {
	        this.dataRealizacao = dataRealizacao;
	    }

	    public Integer getNumParcelas() {
	        return numParcelas;
	    }

	    public void setNumParcelas(Integer numParcelas) {
	        this.numParcelas = numParcelas;
	    }

	    public Collection<? extends Parcela> getParcelas() {
	        return this.parcelas;
	    }
	    
}
