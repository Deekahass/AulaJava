import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class ExerSet1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		Set<Integer> numeros = new HashSet<Integer>();
		
    int numero;
    
    System.out.println("Digite um numero: ");
    
    for (int contador = 0; contador <= 9; contador++) {
    	numero = leia.nextInt();
    	numeros.add(numero);
    }
    
    Iterator<Integer> numInt = numeros.iterator();
    System.out.println("Listar dados do Set: ");
    while (numInt.hasNext()) {
    	System.out.println(numInt.next());
    }
    
    
    
    
	}

}
