
import java.util.LinkedList;
import java.util.Queue;



/**
 *
 * @author Ariel
 */
public class EVA2_13_COLLECTIONS_DOUBLE_LIST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Queue<Integer> queCola = new LinkedList();
        
        queCola.add(10);
        queCola.add(20);
        queCola.add(30);
        queCola.add(40);
        queCola.add(50);
        
        System.out.println("El primer elemento es: "+queCola.element());
        System.out.println("El primer elemento es: (peek)"+queCola.peek());
        System.out.println("El primer elemento es: (poll)"+queCola.poll());
        System.out.println("El primer elemento es: (peek)"+queCola.peek());
        
    }
    
}
