package main;

import java.util.List;
import controllers.*;
import model.*;
import repositories.*;

public class Aplicacao {

	public static void main(String[] args) {
		 System.out.println("Programa Cartao de Credito iniciado.");

	        //test 1
	        Compra compra1 = new Compra(1l, "1234", 120.0,
	                "01/04/2020", 1);
	        System.out.println("minha primeira compra:" + compra1.getDataRealizacao());

	        //test 2
	        CompraRepository compraRepo = new CompraRepository();
	        compraRepo.salvar(compra1);
	        compraRepo.salvar(new Compra(1l, "1234", 450.0,
	                "01/04/2020", 3));
	        compraRepo.salvar(new Compra(1l, "5678", 45.0,
	                "01/04/2020", 12));

	        //test3
	        List<Parcela> parcelas = compraRepo.
	                buscarPorClienteEntreIntervalo("5678","","");
	        System.out.println("quantidade de parcelas para cartao  = " + parcelas.size());

	        //test 4
	        CompraControlador compraControl = new CompraControlador();
	        try {
	            compraControl.realizarCompra(1l, "2222", 230.0, "01/04/2020", 0);
	            System.out.println("compra realizada com sucesso");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        try {
	            compraControl.realizarCompra(1l, "2222", 230.0, "01/04/2020", 2);
	            System.out.println("compra realizada com sucesso");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        
	        //test 5
	        

	}

}
