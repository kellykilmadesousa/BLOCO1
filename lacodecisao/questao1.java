package BLOCO1JAVA.lacodecisao;

import java.util.Scanner;

//Faça um programa que receba três inteiros e diga qual deles é o maior.
public class questao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner leia = new Scanner(System.in);
			int n1,n2,n3,maiorValor;
			
			System.out.println("\nEntre com o primeiro valor: ");
			n1 = leia.nextInt();
			System.out.println("\nEntre com a segundo valor: ");
			n2 = leia.nextInt();
			System.out.println("\nEntre com a terceiro valor: ");
			n3 = leia.nextInt();
			
			if (n3>n2 && n3>n1)
			{
				maiorValor = n3;
			}
			else if(n2>n1 && n2>n3)
			{
				maiorValor = n2;
			}
			else 
			{
				maiorValor = n1;
			}
			
			System.out.println("\nO maior valor encontrado foi: "+maiorValor );
			
	}

}
