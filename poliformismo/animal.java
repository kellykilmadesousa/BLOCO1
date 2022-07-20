package BLOCO1JAVA.poliformismo;

public abstract class Animal {
	
	private String tipoAnimal;
	
	public Animal(String tipoAnimal) {
		this.tipoAnimal=tipoAnimal;
	}
	
	abstract public void nome (String nome);
	abstract public void idade (int idade);
	abstract public void som (String som);
}
