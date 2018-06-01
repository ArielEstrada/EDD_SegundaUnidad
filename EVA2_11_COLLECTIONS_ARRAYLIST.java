
import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.iterator;
import java.util.ArrayList;
import java.util.Iterator;
import static java.util.Spliterators.iterator;
import static java.util.Spliterators.iterator;



/**
 *
 * @author Ariel
 */
public class EVA2_11_COLLECTIONS_ARRAYLIST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> alsMiArreglo = new ArrayList();
        //Los collections usan tipos de datos genéricos
        alsMiArreglo.add(10);
        alsMiArreglo.add(20);
        alsMiArreglo.add(30);
        alsMiArreglo.add(40);
        //Se pueden recorrer con un for, for each
        
        for (int i = 0; i < alsMiArreglo.size(); i++) {
            System.out.println(alsMiArreglo.get(i)+" - ");
        }
        System.out.println("");
        /*for (Integer integer : alsMiArreglo) {
            System.out.println(integer +" - ");
        }*/
        // O usando iteradores
        /*
        for(Iterator<Integer> iterator = alsMiArreglo.iterator()); iterator.hasNext();){
            Integer next = iterator.next();
            System.out.println(next + " - ");
        }*/
        alsMiArreglo.remove((Object)30);
        for (Integer integer : alsMiArreglo) {
            System.out.println(integer +" - ");
        }
        System.out.println("");
        alsMiArreglo.remove(0);
        for (Integer integer : alsMiArreglo) {
            System.out.println(integer +" - ");
        }
        
        alsMiArreglo.clear();
        System.out.println("Lista despues de borrar ");
        for (Integer integer : alsMiArreglo) {
            System.out.println(integer + " - ");
        }
    }
    
}
