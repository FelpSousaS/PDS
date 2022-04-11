 
package controllers;

import model.Cliente;
import model.Compra;
import model.Estabelecimento;
import repositories.ClienteRepository;
import repositories.CompraRepository;
import repositories.EstabelecimentoRepository;

public class CompraControlador {
    final private CompraRepository compraRepo = new CompraRepository();
    private EstabelecimentoRepository er = new EstabelecimentoRepository();
    private ClienteRepository c = new ClienteRepository();
    Cliente cliente = new Cliente();

    public void realizarCompra(Long idEstabelecimento, String cartao, Double valorTotal,
                               String data, Integer numParcelas)  throws Exception{
        StringBuilder resultado = new StringBuilder("");
        // validacoes
        
        if(numParcelas <= 0){
           resultado.append("Erro: numParcelas igual ou menor do que zero;");
        }
        //todo validar valor > 0
        if(valorTotal <= 0) {
        	resultado.append("Erro: valor de compra menor ou igual a zero!");
        }
        //todo validar id estabelecimento
        for(Estabelecimento est : er.estabelecimentos) {
        	if(!(est.getId().equals(idEstabelecimento)))
        		resultado.append("Erro: Estabelecimento nao encontrado!");
        }
        //todo validar numero cartao
        for(Cliente cliente : c.clientes) {
        	if(!(cliente.getNumCartao().equals(cartao)))
        		resultado.append("Erro: Cartao invalido!");
        }
        //todo validar limite do cliente
        if(cliente.getLimiteCreditoAtual() < valorTotal ) {
        	resultado.append("Erro: Limite menor que o valor da compra!");
        }
        
        //todo validar data (formato valido)
        if(data.length() < 10 || data.length() > 10) {
        	resultado.append("Erro: Data invalida!");
        }
        // se alguma validacao não passou,
        // uma exceção é jogada com as mensagens de erro
        if(resultado.length()>0)
        {
            throw new Exception(resultado.toString());
        }

        // finalmente! se está tudo certo...
        compraRepo.salvar(new Compra(idEstabelecimento, cartao, valorTotal,
                                        data, numParcelas));
    }
    public void gerarFaturaEmAberto(String cartao){}
    public void gerarTotalEmAberto(String cartao){}
}
