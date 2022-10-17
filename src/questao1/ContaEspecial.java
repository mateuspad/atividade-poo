package questao1;

public class ContaEspecial extends ContaCorrente {

	public ContaEspecial(Cliente cliente) {
		super(cliente);
		this.taxa = (float) 0.001;
	}
}
