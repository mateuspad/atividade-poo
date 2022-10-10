package questao1;

public class Main {


	public static void main(String[] args) {
		
		
		Cliente cliente1 = new Cliente("Mateus", "12345678", "12345678");
		cliente1.setNascimento(10, 12, 1997);
		cliente1.getNascimento();
				
		
		ContaCorrente contaCorrente1 = new ContaCorrente(cliente1);
		contaCorrente1.deposito(100);
		contaCorrente1.extrato();
		contaCorrente1.saque(90);
		contaCorrente1.getSaldo(0);
		
		contaCorrente1.extrato();
		
		
		
		System.out.println("--------------------------------------------------------");
		
	

		Cliente cliente2 = new Cliente("Maria", "12345678", "12345678");
		//cliente2.setNascimento(1, 2, 1997);
		cliente2.getNascimento();
		
		
		ContaEspecial contaEspecial = new ContaEspecial(cliente2);
		contaEspecial.deposito(100);
		contaEspecial.extrato();
		contaEspecial.saque(90);
		contaEspecial.getSaldo(0);
		contaEspecial.extrato();
	}
}
