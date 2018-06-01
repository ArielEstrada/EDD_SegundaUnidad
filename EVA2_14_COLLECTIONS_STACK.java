
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.Stack;


/**
 *
 * @author Ariel
 */
public class EVA2_14_COLLECTIONS_STACK {

    
    public static void main(String[] args) {
        Stack<Integer> stkPila = new Stack();
        stkPila.add(10);
        stkPila.add(20);
        stkPila.add(30);
        stkPila.add(40);
        System.out.println("El ultimo elemento de la pila (peek) "+stkPila.peek());
        System.out.println("El ultimo elemento de la pila (pop)  "+stkPila.pop());
        System.out.println("El ultimo elemento de la pila (peek) "+stkPila.peek());
        
        
        //Conjuntos
        Set<Integer> stConjunto = new LinkedHashSet();
        stConjunto.add(10);
        stConjunto.add(10);
        stConjunto.add(20);
        stConjunto.add(30);
        stConjunto.add(20);
        stConjunto.add(40);
        stConjunto.add(40);
        System.out.println(stConjunto);
    }
    
}
