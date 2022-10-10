package questao2;

public class Fatura {
	private String codigo;
	private String descricao;
	private int quantidade;
	private double preco;
	
	public Fatura(String codigo, String descricao, int quantidade, double preco) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		
		if(quantidade < 0) {
			quantidade = 0;
		}
		
		else if(preco < 0.0){
			preco = 0;
		}
		
		this.quantidade = quantidade;
		this.preco = preco;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCódigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getTotalFatura() {
		return quantidade * preco;
	}
	@Override
	public String toString() {
		return "Fatura [Código = " + codigo 
			+ ", Descrição = " + descricao 
			+ ", Quantidade = " + quantidade 
			+ ", Preço = R$" + preco 
			+ ", Total da Compra = R$" + String.format("%.2f", getTotalFatura()) + "]";
	}
}
