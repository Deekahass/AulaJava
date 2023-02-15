import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
	 Queue<String> fila = new LinkedList<String>();
	 
	 fila.add("Rony");
	 fila.add("Lucas");
	 fila.add("Isaac");
	 fila.add("fernando");
	 fila.add("Laise");
	 fila.add("Elizangela");
	 
	 Iterator<String> ifila = fila.iterator();
	 
	 while(ifila.hasNext()) {
		 
		 System.out.println(ifila.next());
	 }
	  
	 System.out.println("Retirar um elemento da fila:");
	 System.out.println("Fila atualizada");
	
	 for (var elemento : fila) {
		 System.out.println(elemento);
	 }
	 
	 /*System.out.println(fila.poll);
	 System.out.println(fila);
	 System.out.println(fila.peek);
	 System.out.println(fila.size); 
	 System.out.printlnelemento);*/
	}

}
