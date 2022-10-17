package questao1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Cliente {
	private String nome;
	private String CPF;
	private String RG;
	private Date nascimento;

	public Cliente(String nome, String CPF, String RG) {
		super();
		this.nome = nome;
		this.CPF = CPF;
		this.RG = RG;
	}
	public String getNascimento() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
		String strDate = formatter.format(this.nascimento);  
		return strDate;
	}

	public void setNascimento(int dia, int mes, int ano) {
        Calendar dataAtual = Calendar.getInstance();
        int anoAtual = dataAtual.get(Calendar.YEAR);
        int idade = anoAtual - ano;

		if(idade >= 18) {
			String data =  dia + "/" + mes + "/" + ano;
			nascimento = new Date(data);
		}
		else if(idade < 18 & idade > 0) {
			System.out.println("Menores de 18 anos não podem ter conta corrente, portanto, o programa será encerrado");
			System.exit(0);
		}
		else{
			System.out.println("Erro, Saindo....");
			System.exit(0);
		}
	}
	
	@Override
	public String toString() {
		return "Cliente [nome  = " + nome + ", CPF = " + CPF + ", RG = " + RG + ", Nascimento = " + getNascimento() + "]";
	}
}
