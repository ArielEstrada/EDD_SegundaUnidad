
/**
 *
 * @author Ariel
 */
public class EVA2_06_INICIO_LISTAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Nodo nNod1 = new Nodo();
        nNod1.idato=10;
        nNod1.nSig=null;
        Nodo nNod2 = new Nodo();
        nNod2.idato=20;
        nNod2.nSig=null;
        Nodo nNod3 = new Nodo();
        nNod3.idato=30;
        nNod3.nSig=null;
        //Hasta aqui, cada noso es independiente. Hay que enlazarlos
        //NODO1 -->NODO2-->NODO3--> NULL
        nNod1.nSig = nNod2;
        nNod2.nSig = nNod3;
        //Probar la cadena de nodos
        System.out.println("Nodo 1 = "+ nNod1.idato);
        System.out.println("Nodo 2 = "+ nNod2.idato);
        System.out.println("Nodo 2 (cadena) = "+ nNod1.nSig.idato);
        System.out.println("Nodo 3 = "+ nNod3.idato);
        System.out.println("Nodo 3 (cadena) = "+ nNod1.nSig.nSig.idato);
        //Recorres una lista:
        
        Nodo nTemp = nNod1;
        while(nTemp != null){
            System.out.println("Nodo = " + nTemp.idato);
            nTemp = nTemp.nSig;
        }
        
        //-----------------------------------------------------------------\\
        
        
        
    }
    
}
class Nodo{
    public int idato; //Esto es lo que guardamos
    public Nodo nSig;//Enlace para crear la lista( caden de nodos)
    
}