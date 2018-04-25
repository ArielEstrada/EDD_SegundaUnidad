/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ariel
 */
public class EVA2_01_UN_MILLON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] aDatos = new int[300000000];
        for (int i = 0; i < aDatos.length; i++) {
            aDatos[i] = (int)(Math.random()*1000)+1;
        }
    }
    
}
