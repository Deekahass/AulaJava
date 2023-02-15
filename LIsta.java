import java.util.ArrayList;
import java.util.Scanner;

public class LIsta {

	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);
		
		 ArrayList<Double> notas = new ArrayList<Double>();
		
		 int opcao = 0;
		 double nota = 0.0;
		
		 do {
			System.out.println("1- Cadastre nota: ");
			System.out.println("2- listar notas: ");
			System.out.println("3- Procurar uma nota: ");
			System.out.println("4- Remover uma nota: ");
			System.out.println("5- Atualizar uma nota: ");
			System.out.println("6- Sair");
			System.out.println("Digite a opção desejada");
			opcao = leia.nextInt();
			
		 switch(opcao) {
		 
		 case 1:
			 System.out.println("digite uma nota entre 1 e 10:");
			 notas.forEach(System.out::println);
			
			  break;
		 case 2:
			 System.out.println("Liste todas as notas:");
			 if(notas.isEmpty())
			  System.out.println("Base de dados vázia");
			 else 
			  notas.forEach(System.out::println);
			 
			 break;
			 
		 case 3:
			 System.out.println("Procurar uma nota: ");
			 System.out.println("Digite a nota: ");
			 nota = leia.nextDouble();
			 System.out.println("A nota " + nota + "existe? " + notas.contains(nota));
		   if(notas.contains(nota))
			 System.out.println("O indice da minha nota é: " + notas.indexOf(nota));
		   
		 case 4:
			 System.out.println("Remover uma nota");
			 System.out.println("Digite a nota: ");
			 nota = leia.nextDouble();
			 notas.remove(nota);
			 
			 break;
		 case 5:
			 System.out.println("Atualizar uma nota");
			 System.out.println("Digite a nota atual:");
			 nota = leia.nextDouble();
			 System.out.println("Digite a nova nota: ");
			 double notaNova = leia.nextDouble();
			 notas.set(notas.indexOf(nota), notaNova);
			 
			 break;
		 default:
			 if (opcao > 6)
			   System.out.println("Opção inválida!");
			
		 
		 }
			
		} while(opcao!= 6);
		
		
		}
			
			
	}


