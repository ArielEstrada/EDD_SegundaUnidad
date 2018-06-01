
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Ariel
 */
public class EVA2_09_QUEUE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MyQueue lsd = new MyQueue();
        lsd.add(new Nodo(1));
        lsd.add(new Nodo(2));
        lsd.add(new Nodo(3));
        lsd.add(new Nodo(4));
        lsd.printList();
        System.out.println("");
        //lsd.printListBack();
        System.out.println("Hay " + lsd.count() + " nodos");
        
        
        try {
            System.out.println("Elemento que fue removido: " + lsd.pop() + " ");
        
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        lsd.printList();
        System.out.println("");
        System.out.println("Hay " + lsd.count() + " nodos");
        
    }
    
}
