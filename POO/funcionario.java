package BLOCO1JAVA.POO;

public class funcionario {
	private String primeiroNome;
	private String ultimoNome;
	private String numeroDocumento;
	
	public funcionario (String primeiro,String ultimo, String numeroDocumento)
	{
		this.primeiroNome=primeiro;
		this.ultimoNome=ultimo;
		this.numeroDocumento = numeroDocumento;	
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	
}
