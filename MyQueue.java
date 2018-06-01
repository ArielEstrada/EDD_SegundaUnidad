
/**
 *
 * @author Ariel
 */
public class MyQueue {
    private Nodo nIni;//Nodo que almacena el inicio de la lista
    private Nodo nFin;
    private int iCont;

    public MyQueue() {
        nIni = null;
        nFin = null;
        iCont = 0;
    }
    
    public MyQueue(Nodo nNodo) {
        this.nIni = nNodo;
        this.nFin = nNodo;
        iCont = 1;
    }
    
    public void add(Nodo nNodo){
        //La lista esta vacia
        if(nIni == null){
            nIni = nNodo;
            nFin = nNodo;
        }else{
            nFin.setnSig(nNodo);
            nNodo.setnPrev(nFin);
            nFin = nNodo;
        }
        iCont++;//Cada vez que agreguemos un nodo iCont aumenta
    }
    
    public int count(){
        
        
         return iCont;
    }
    
    public void printList(){//Impimiendo hacia adelante
        Nodo nTemp = nIni;
        while(nTemp != null){
            System.out.print(nTemp.getiDato()+ " - ");
            nTemp = nTemp.getnSig();
        }
    }
    
    public void printListBack(){//Impimiendo en  orden inverso
        Nodo nTemp = nFin;
        while(nTemp != null){
            System.out.print(nTemp.getiDato()+ " - ");
            nTemp = nTemp.getnPrev();
        }
    }
    
    //No podemos leer el final u otra posicion de la lista, no podemos agregar un nodo e x pos
    public int peek() throws Exception{//Lee el primer nodo de la lista
        if(nIni == null)//Lista vacia
            throw new Exception("No hay elemento en la lsta");
        
        return nIni.getiDato();
    }
    
    public int pop() throws Exception{//Lee el nodo y lo elimina (primer  nodo)
        int nTemp;
        if(nIni == null){//Lista vacia
            throw new Exception("No hay elementos en la lsta");
        
        //Leer el primer nodo y luego desconectarlo
        //Es una lista doble, hay que reconectar en ambos sentidos
        //Verificar los casos: no hay nodos, hay un nodo, hay n nodos.
        //que pasa con nIni y nFin
        }else{
           if(count()==1){//Si solo hay un elemento en la lista
               nTemp = nIni.getiDato();
               nIni = null;
               nFin = null;
               iCont = 0;
               return nTemp;
           }else{
               nTemp = nIni.getiDato();
               nIni = nIni.getnSig();
               nIni.setnPrev(null);
               iCont--;
               return nTemp;
           }
        }
        
        
    }
    
    
}
