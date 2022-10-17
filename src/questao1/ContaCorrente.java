package questao1;

public class ContaCorrente {
	protected Cliente cliente;
	protected float saldo;
	protected String movimentos = "";
	protected float taxa;

	public ContaCorrente(Cliente cliente) {
		this.cliente = cliente;
		this.taxa = (float) 0.005;
	}
	
	void deposito(float valor){
		movimentos += "\nDepósito de R$" + String.format("%.2f", valor) + "\n";
		this.saldo += valor;
	}
	
	void saque(float valor){
		double valorDaTaxaSobreValor = valor * this.taxa;
		double valorAcrescentadoDaTaxa = valor + valorDaTaxaSobreValor;
		movimentos += "Saque de R$" + String.format("%.2f", valor) + "\n";
		this.saldo -= valorAcrescentadoDaTaxa;
		if(this.saldo < 0){
			this.saldo = 0;
		}
	}
	
	float getSaldo(float valor){
		return this.saldo;
	}
	
	void extrato(){
		System.out.println("Extrato:");
        System.out.println("Cliente: " + cliente);
        System.out.println("Saldo: R$" + String.format("%.2f",getSaldo(0)));	
        System.out.println("Movimentos: " + movimentos);
	}
}
