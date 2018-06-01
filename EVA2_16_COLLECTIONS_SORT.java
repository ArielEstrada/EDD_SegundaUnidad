
import java.util.Collections;
import java.util.LinkedList;


/**
 *
 * @author Ariel
 */
public class EVA2_16_COLLECTIONS_SORT {

    
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList <String> llMiLista = new LinkedList();
        llMiLista.add("Hola");
        llMiLista.add(" ");
        llMiLista.add("Mundo");
        llMiLista.add(" ");
        llMiLista.add("Cruel");
        llMiLista.add("!!");
        System.out.println(llMiLista);
        Collections.sort(llMiLista);
        System.out.println(llMiLista+" <------Ordenado con el metoso sort ");
        /*for (String string : llMiLista) {
            System.out.println(string);
        }*/
        //////////////////////////////////////////////////////////////////////////
        System.out.println("\n---------------------------------------------------------------------------------");
        LinkedList <Integer> llEnteros = new LinkedList();
        llEnteros.add(25);
        llEnteros.add(5);
        llEnteros.add(1);
        llEnteros.add(3);
        llEnteros.add(51);
        llEnteros.add(60);
        System.out.println(llEnteros);
        Collections.sort(llEnteros);
        System.out.println(llEnteros + " <------Ordenado con el metoso sort ");
    }
    
}
