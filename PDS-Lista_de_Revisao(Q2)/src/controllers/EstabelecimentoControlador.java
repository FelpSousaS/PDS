package controllers;

import model.Compra;
import model.Estabelecimento;
import repositories.ClienteRepository;
import repositories.CompraRepository;
import repositories.EstabelecimentoRepository;

public class EstabelecimentoControlador {
	ClienteRepository cr = new ClienteRepository();
	CompraRepository compr = new CompraRepository();
	EstabelecimentoRepository er = new EstabelecimentoRepository();
	
	public void criarEstabelecimento(String nome, int maxParcelas) {
		Estabelecimento est = new Estabelecimento(nome, maxParcelas);
		er.salvar(est);
	}
	
	public void validarCompra(Compra compra) {
		er.buscarPorID(compra.getIdEstabelecimento());

	}
	
}
