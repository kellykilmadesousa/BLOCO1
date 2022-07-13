package repeticao;

import java.util.Scanner;

/*Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)
 */
public class questao6dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int numInteiro,soma=0,cont=0;
		do
		{
			System.out.println("\nEntre com um número:");
			numInteiro=ler.nextInt();
			if(numInteiro%3==0 && numInteiro!=0);
			{
				soma=soma+numInteiro;
				cont++;	
			}
		}while(numInteiro!=0);
		
		System.out.println("\nA média dos multiplos de 3 é de: " +soma/cont);
	}

}
