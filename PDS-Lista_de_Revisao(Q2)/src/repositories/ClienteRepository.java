package repositories;

import java.util.ArrayList;
import java.util.List;
import model.Cliente;

public class ClienteRepository {
	public List<Cliente> clientes = new ArrayList<>();
	
	public void salvar(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public Cliente buscarPorCPF(String cpf) {
		try {
			for(Cliente cliente : this.clientes) {
				if(cliente.getCpf().equals(cpf)) 
					return cliente;
			}
		}catch(Exception e) {
			System.out.println("Cliente não encontrado!");
		}
		return null;
	}
	
	public Cliente buscarPorCartao(String cartao) {
		try {
			for(Cliente cliente : this.clientes) {
				if(cliente.getNumCartao().equals(cartao)) 
					return cliente;
			}
		}catch(Exception e) {
			System.out.println("Cliente não encontrado!");
		}
		return null;
	}
}
