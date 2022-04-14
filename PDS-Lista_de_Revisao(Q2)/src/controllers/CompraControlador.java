package controllers;

import model.*;

public class CompraControlador {

    EstabelecimentoControlador ec = new EstabelecimentoControlador();
    

    public void realizarCompra(Long idEstabelecimento, String cartao, Double valorTotal,
                               String data, Integer numParcelas)  throws Exception {
    	// validacoes
        ec.validarCompra(new Compra(idEstabelecimento, cartao, valorTotal,
                data, numParcelas));
    }
    public void gerarFaturaEmAberto(String cartao){}
    public void gerarTotalEmAberto(String cartao){}
}
