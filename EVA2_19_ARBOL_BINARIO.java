
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ariel
 */
public class EVA2_19_ARBOL_BINARIO {

    
    public static void main(String[] args) {
        ArbolitoBi arbolito = new ArbolitoBi();
        try {
            
            arbolito.agregarNodo(new NodoBi(15));
            arbolito.agregarNodo(new NodoBi(7));
            arbolito.agregarNodo(new NodoBi(25));
            arbolito.agregarNodo(new NodoBi(10));
            arbolito.agregarNodo(new NodoBi(18)); 
            arbolito.agregarNodo(new NodoBi(11));
        } catch (Exception ex) {
            Logger.getLogger(EVA2_19_ARBOL_BINARIO.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("----------------------------------------------------");
         //Pre : 15 - 7- 10- 11- 25 - 18
         System.out.println("PreOrder");
        arbolito.imprimirPreOrdden();
        System.out.println("");
        //in: 7 - 10 - 11 - 15 - 18 - 25
        System.out.println("InOrder");
        arbolito.imprimirInOrden();
        System.out.println("");
        //Post: 11 -1 0 - 7 - 18 - 25 - 15
        System.out.println("PostOrder");
        arbolito.imprimirPost();
        System.out.println("");
         //¿Cómo buscar un valor en un árbol ordenado
        //Busqueda ----> Recusriva:
        /*
        System.out.println("----------------------------------------------------");
        System.out.println("Buscamos el 10 (Si se encuentra)");
        if(arbolito.buscar(10)){
            System.out.println("El número que se busca si se encuentra");
        }else{
            System.out.println("El número que se busca no se encuentra");
        }
        System.out.println("----------------------------------------------------");
        System.out.println("Buscamos el 9 (no ese encuentra)");
        if(arbolito.buscar(9)){
            System.out.println("El número que se busca si se encuentra");
        }else{
            System.out.println("El número que se busca no se encuentra");
        }
        System.out.println("----------------------------------------------------");
        */
        
        
        
        
        
        
    }
    
}
