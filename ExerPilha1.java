import java.util.Scanner;
import java.util.Stack;

public class ExerPilha1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Stack<String> Livros = new Stack<String>();
		
		int opcao = 6;
		String nome;
	
		
		do {
			System.out.println("1-Adicionar livros na pilha: ");
			System.out.println("2-Listar todos os livros: ");
			System.out.println("3-Retirar livros da pilha: ");
			System.out.println("0-Sair!");
		    System.out.println("Digite uma opção: ");
		    opcao = leia.nextInt();
		    
		    switch(opcao) {
		    
		  case 1:
			  System.out.println("Digite o nome: ");
			  leia.skip("\\R?");
			  nome = leia.nextLine();
			  Livros.push(nome);
			  System.out.println("Pilha:");
			  Livros.forEach(System.out::println);
			  System.out.println("Livro Adicionado! ");
			  
			  
			  break;
			  
		  case 2:
			  System.out.println("Lista de livros");
			  Livros.forEach(System.out::println);
			  
			  break;
			  
			  
			  
		  case 3:
			  if(!Livros.isEmpty()) {
			  System.out.println("Pilha: ");
			  Livros.pop();
			  System.out.println("Um livro foi retirado da pilha");
			} else {
				System.out.println("A pilha está vázia!");
			}
			  break;
			 
			 
		  default:
			  System.out.println("Programa Finalizando!");
			  
			  
			  
		    }
		    
		}while (opcao != 0);
		

	}

}
