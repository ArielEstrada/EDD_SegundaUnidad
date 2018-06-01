
import java.util.LinkedList;



/**
 *
 * @author Ariel
 */
public class EVA2_12_COLLECTIONS_LISTAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Tenemos 2 tipos de listas:
        //Listas simples 
        //Listas dobles
        LinkedList <String> ListPalabras = new LinkedList();
        //LinkedList <String> ListPalabras = new LinkedList<String>();
        
        ListPalabras.add("Hola");
        ListPalabras.add(" ");
        ListPalabras.add("Mundo");
        ListPalabras.add(" ");
        ListPalabras.add("Cruel ");
        System.out.println(ListPalabras);
        for (String palabra : ListPalabras) {
            System.out.print(palabra);
        }
        ListPalabras.removeLast();
        System.out.println("");
        for (String palabra : ListPalabras) {
            System.out.print(palabra);
        }
    }
    
}
