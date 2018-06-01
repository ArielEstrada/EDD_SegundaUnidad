
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
public class EVA2_Comparator_OBJ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList <persona> llPersona = new LinkedList();
        llPersona.add(new persona());
        llPersona.add(new persona("Alejandra","Gonzalez",19));
        llPersona.add(new persona("Raul","Casas",20));
        llPersona.add(new persona("Steve","Rogers",100));
        llPersona.add(new persona("Vision","Zubizubi",30));
        llPersona.add(new persona("Daniela","Gonzalez",21));
        //Imprimimos
        imprimir(llPersona);
        ///////////////////////////////////Agregamos objetos personas a la lista
        ////////////////////////////////// Toca crear un comparato para el apellido
        Comparator cmpApe = new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                //Los objetos son personas
                persona per1, per2;
                per1 = (persona)o1;
                per2 = (persona)o2;
                //Combertimos a persona, luego leemos cada atributo de la clase persona
                String ape1, ape2;
                ape1 = per1.getsApe();
                ape2 = per2.getsApe();
                //De cada apellido leemos el primer caracter
                char c1,c2;
                c1= ape1.charAt(0);//Verificar que la cadena tenga longitud
                c2 =ape2.charAt(0);
                
                
                /*
                o1<o2       un numero menor a 0 (-)
                o1==02      cero
                o1>o2       un numero mayor a 0 (+)
                si el numero resultante es mayor a 0, se cambian
                */
                return c1-c2;
                
            }
        
        };
        System.out.println("\n------------------------------------------- \n Por apellido");
        Collections.sort(llPersona, cmpApe);
        imprimir(llPersona);
        
        
        
        
        
        //Despues un comparator de edad
        Comparator cmpEdad = new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                //Los objetos son personas
                persona per1, per2;
                per1 = (persona)o1;
                per2 = (persona)o2;
                //Combertimos a persona, luego leemos cada atributo de la clase persona
                int edad1, edad2;
                edad1 = per1.getiEdad();
                edad2 = per2.getiEdad();
                
                
                return edad1-edad2;
                
            }
        
        };
        System.out.println("\n-----------------------------------------------------------------------------\n Por edad");
        Collections.sort(llPersona, cmpEdad);
        imprimir(llPersona);
        
        
        
        
        
        //Comparator Apellido - Edad
        
        
        Comparator cmpApeEdad = new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                //Los objetos son personas
                persona per1, per2;
                per1 = (persona)o1;
                per2 = (persona)o2;
                //Combertimos a persona, luego leemos cada atributo de la clase persona
                int iResu;
                String ape1, ape2;
                ape1 = per1.getsApe();
                ape2 = per2.getsApe();
                //De cada apellido leemos el primer caracter
                char c1,c2;
                c1= ape1.charAt(0);//Verificar que la cadena tenga longitud
                c2 =ape2.charAt(0);
                
                
                /*
                o1<o2       un numero menor a 0 (-)
                o1==02      cero
                o1>o2       un numero mayor a 0 (+)
                si el numero resultante es mayor a 0, se cambian
                */
                iResu = c1-c2;
                if(iResu == 0){
                   
                //Combertimos a persona, luego leemos cada atributo de la clase persona
                int edad1, edad2;
                edad1 = per1.getiEdad();
                edad2 = per2.getiEdad();
               
                return edad1-edad2; 
                }
                return iResu;
                
                
            }
        
        };
        
        
        System.out.println("\n-----------------------------------------------------------------------------\n Por edad");
        Collections.sort(llPersona, cmpApeEdad);
        imprimir(llPersona);
        
        
        
        
    }
    
    public static void imprimir(LinkedList<persona> ls){
        for (persona l : ls) {
            
            System.out.println("Nombre: "+ l.getsNomb());
            System.out.println("Apellido: "+ l.getsApe());
            System.out.println("Edad: "+ l.getiEdad());
            System.out.println("------------------------");
        }
        
    }
    
    
    
}




class persona{
    private String sNomb;
    private String sApe;
    private int iEdad;

    public persona() {
        this.sNomb = "Ariel Josue";
        this.sApe = "Estrada Orozco";
        this.iEdad = 19;
    }

    public persona(String sNomb, String sApe, int iEdad) {
        this.sNomb = sNomb;
        this.sApe = sApe;
        this.iEdad = iEdad;
    }
////////////////////////////////////////////////////////////////////////////////////////////////
    public String getsNomb() {
        return sNomb;
    }

    public String getsApe() {
        return sApe;
    }

    public int getiEdad() {
        return iEdad;
    }

    public void setsNomb(String sNomb) {
        this.sNomb = sNomb;
    }

    public void setsApe(String sApe) {
        this.sApe = sApe;
    }

    public void setiEdad(int iEdad) {
        this.iEdad = iEdad;
    }
    
    
    
}
