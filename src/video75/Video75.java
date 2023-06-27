
package video75;

import java.util.Scanner;

/**
 *
 * @author Carolina EM
 */
public class Video75 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeros[] = new int[10]; 
        
        // Pedimos el arreglo
        for (int i=0;i<10;i++){
            System.out.print((i+1)+". Digite un numero ");
            numeros[i]= teclado.nextInt();
        }
        
        System.out.print("El resultado es: ");
        for (int i=0;i<5;i++){
            System.out.print(numeros[i]+" "); //Primer, segundo...
            System.out.print(numeros[9-i]+" "); // Ultimo, penultimo...
        }
        System.out.println();
                
    }
    
}
