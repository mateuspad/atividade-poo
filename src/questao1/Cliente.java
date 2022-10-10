package questao1;

import java.text.ParseException;
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
	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(int dia, int mes, int ano) {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
        Calendar data_atual = Calendar.getInstance();
        int ano_atual = data_atual.get(Calendar.YEAR);
        int idade = ano_atual - ano;
		if(idade > 18) {
			String data =  dia + "/" + mes + "/" + ano;
			System.out.println(formato.parse(data));
		}
		else {
			System.out.println("Menores de 18 anos não podem ter conta corrente, portanto, o programa será encerrado");
			System.exit(0);
		}
	}
	
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", CPF=" + CPF + ", RG=" + RG + ", nascimento=" + nascimento + "]";
	}
}
