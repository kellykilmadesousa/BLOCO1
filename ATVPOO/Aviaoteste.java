package BLOCO1JAVA.ATVPOO;
public class Aviaoteste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			Aviao av1 = new Aviao();
			av1.setModelo("PPT200");
			av1.setCompanhia("Air France");
			av1.setAno("1995");
		
			System.out.println(av1.getModelo());
			System.out.println(av1.getCompanhia());
			System.out.println(av1.getAno());
		}
	}
}
