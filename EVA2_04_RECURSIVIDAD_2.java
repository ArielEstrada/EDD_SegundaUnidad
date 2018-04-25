/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ariel
 */
public class EVA2_04_RECURSIVIDAD_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       forRecursivo(5);
       forRecursivoAscendente(5); 
    }
    
    
    public static void forRecursivo(int n){
        
        System.out.print(n+"-");//Imprimimos el valor
        if(n>1){//Control de la recursividad
        forRecursivo(n-1);//Le resto 1 y lo llamo otra vez
        }
        System.out.println("Terminado");
    }
    
    public static void forRecursivoAscendente(int n){
        
        int c =1;//Cada vez que entra en accion la funcion recursiva, el valor de c se vuelve a declarar como 1 ... nunca termina :'v
        System.out.println(c + " - ");
        if(c<=n){
            
            forRecursivoAscendente(c+1);
            
        }else{
            
            System.out.println("Termidado :v");
            
        }
    }
    
    
}
