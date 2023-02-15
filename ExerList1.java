import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExerList1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		ArrayList <String> cores = new ArrayList<String>();
		
		String cor ;
		
		System.out.println("DIgite a cor: ");
		for (int contador = 0; contador <= 4; contador ++) {
			cor = leia.nextLine();
			cores.add(cor);
		}
		System.out.println("Listar todas as cores ");
		cores.forEach(System.out::println);
		
		Collections.sort(cores);
		System.out.println("Ordernar cores: ");
		cores.forEach(System.out::println);
		
		
	 }

}
