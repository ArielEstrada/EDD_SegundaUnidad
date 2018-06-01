
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Ariel
 */
public class EVA2_07_LISTAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
            
            Lista_Simple lsMiLista = new Lista_Simple();
            
            for (int i = 0; i < 10; i++) {
                lsMiLista.add(new Nodo(10));
                //System.out.println("Hay " + lsMiLista.count() + " nodos");
            }
            
            
            
            
            /*
            if(lsMiLista.isEmpty()){
            System.out.println("Lista vacía");
            }else{
            System.out.println("Hay elementos en la lista");
            }
            lsMiLista.clear();
            
            System.out.println("");
            
            lsMiLista.printList();
            if(lsMiLista.isEmpty()){
            System.out.println("Lista vacía");
            }else{
            System.out.println("Hay elementos en la lista");
            }*/
            lsMiLista.printList();
            try {
                lsMiLista.insertAt(new Nodo(30),4);
                
            } catch (Exception ex) {
                
            }
            
            System.out.println("");
            lsMiLista.printList();
            System.out.println("");
            System.out.println("Buscamos el valor 30, y esta en la posicion: " + lsMiLista.find(30));
            try {
            System.out.println("Valor en la posicion 3 = " + lsMiLista.getValueAt(3));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
            
            
            
        try {
            //Borrar
            lsMiLista.removeAt(2);
        } catch (Exception ex) {
           ex.printStackTrace();
        }
        lsMiLista.printList();
        //lsMiLista.add(new Nodo(111));
        //System.out.println("");
        //lsMiLista.printList();

    }
    
    
}
//Los collections en java (y otros ambientes) usan dos claes: 
//una clase para la estructura de datos (lista, cola, pila, etc) y una case
