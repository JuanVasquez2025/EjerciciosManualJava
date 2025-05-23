import java.util.Scanner;

public class EjercicioArray1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String[] personas = new String[3];

        System.out.println("Escriba el primer nombre");
        personas[0] = entrada.nextLine();

        System.out.println("Escriba el segundo numero");
        personas[1] = entrada.nextLine();

        System.out.println("Escriba el tercer numero");
        personas[2] = entrada.nextLine();

        System.out.println("");
        System.out.println("Contenido del vector: " + personas[0] + ", " + personas[1] + "," + personas[2]);

    }

}
