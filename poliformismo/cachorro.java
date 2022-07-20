package BLOCO1JAVA.poliformismo;

public class Cachorro extends Animal{
	
	Cachorro(String nome, int idade, String emiteSom, String corre) {
		super ("Cachorro");
	}
			
	@Override
	public void nome (String nome){
		System.out.println("O nome do cachorro é: "+nome);
	}
			
	public void idade (int idade){
		System.out.println("A idade dele é: " + idade + "anos.");
	}
			
	public void som (String som){
		System.out.println("O som que o cachorro faz:  "+som);
	}
	public void correr(){
		System.out.println("O cachorro corre!");
	}
}