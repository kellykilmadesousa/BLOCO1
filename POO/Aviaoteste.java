package POO;

public class Aviaoteste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			Aviao av1 = new Aviao();
			av1.setmodelo("PPT-200");
			av1.setcompanhia("Air france");
			av1.setano("2000");
			
			
			System.out.println(av1.getmodelo());
			System.out.println(av1.getcompanhia());
			System.out.println(av1.getano());

		}
	}

}
