package controllers;

import model.Cliente;
import model.Compra;
import repositories.ClienteRepository;
import repositories.CompraRepository;

public class ClienteControlador {
	ClienteRepository cr = new ClienteRepository();
	CompraRepository compr = new CompraRepository();
	public void criarCliente(String nome, String cpf, String senha, String cartao, double limiteMax) {
		Cliente c = new Cliente(nome, cpf, senha, cartao, limiteMax);
		/*c.setNome(nome);
		c.setCpf(cpf);
		c.setSenha(senha);
		c.setNumCartao(cartao);
		c.setLimiteCreditoMax(limiteMax);
		
		return c;*/
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
	
	public void creditarCompraAoLimite(Compra compra) {
		Cliente c = new Cliente();
		if(validarCompra(compra)) {
			if(compra.getCartaoCliente().equals(c.getNumCartao())) {
				c.setLimiteCreditoAtual((c.getLimiteCreditoAtual() - compra.getValorTotal()));
			}
		}
	}
	
	
}
