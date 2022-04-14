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
	        ClienteRepository cr1 = new ClienteRepository(); 
	        Cliente cliente1 = new Cliente("Antonio Silva","987654321","12345678","1231233534",2500,1958);
	        
	        cr1.salvar(cliente1);
	        cr1.salvar(new Cliente("Joao Pereira","1232535567","2324242","235656433",8000,6734));
	        
	        try {
	        	compraControl.realizarCompra(2l, "1231233534", 10000.0, "12/07/2021", 5);
	        }catch(Exception e) {
	        	e.printStackTrace();
	        }
	        
	        //test 6 
	        for(int i = 0; i < cr1.getClientes().size(); i++) {
	        	System.out.println("Cliente :" + cr1.getClientes().get(i).getNome());
	        }
	        
	        //test 7
	        Compra compra2 = new Compra(2l,"9999", 43.50, "26/08/2021", 5);
	        compraRepo.salvar(compra2);
	        
	        for(int i = 0; i < compraRepo.getCompras().size(); i++) {
	        	System.out.println("Compra : " + compraRepo.getCompras().get(i).getId() + " " + compraRepo.getCompras().get(i).getValorTotal());
	        }

	}

}
