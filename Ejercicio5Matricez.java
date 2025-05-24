import java.util.Scanner;
public class Ejercicio5Matricez {

    //Desarrollar un programa que permita almacenar 9 nombres de artí-
    //culos en una matriz llamada “artículos”, posteriormente deberá mos-
    //trar el contenido de matriz en el orden de las filas invertido, es decir,
    //la última fila debe aparecer primero y la primera de último.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] articulos = new String[3][3];

        // Llenar la matriz con nombres de artículos
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Escriba el nombre del artículo [" + (i + 1) + "][" + (j + 1) + "]:");
                articulos[i][j] = sc.nextLine();
            }
        }

        // Mostrar la matriz en orden invertido
        System.out.println("Contenido de la matriz en orden invertido:");
        for (int i = 2; i >= 0; i--) {
            for (int j = 0; j < 3; j++) {
                System.out.print(articulos[i][j] + " ");
            }
            System.out.println();
        }
    }
}
