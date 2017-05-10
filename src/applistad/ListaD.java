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
class ListaD{
    
    public NodoListaD Primero,Ultimo,Nuevo,Aux,Pos,Ant;
    public ListaD(){
        Primero = Ultimo = Nuevo = Aux = Pos = Ant = null;
    }
    public void insertarAlFrente(Object dato){
        if(Primero==null){//////////1 caso(lista vacia)
        Primero = new NodoListaD(dato);
        Ultimo = Primero;
        }
        else{
            Nuevo = new NodoListaD(Ultimo, dato);
            Ultimo.Der = Nuevo;
            Ultimo = Nuevo;
        }despliegaLista();
    }
    public void insertarAtras(Object dato){
        if(Primero==null){
            Primero = new NodoListaD(dato);
            Ultimo = Primero;
        }
        else {
            Nuevo = new NodoListaD(dato,Primero);
            Primero.Izq=Nuevo;
            Primero = Nuevo;
        }despliegaLista();
    }
    public void insertarAntesDe(Object DatoB,Object DatoI){
        if(Primero==null){
            System.out.println ("lista vacia");
        }
        else{/////hay datos
            if(buscar(DatoB)== true){
                             if(Aux==Primero){///caso 1
                Nuevo= new NodoListaD(DatoI,Primero);
                Primero.Izq = Nuevo;
                Primero=Nuevo;
                }
                else{//en caso de que no este al inicio de la lista
                    Nuevo = new NodoListaD(Ant,DatoI , Aux);
                    Aux.Izq = Nuevo;
                    Ant.Der=Nuevo;               }            }       }
        despliegaLista();
    }
    public void insertarDespuesDe(Object DatoB, Object DatoI){
        if(Primero==null){
            System.out.println ("lista vacia");
        }
        else{///hay metodos
            if(buscar(DatoB)== true){
                if(Aux==Ultimo){
                    Nuevo=new NodoListaD(Aux,DatoI);
                    Aux.Der=Nuevo;
                    Ultimo=Nuevo;
                }
                else{///en caso de que no este al inicio de la lista
                    Nuevo= new NodoListaD(Aux,DatoI,Aux.Der);
                    Aux.Der = Nuevo;
                    Pos = Aux.Der;
                    Pos.Izq =Aux.Der;
                }
                
            }
        }despliegaLista();
    }
   public void eliminarNodo(Object DatoB){
        if(Primero==null){
            System.out.println ("lista vacia");
        }
        else{
            if(buscar(DatoB)==true){///hacer cuatro casos
                if(Primero==Ultimo){//// 1 caso
                    Primero=Ultimo=null;
                }
                else if(Aux==Primero){//2caso
                    Primero=Aux.Der;
                    Primero.Izq=Aux=null;
                }
                else if(Aux==Ultimo){//3 caso
                    Ultimo=Ant;
                    Ultimo.Der=Aux=null;
                }
                else{//4 caso
                    Ant.Der=Pos;
                    Pos.Izq=Ant;
                    Aux=null;
                }
            }
        }despliegaLista();
    }
    public void modificaLista(Object DatoB,Object DatoI){
        if(Primero==null){
            System.out.println ("lista vacia");
        }
        else{
            if(buscar(DatoB)==true){
                Aux.info=DatoI;
            }
        }despliegaLista();
    }
    public boolean  buscar(Object DatoB){
        Aux = Primero;
        boolean bandera = false;
        while (Aux != null && bandera != true) {
            if(DatoB.equals(Aux.info)){// si encuentra el dato //la funcion .equals sirve para comparar el contenido de una direccion de memoria
                bandera = true;
            }
            
            
            
            else{//apunta al siguiente nodo
                Ant = Aux;
                Aux = Aux.Der;
                Pos = Aux.Der;
            }
        }
        if(bandera == true){
            return true;
        }
        else{
            System.out.println ("ese dato no existe");
            return false;
        }
    }
    public  void despliegaLista(){
        Aux = Primero;
        System.out.println ("#########   LISTA COMPLETA   ###########");
        while (Aux != null) {
            System.out.println (Aux.info);
            Aux = Aux.Der;
        }
        System.out.println ("########################################");
    }
}
