package BLOCO1JAVA.POO1;

public class funcionarioteste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			funcionario pessoa1 = new funcionario();
			pessoa1.setPrimeiroNome("fulaninho");
			pessoa1.setUltimoNome("de sousa");
			pessoa1.setNumeroDocumento(null);
			
			System.out.println(pessoa1.getPrimeiroNome());
			System.out.println(pessoa1.getUltimoNome());
			System.out.println(pessoa1.getNumeroDocumento());
			
		}
	}

}
