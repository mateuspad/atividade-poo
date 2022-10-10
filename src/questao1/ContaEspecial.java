package questao1;

public class ContaEspecial extends ContaCorrente {

	public ContaEspecial(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	void saque(float valor){
		double porcentualDaTaxa = 0.001;
		double valorDaTaxaSobreValor = valor * porcentualDaTaxa;
		double valorAcrescentadoDaTaxa = valor + valorDaTaxaSobreValor;
		movimentos += "Saque de R$" + String.format("%.2f", valor) + "\n";
		this.saldo -= valorAcrescentadoDaTaxa;
	}
}
