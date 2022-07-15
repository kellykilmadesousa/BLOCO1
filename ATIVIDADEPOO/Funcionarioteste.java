package BLOCO1JAVA.ATIVIDADEPOO;

public class Funcionarioteste {
		public static void main(String args[])
		{
			Funcionario pessoa1 = new Funcionario();
			pessoa1.setPrimeiroNome("fulaninho");
			pessoa1.setUltimoNome("de sousa");
			pessoa1.setNumeroDocumento(null);
			
			System.out.println(pessoa1.getPrimeiroNome());
			System.out.println(pessoa1.getUltimoNome());
			System.out.println(pessoa1.getNumeroDocumento());
			
		}
		
}
