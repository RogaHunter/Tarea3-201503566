package tarea;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ROGA11
 */
public class Tarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
 
        
 
            System.out.println("1. Usuarios");
            System.out.println("2. Contador de Digitos");
            System.out.println("3. Tres numeros de mayor a menor");
            System.out.println("4. Calcular Promedio");
            System.out.println("5. Salir");
 
            try {
 
                System.out.println("Elija una opcion");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado Usuarios");
                    break;
                    case 2:
                        System.out.println("Has seleccionado Contador de digitos");
                    break;
                    case 3:
                        System.out.println("Has seleccionado Tres numeros de mayor a menor");
                    break;
                    case 4:
                        System.out.println("Has Seleccionado Calcular Promedio");
                    break;
                    case 5:
                        salir = true;
                    break;
                    default:
                        System.out.println("Elegir solo entre 1 y 5");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        
 
    }
    
}
