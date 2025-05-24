import java.util.Scanner;
public class Ejercicio7Matricez {
//Desarrollar un programa que permita almacenar 12 valores numé-
//ricos cualquiera en una matriz y como resultado deberá mostrar si
//existe algún “punto de silla” y el número donde se presenta.

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] matriz = new int[3][4];
    boolean puntoDeSilla = false;
    int numeroPuntoDeSilla = 0;

    // Llenar la matriz con valores numéricos
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 4; j++) {
            System.out.println("Escriba el valor [" + (i + 1) + "][" + (j + 1) + "]:");
            matriz[i][j] = sc.nextInt();
        }
    }

    // Buscar el punto de silla
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 4; j++) {
            boolean esPuntoDeSilla = true;
            // Verificar si es el mínimo en su fila
            for (int k = 0; k < 4; k++) {
                if (matriz[i][j] > matriz[i][k]) {
                    esPuntoDeSilla = false;
                    break;
                }
            }
            // Verificar si es el máximo en su columna
            if (esPuntoDeSilla) {
                for (int k = 0; k < 3; k++) {
                    if (matriz[i][j] < matriz[k][j]) {
                        esPuntoDeSilla = false;
                        break;
                    }
                }
            }
            if (esPuntoDeSilla) {
                puntoDeSilla = true;
                numeroPuntoDeSilla = matriz[i][j];
                break;
            }
        }
        if (puntoDeSilla) {
            break;
        }
    }

    // Mostrar resultado
    if (puntoDeSilla) {
        System.out.println("El punto de silla se encuentra en el número: " + numeroPuntoDeSilla);
    } else {
        System.out.println("No existe punto de silla en la matriz.");
    }
}
}
