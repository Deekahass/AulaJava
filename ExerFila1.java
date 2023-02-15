import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExerFila1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Queue<String> nomes = new LinkedList<String>();
	
		int opcao;
		String nome;
	do {
	  System.out.println("1- Adicionar o nome do cliente: ");
	  System.out.println("2- Listar os nomes: ");
	  System.out.println("3- Retirar o nome do cliente");
	  System.out.println("0- Sair ");
	  System.out.println("Opção desejada: ");
	  opcao = leia.nextInt();
	  
	  switch (opcao) {
	  
	  case 1:
		  System.out.println("Digite o nome: ");
		  leia.skip("\\R?");
		  nome = leia.nextLine();
		  nomes.add(nome);
		  System.out.println("fila");
		  System.out.println("Cliente adiocionado! ");
		  
		  break;
		  
	  case 2:
		  System.out.println("Lista dos nomes dos clientes: ");
		  nomes.forEach(System.out::println);
		  
		  break;
		  
	  case 3:
		  if (!nomes.isEmpty()) {
		  System.out.println("Chamar o cliente: ");
		  System.out.println(nomes.poll());
		  System.out.println("O cliente foi chamado! ");
		} else 
			System.out.println("A fila está vázia");
	
		  break;
		default:
			System.out.println("Programa Finalizado!");
		  
	  }
	  
	}while (opcao != 0);
	
		

	}

}
