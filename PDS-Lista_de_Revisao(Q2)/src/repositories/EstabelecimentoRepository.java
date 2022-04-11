package repositories;

import java.util.ArrayList;
import java.util.List;
import model.Estabelecimento;

public class EstabelecimentoRepository {
	public List<Estabelecimento> estabelecimentos = new ArrayList<>();
	
	public void salvar(Estabelecimento estabelecimento) {
		estabelecimentos.add(estabelecimento);
	}
	
	public Estabelecimento buscarPorID(Long id) {
		try {
			for(Estabelecimento estabelecimento : this.estabelecimentos) {
				if(estabelecimento.getId().equals(id))
					return estabelecimento;
			}
			
		}catch(Exception e){
			System.out.println("Estabelecimento não encontrado!");
		}
		
		return null;
	}
	
	
}
