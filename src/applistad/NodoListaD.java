/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applistad;

/**
 *
 * @author Thinkpad
 */
class NodoListaD{
   
    Object info;
    NodoListaD Izq;/////////////asi se declara para apuntar a un dato igual a ellos
    NodoListaD Der;
       public NodoListaD(Object Dato){
        this.info = Dato;
        this.Izq = null;
        this.Der = null;
    }
 
    public NodoListaD(NodoListaD Izq, Object Dato){
        this.Izq = Izq;
        this.info = Dato;
        this.Der = null;
    }
    
    public NodoListaD(Object Dato, NodoListaD Der){
        this.Izq = null;
        this.info = Dato;
        this.Der = Der;
    }
    
    public  NodoListaD(NodoListaD Izq, Object Dato, NodoListaD Der){
        this.Izq = Izq;
        this.info = Dato;
        this.Der = Der;
    }

   
}