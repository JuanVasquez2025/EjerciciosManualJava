import java.util.Scanner;
public class Ejercicio3Matricez {

    //Elaborar un programa que permita almacenar 12 números enteros en
    //un vector llamado “números” y que posteriormente muestre la canti-
    //dad de números pares e impares contenidos en el vector.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[12];
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < 12; i++) {
            System.out.println("Escriba el numero" + (i + 1) + ":");
            numeros[i] = sc.nextInt();
            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("La cantidad de numeros pares es: " + pares);
        System.out.println("La cantidad de numeros impares es: " + impares);
    }

}
