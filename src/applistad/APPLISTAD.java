
package applistad;

import java.util.Scanner;

/**
 *
 * @author Thinkpad
 */
public class APPLISTAD {

    /**
     * @param args the command line arguments
     */
   public static void main(String args[]){
        ListaD lista = new ListaD();
        Integer DatoB,DatoI;
        int opcion;
        
        //Inicializacion del teclado
        Scanner Teclado = new Scanner(System.in);
        do{
            System.out.println ("1) Insertar al frente");
            System.out.println ("2) Insertar al Atras");
            System.out.println ("3) Insertar Antes de");
            System.out.println ("4) Insertar Despues de");
            System.out.println ("5) Eliminar Dato");
            System.out.println ("6) Modificar Dato");
            System.out.println ("7) DesplegarLista");
            System.out.println ("8) Salir");
            opcion = Teclado.nextInt();
            switch (opcion) {
                case 1: System.out.println ("Que dato quieres insertar al frente de la Lista:  ");
                        DatoI = new Integer(Teclado.nextInt());
                        lista.insertarAlFrente(DatoI);
                        break;
                case 2: System.out.println ("Que dato quieres insertar Atras de la Lista:  ");
                        DatoI = new Integer(Teclado.nextInt());
                        lista.insertarAtras(DatoI);
                        break;
                case 3: System.out.println ("Que dato quieres insertar Antes de la Lista:  ");
                        DatoI = new Integer(Teclado.nextInt());
                        System.out.println ("Atras de que dato quieres insertar el :"+DatoI);
                        DatoB = new Integer(Teclado.nextInt());
                        lista.insertarAntesDe(DatoB,DatoI);
                        break;
                case 4: System.out.println ("Que dato quieres insertar Despues de la Lista:  ");
                        DatoI = new Integer(Teclado.nextInt());
                        System.out.println ("Despues de que dato quieres insertar el :"+DatoI);
                        DatoB = new Integer(Teclado.nextInt());
                        lista.insertarDespuesDe(DatoB,DatoI);
                        break;
                case 5: System.out.println ("Que dato quieres ELiminar de la Lista: ");
                        DatoB = new Integer(Teclado.nextInt());
                        lista.eliminarNodo(DatoB);
                        break;
                   case 6: System.out.println ("Que dato quieres buscar para sustituir: ");
                           DatoB = new Integer(Teclado.nextInt());
                           System.out.println ("Que dato quieres poner en el numero "+DatoB+":");
                           DatoI = new Integer(Teclado.nextInt());
                           lista.modificaLista(DatoB,DatoI);
                        break;
                   case 7: lista.despliegaLista();
                        break;
                case 8: System.out.println ("\tbye...\n");
                        break;                                
                default :System.out.println ("\topcion no valida intenta de nuevo\n");
            }
        }while (opcion != 8);
    }
}

