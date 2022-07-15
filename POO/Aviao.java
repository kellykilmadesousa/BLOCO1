package BLOCO1JAVA.POO;

public class Aviao {
	private String modelo;
	private String companhia;
	private String ano;
	
	public Aviao (String modelo,String companhia, String ano)
	{
		this.modelo=modelo;
		this.companhia=companhia;
		this.ano = ano;	
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCompanhia() {
		return companhia;
	}

	public void setCompanhia(String companhia) {
		this.companhia = companhia;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}
}
