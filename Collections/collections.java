package BLOCO1JAVA.Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class collections {
	
/*Q. 03 Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:
Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.*/

	public static void main(String[] args) {
			
		int op;
		Scanner ler = new Scanner(System.in);
			
		ArrayList<String> estoque = new ArrayList<String>();
			
		do {
			System.out.println("\n-------------------------------------------------------");
			System.out.println("\nInforme (1) para adicionar produtos ao estoque.");
			System.out.println("\nInforme (2) para remover produtos do estoque.");
			System.out.println("\nInforme (3) para atualizar os produtos do estoque.");
			System.out.println("\nInforme (4) para mostrar todos os produtos do estoque.");
			System.out.println("\nInforme (0) para encerrar a consulta.");
			System.out.println("\n-------------------------------------------------------");
			System.out.println("\nInforme a opção desejada: ");
			op = ler.nextInt();
				
			switch(op) {
			case 1:			
				ler.nextLine();
				System.out.println("\nInforme o produto para adicionar ao estoque: ");
				String produto = ler.nextLine();
				estoque.add(produto);
			break;		
			case 2:
				ler.nextLine();
				System.out.println("\nInforme o produto que quer remover do estoque: ");
				String produtor = ler.nextLine();
				if(estoque.contains(produtor)) {
					estoque.remove(produtor);
				}
				else{
						System.out.println("\nProduto não existe no estoque!!!");
				}
			break;
			case 3:
				ler.nextLine();
				System.out.println("\nInforme o produto que quer atualizar no estoque: ");
				String verifica = ler.nextLine();
				System.out.println("\nDigite o nome do produto que entrará no lugar do: "+verifica+" : ");
				String novo = ler.nextLine();
				if(estoque.contains(verifica)) {
						estoque.remove(verifica);
						estoque.add(novo);
				}
				else {
						System.out.println("\nO produto não existe no estoque!!!");
				}
			break;
			case 4:
					System.out.println("\nOs itens que estão no estoque são: ");
			break;
			case 0:
					System.out.println("\nConsulta finalizada");
					break;
					default:
					System.out.println("\nOpção inválida!!!");
				}	
		}while(op!=0);

	}

}
