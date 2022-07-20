package BLOCO1JAVA.poliformismo;

public class Preguica extends Animal{
		
	Preguica(String nome, int idade, String emiteSom, String corre) {
		super ("Preguica");
	}

	@Override
	public void nome (String nome){
		System.out.println("O nome da Preguiça é: "+nome);
	}
				
	public void idade (int idade){
		System.out.println("A idade dele é: " + idade + "anos.");
	}
				
	public void som (String som){
		System.out.println("O som que a Preguiça faz: "+som);
	}
	public void correr(){
		System.out.println("A Preguiça corre!");
	}
}
