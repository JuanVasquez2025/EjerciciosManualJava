import java.util.Scanner;
public class Ejercicion1Matricez {

    // Desarrollar un programa que permita almacenar 10 nombres de fru
    // tas en un vector llamando “frutas” y que posteriormente muestre el
    // contenido del vector pero en forma inversa, es decir, el último ele-
    // mento ingresado deberá aparecer primero y el primero en el último lugar.

    public static void main(String[] args) {

        String[] frutas = new String[10];
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < frutas.length; i++) {
            System.out.println("Escriba el nombre de la fruta " + (i + 1) + ":");
            frutas[i] = entrada.nextLine();
        }

        System.out.println("Lista de frutas  de ultima a primera:");
        for (int i = frutas.length - 1; i >= 0; i--) {
            System.out.println(frutas[i]);
        }
    }

}
