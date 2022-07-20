package BLOCO1JAVA.poliformismo;

public class Cavalo extends Animal{
	
	Cavalo(String nome, int idade, String emiteSom, String corre) {
		super ("Cavalo");
	}
			
	@Override
	public void nome (String nome){
		System.out.println("O nome do cavalo é: "+nome);
	}
			
	public void idade (int idade){
		System.out.println("A idade dele é: " + idade + "anos.");
	}
			
	public void som (String som){
		System.out.println("O som que o cavalo faz: "+som);
	}
	public void correr(){
		System.out.println("O cavalo corre!");
	}
}