package repeticao;

import java.util.Scanner;

/* Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)
 */
public class questao3while 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int idade, menorv=0,maiorc=0;
	
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nDigite a sua idade:");
		idade=ler.nextInt();
		
		while(idade!=-99)
		{
		
			if(idade<21)
			{
				menorv++;
			}
			
			if(idade>50)
			{
				maiorc++;
			}
			
			System.out.println("\nDigite a sua idade: ");
			idade=ler.nextInt();	
			
		}		
		System.out.println("\nIdade menor que 21! "+menorv);
		System.out.println("\nIdade maior que 50! "+maiorc);		
	}
}

