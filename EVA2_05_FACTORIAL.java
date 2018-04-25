
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ariel
 */
public class EVA2_05_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
        int resultado =FactRec(num);
        JOptionPane.showMessageDialog(null,"El factorial de: "+num+" es: "+resultado);
        resultado = Sumatoria(num);
        JOptionPane.showMessageDialog(null,"La sumatoria de: "+num+" es: "+resultado);
        
    }
    //Calcular el factorial
    public static int FactRec(int num){
        
        if(num!=0){
              return num*FactRec(num-1);
        }else{
            return 1;
        }

    }
    //Calcular la sumatoria
    public static int Sumatoria(int num){
        if(num!=0){
              return num+Sumatoria(num-1);
        }else{
            return 0;
        }
        
    }
}
