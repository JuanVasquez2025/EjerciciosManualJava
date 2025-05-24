import java.util.Scanner;
public class Ejercicio6Matricez {

    //Desarrollar un programa que permita almacenar 9 valores numé-
//ricos cualquiera en una matriz y que posteriormente muestre su
//transpuesta.

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] matriz = new int[3][3];
    int[][] transpuesta = new int[3][3];

    // Llenar la matriz con valores numéricos
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.println("Escriba el valor [" + (i + 1) + "][" + (j + 1) + "]:");
            matriz[i][j] = sc.nextInt();
        }
    }
    // Calcular la transpuesta
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            transpuesta[j][i] = matriz[i][j];
        }
    }
    // Mostrar la matriz original
    System.out.println("Matriz original:");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print(matriz[i][j] + " ");
        }
        System.out.println();
    }
    // Mostrar la matriz transpuesta
    System.out.println("Matriz transpuesta:");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print(transpuesta[i][j] + " ");
        }
        System.out.println();
        }
    }
}


