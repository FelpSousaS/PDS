package model;

public class Parcela {
    static private Long ultimoId = 1l;
    private Long id;
    private Long idCompra;
    private Double valor;
    private String dateVencimento;
    
    public Parcela(Long idCompra, Double valor, String dateVencimento) {
        this.dateVencimento = dateVencimento;
        this.idCompra = idCompra;
        this.valor = valor;
        this.id = ultimoId++;
    }
}
