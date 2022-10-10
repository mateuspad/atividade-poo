package questao1;

public class ContaCorrente {
	protected Cliente cliente;
	protected float saldo;
	protected String movimentos = "";
	protected float taxa;

	public ContaCorrente(Cliente cliente) {
		super();
		this.cliente = cliente;
	}
	
	void deposito(float valor){
		movimentos += "\nDepósito de R$" + String.format("%.2f", valor) + "\n";
		this.saldo += valor;
	}
	
	void saque(float valor){
		double porcentualDaTaxa = 0.005;
		double valorDaTaxaSobreValor = valor * porcentualDaTaxa;
		double valorAcrescentadoDaTaxa = valor + valorDaTaxaSobreValor;
		movimentos += "Saque de R$" + String.format("%.2f", valor) + "\n";
		this.saldo -= valorAcrescentadoDaTaxa;
	}
	
	float getSaldo(float valor){
		return this.saldo;
	}
	
	void extrato(){
		System.out.println("Extrato:");
        System.out.println("Cliente: " + cliente);
        System.out.println("Saldo: " + saldo);	
        System.out.println("Movimentos: " + movimentos);
	}
}
