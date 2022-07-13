package repeticao;

import java.util.Scanner;

//Ler 10 números e imprimir quantos são pares e quantos são ímpares.
public class questao2for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, numimpar=0, numpar=0;
		
		Scanner ler = new Scanner(System.in);
		
		for(int x=1;x<=10;x++)
		{
			System.out.println("\nInforme o " +x+ "º número: ");
			numero=ler.nextInt();
			
			if(numero % 2 ==1)
			{
				numimpar++;
			}
			if(numero % 2 ==0)
			{
				numpar++;
			}
		}
		System.out.println("\nNúmeros pares: "+numpar);
		System.out.println("\nNúmeros ímpares "+numimpar);
	}

}
