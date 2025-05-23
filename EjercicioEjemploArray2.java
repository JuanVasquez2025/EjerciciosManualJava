import java.util.Scanner;

public class EjercicioEjemploArray2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String[] ciudades = new String[10];

        // llenar el vector
        for (int i = 0; i < 10; i++) {
            System.out.println("Escriba el nombre de una ciudad[" + i + "]");
            ciudades[i] = entrada.nextLine();

        }
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            System.out.println("[" + i + "]" + ciudades[i] + ",");
        }


    }

}
