/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ariel
 */
public class Nodo {
    //Atributos: 1 dato a almacenar; 2 enlace al siguiente o anterior nodo
    private int iDato;//Generalmente solo cambia el tipo de dato
    private Nodo nSig;
    private Nodo nPrev;

    public void setnPrev(Nodo nPrev) {
        this.nPrev = nPrev;
    }

    public Nodo getnPrev() {
        return nPrev;
    }

    public Nodo() {
        this.nSig = null;
        this.nPrev = null;
    }

    public Nodo(int iDato) {
        this.iDato = iDato;
        this.nSig = null;
        this.nPrev = null;
    }
    
    
    
    public Nodo(int iDato, Nodo nSig, Nodo nPrev) {
        this.iDato = iDato;
        this.nSig = nSig;
        this.nPrev = nPrev;
    }

    public int getiDato() {
        return iDato;
    }

    public void setnSig(Nodo nSig) {
        this.nSig = nSig;
    }

    public void setiDato(int iDato) {
        this.iDato = iDato;
    }
    
    public Nodo getnSig() {
        return nSig;
    }
}
