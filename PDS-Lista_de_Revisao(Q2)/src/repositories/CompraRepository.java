package repositories;

import java.util.ArrayList;
import java.util.List;
import model.Compra;
import model.Parcela;

public class CompraRepository {
    final List<Compra> compras = new ArrayList<>();
    final List<Parcela> parcelas = new ArrayList<>();

    public void salvar(Compra compra){
        compras.add(compra);
        parcelas.addAll(compra.getParcelas());
    }

    public List<Parcela> buscarPorClienteEntreIntervalo(String cartao, String Data1, String Data2){
        List<Parcela> parcelasCartao = new ArrayList<>();
        for (Compra compra: this.compras) {
            if(compra.getCartaoCliente().equals(cartao)){
                //todo filtrar pelas datas
                parcelasCartao.addAll(compra.getParcelas());
            }
        }
        return parcelasCartao;
    }
    public List<Parcela> buscarPorClienteApartirDe(String cartao, String Data1){
        List<Parcela> parcelasCartao = new ArrayList<>();
        for (Compra compra: this.compras) {
            if(compra.getCartaoCliente().equals(cartao)){
                //todo filtrar pelas datas
                parcelasCartao.addAll(compra.getParcelas());
            }
        }
        return parcelasCartao;
    }
    
    public List<Compra> getCompras(){
    	return compras;
    }
}
