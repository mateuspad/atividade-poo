package questao2;

import java.util.Scanner;

public class FaturaTeste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
		System.out.print("Numero do Pedido: ");
		String codigo = sc.next();
		System.out.print("Descrição do Produto: ");
		String descricao = sc.next();
	    System.out.print("Quantidade: ");
	    int quantidade = sc.nextInt();
	    System.out.print("Preço: ");
	    double preco = sc.nextDouble();
	    
	    Fatura fatura = new Fatura(codigo, descricao, quantidade, preco);
	    
	    System.out.println(fatura);
	 
		sc.close();

	}

}
