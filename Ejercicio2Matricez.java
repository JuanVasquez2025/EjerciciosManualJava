import java.util.Scanner;

public class Ejercicio2Matricez {

    // Elaborar un programa que permita almacenar 12 números enteros
    // en un vector llamado “números” y que posteriormente muestre el
    // promedio de los números ingresados.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[12];
        int resultado = 0;
        double promedio = 0;

        for (int i = 0; i < 12; i++) {
            System.out.println("Escriba el numero" + (i + 1) + ":");
            numeros[i] = sc.nextInt();
            resultado += numeros[i];
        }
        promedio = resultado / 12;
        System.out.println("El promedio de los numeros es: " + promedio);

    }

}
