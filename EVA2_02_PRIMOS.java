
import javax.swing.JOptionPane;


public class EVA2_02_PRIMOS {

    static int lento =0;
    static int rapido = 0;
    public static void main(String[] args) {
        // TODO code application logic here
        int iNum=175783;
        //iNum = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero para ver si es primo: "));
        if(esPrimoLento(iNum)){
            //JOptionPane.showMessageDialog(null, "El numero: "+iNum+" es primo ");
            System.out.println("El numero: "+iNum+" es primo ");
        }else{
            //JOptionPane.showMessageDialog(null, "El numero: "+iNum+" no es primo ");
            System.out.println("El numero: "+iNum+" no es primo ");
        }
        System.out.println("Conto:"+lento);
        
        
        System.out.println("Metodo rapido");
        if(esPrimoRapidin(iNum)){
            JOptionPane.showMessageDialog(null, "El numero: "+iNum+" es primo ");
            System.out.println("El numero: "+iNum+" es primo ");
        }else{
            //JOptionPane.showMessageDialog(null, "El numero: "+iNum+" no es primo ");
            System.out.println("El numero: "+iNum+" no es primo ");
        }
        System.out.println("Conto: "+ rapido);
        
        
    }
    public static boolean esPrimoLento(int n){
        lento = 0;
        boolean bBande = true;
        for(int i=2;i<n;i++){
            int iRes = n%i;
            if(iRes==0){//El numero no es primo
                bBande=false;
                break;
            }
            lento++;
        }
        
        
        return bBande;
    }
    public static boolean esPrimoRapidin(int n){
        rapido=0;
        boolean bBande = true;
        int raiz = (int)(Math.sqrt(n)+1);
        for(int i=2;i<raiz;i++){
            int iRes = n%i;
            if(iRes==0){//El numero no es primo
                bBande=false;
                break;
            }
            rapido ++;
        }
        
        return false;
    }
}
