//Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
package BLOCO1JAVA.lacodecisao; 

import java.util.Scanner;

public class questao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInforme a sua idade: ");
		idade=leia.nextInt();
				
		if (idade>=10 && idade<=14)
		{
			System.out.println("\n\tVocê está na fase infantil!");
		}
		else if (idade>=15 && idade<=17)
		{
			System.out.println("\n\tVocê está na fase Juvenil!");
		}
		else if  (idade>=18 && idade<=25)
		{
			System.out.println("\n\tVocê está na fase Adulta!");
		}
		else 
		{
			System.out.println("\n\tIdade inválida para a pesquisa!");
		}
		
	}

}