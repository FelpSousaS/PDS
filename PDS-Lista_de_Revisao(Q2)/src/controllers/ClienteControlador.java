package controllers;

import model.Cliente;
import model.Compra;
import repositories.ClienteRepository;
import repositories.CompraRepository;

public class ClienteControlador {
	ClienteRepository cr = new ClienteRepository();
	CompraRepository compr = new CompraRepository();
	
	public void criarCliente(String nome, String cpf, String senha, String cartao, double limiteMax, double limiteAtual) {
		Cliente c = new Cliente(nome, cpf, senha, cartao, limiteMax, limiteAtual);
		cr.salvar(c);
	}
	
	public boolean validarCompra(Compra compra) {
		for(Cliente cliente : cr.getClientes()) {
			if(cr.getClientes().contains(cliente.getCpf()) && cliente.getNumCartao().equals(compra.getCartaoCliente())) {
				if(compra.getValorTotal() <= cliente.getLimiteCreditoAtual()) {
					compr.salvar(compra);
					return true;
				}
			}
		}
		
		return false;
	}
	
	public void creditarCompraAoLimite(Compra compra) {
		if(validarCompra(compra)) {
			for(Cliente c : cr.getClientes()) {
				if(cr.buscarPorCartao(compra.getCartaoCliente()).equals(c.getNumCartao())) {
					c.setLimiteCreditoAtual((c.getLimiteCreditoAtual() - compra.getValorTotal()));
				}
			}
		}
	}
	
	
}
