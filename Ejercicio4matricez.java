import java.util.Scanner;

public class Ejercicio4matricez {

    //Elaborar un programa que permita almacenar 10 números cualquiera
    //en un vector llamado “números” y que posteriormente muestre el
    //mayor y el menor valor ingresado.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int i = 0; i < 10; i++) {
            System.out.println("Escriba el numero" + (i + 1) + ":");
            numeros[i] = sc.nextInt();
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println("El mayor numero es: " + mayor);
        System.out.println("El menor numero es: " + menor);
    }
    
}
