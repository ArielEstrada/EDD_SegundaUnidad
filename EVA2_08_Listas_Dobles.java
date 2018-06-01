/**
 *
 * @author Ariel
 */
public class EVA2_08_Listas_Dobles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista_Doble lsd = new Lista_Doble();
        lsd.add(new Nodo(1));
        lsd.add(new Nodo(2));
        lsd.add(new Nodo(3));
        lsd.add(new Nodo(4));
        lsd.printList();
        System.out.println("");
        //lsd.printListBack();
        //System.out.println("");
        /*
        if(lsd.isEmpty()){
            System.out.println("Lista vacía");
            }else{
            System.out.println("Hay elementos en la lista");
            }
        */
        System.out.println("Hay " + lsd.count() + " nodos");
        System.out.println("Buscamos el valor 3, y esta en la posicion: " + lsd.find(3));
        /*
        System.out.println("Limpiamos la lista");
        
        lsd.clear();
        
        if(lsd.isEmpty()){
            
            System.out.println("Lista vacía");
            }else{
            System.out.println("Hay elementos en la lista");
            }
        
        */
        
        try {
            //Borrar
            lsd.removeAt(2);
        } catch (Exception ex) {
           ex.printStackTrace();
        }
        
        lsd.printList();
        System.out.println("");
        lsd.printListBack();
        System.out.println("");
        
        try {
            //Borrar
            lsd.insertAt(new Nodo(7), 2);
        } catch (Exception ex) {
           ex.printStackTrace();
        }
        
        lsd.printList();
        System.out.println("");
        try {
            //Borrar
            System.out.println("El valor que se busca en la posicion 2 es: "+ lsd.getValueAt(2));
        } catch (Exception ex) {
           ex.printStackTrace();
        }
        
    }
        
    
}
