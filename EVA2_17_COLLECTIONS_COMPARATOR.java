
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ariel
 */
public class EVA2_17_COLLECTIONS_COMPARATOR {

    
    public static void main(String[] args) {
        
        LinkedList <String> llListaOrdInv = new LinkedList();
        llListaOrdInv.add("Pepe ");
        llListaOrdInv.add("Alonso ");
        llListaOrdInv.add("Alex ");
        llListaOrdInv.add("Alejandro ");
        llListaOrdInv.add("Zaire ");
        llListaOrdInv.add("Yo ");
        llListaOrdInv.add("Baba ");
        llListaOrdInv.add("Aaron ");
        llListaOrdInv.add("AaronSta ");
        llListaOrdInv.add("Xbandija");
        System.out.println(llListaOrdInv);
        System.out.println("\n--------------------------------------------------------------------------");
        Collections.sort(llListaOrdInv);
        System.out.println(llListaOrdInv);
        //Para ordenar de otra forma esta el otro metodo .sort que recibe un objeto
        //Ordenar de la Z a la A
        ///////////////////////////////////////////////////////////////////////////////////////////////////////
        Comparator cmOrdenarZ_A = new Comparator(){//Case anónima de una clase abstracta
            @Override
            public int compare(Object o1, Object o2) {
                String cad1, cad2;
                cad1 = (String)o1;
                cad2 = (String)o2;
                int iResu =0;//Dependiendo el valor de iResu ordenaremos los valores                
                char c1, c2;
                c1 = cad1.charAt(0);
                c2 = cad2.charAt(0);
                if(c1==c2){
                    if(cad1.length()<cad2.length()){
                        for (int i = 1; i < cad1.length(); i++) {
                            c1 = cad1.charAt(i);
                            c2 = cad2.charAt(i);
                            if(c1!=c2){
                                iResu = c2-c1;
                                break;
                            }
                        }
                    }else{
                        for (int i = 1; i < cad2.length(); i++) {
                            c1 = cad1.charAt(i);
                            c2 = cad2.charAt(i);
                            if(c1!=c2){
                                iResu = c2-c1;
                                break;
                            }
                        }
                    }
                }else{
                    iResu = c2 - c1;
                }
                //Si lo implementamos bien es necesario implementar algo para evitar que truene
                                            //iResu = c1 - c2; //a-z (0 - 9)
                //iResu = c2 - c1;//z-a (0 -9)
                
                return iResu;
            }
            
        };
        
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        Collections.sort(llListaOrdInv, cmOrdenarZ_A);
        System.out.println(llListaOrdInv);
        
    }
    
}
