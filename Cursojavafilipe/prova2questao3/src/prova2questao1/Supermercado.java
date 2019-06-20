package prova2questao1;

import java.util.Scanner;

public class Supermercado {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int cont = 1;
		boolean deu = false;
		int codigop;
		int metpag = 0;
		String sair = "N";
		
		Produtos maca = new Produtos(4.68 , 1260 , 1);
		Produtos banana = new Produtos(3.55 , 5724 , 2);
		Produtos cocacola2l = new Produtos(6.99 , 1899 ,3);
		Metodopagamento cartao = new Metodopagamento(false, false, false, 0);
		Metodopagamento cheque = new Metodopagamento(false, false, false, 0);
		Metodopagamento dinheiro = new Metodopagamento(false, false, false, 0);
		Cliente cliente = new Cliente(cont, 0, null, 0);
		
		while (deu == false) {
		System.out.println("pedido numero " + cont);
		cliente.pedido = cont;
		cont++;
		System.out.println("digite o codigo do produto 1 para maca 2 para banana e 3 para coca cola 2litros(nao pergunte)");
		codigop = ler.nextInt();
		System.out.println("digite a quantidade do pedido");
		cliente.qtdpedido = ler.nextInt();
			if (codigop == 1) {
				cliente.precopedido = cliente.precopedido + (maca.preco * cliente.qtdpedido);
				cliente.itempedido = "maca";
				System.out.println(maca.preco + " " + cliente.itempedido  + " preco total " + cliente.precopedido);
				maca.qtdestoque = maca.qtdestoque - cliente.qtdpedido;
			}
			else if (codigop == 2) {
				cliente.precopedido = cliente.precopedido + (banana.preco * cliente.qtdpedido);
				cliente.itempedido = "banana";
				System.out.println(banana.preco + " " + cliente.itempedido  + " preco total " + cliente.precopedido);
				banana.qtdestoque = banana.qtdestoque - cliente.qtdpedido;
			}
			else if (codigop == 3) {
				cliente.precopedido = cliente.precopedido + (cocacola2l.preco * cliente.qtdpedido);
				cliente.itempedido = "coca cola 2 litros";
				System.out.println("coca cola 2litros" + " preco total " + cliente.precopedido);
				cocacola2l.qtdestoque = cocacola2l.qtdestoque - cliente.qtdpedido;
			}
		System.out.println("selecione metodo de pagamento 1 cartao 2 para cheque 3 para dinheiro: ");
		metpag = ler.nextInt();
		if (metpag == 1) {
			cartao.qtdpag = cliente.precopedido;
			dinheiro.dinheiro = true;
			System.out.println("o valor de " + cliente.precopedido + " sera cobrado em cartao");
		}
		else if (metpag == 2) {
			cheque.qtdpag = cliente.precopedido;
			cartao.cartao = true;
			System.out.println("o valor de " + cliente.precopedido + " sera cobrado em cheque");
		}
		else if (metpag == 3) {
			dinheiro.qtdpag = cliente.precopedido;
			cheque.cheque = true;
			System.out.println("o valor de " + cliente.precopedido + " sera cobrado em dinheiro");
		}
		System.out.println("deseja finalizar o pedido? S ou N");
		sair = ler.next();		
		if (sair.equalsIgnoreCase("S")) {
			deu = true;
			System.out.println("programa finalizado");
		}	
		System.out.println("quantidade em estoque dos produtos " + "\n" +"macas "+ maca.qtdestoque + "\n" +"bananas "+ banana.qtdestoque + "\n" + "coca-cola 2litros " + cocacola2l.qtdestoque );
		
		}
	}
}
