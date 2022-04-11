package controllers;

import model.Cliente;
import model.Compra;
import model.Estabelecimento;
import repositories.ClienteRepository;
import repositories.CompraRepository;

public class EstabelecimentoControlador {
	ClienteRepository cr = new ClienteRepository();
	CompraRepository compr = new CompraRepository();
	
	public void criarEstabelecimento(Long id, String nome, int maxParcelas) {
		Estabelecimento e = new Estabelecimento(id, nome, maxParcelas);
	}
	
	public boolean validarCompra(Compra compra) {
		for(Cliente cliente : cr.clientes ) {
			if(cr.clientes.contains(cliente.getCpf()) && cliente.getNumCartao().equals(compra.getCartaoCliente())) {
				if(compra.getValorTotal() <= cliente.getLimiteCreditoAtual()) {
					compr.salvar(compra);
					return true;
				}
			}
		}
		
		return false;
	}
	
}
