import java.util.Scanner;

public class EjemploMatrices1 {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        String[][] animales = new String[3][3];

        for (int f = 0; f < 3; f++) {
            for (int c = 0; f < 3; f++) {

                System.out.println("Escriba el nombre de un animal:[" + f + "][" + c + "]");
                animales[f][c] = ent.next();
            }

        }

        System.out.println("");
            for (int f = 0; f<3;f++){{
                for(int c=0;c<3;c++){
                    System.out.println(animales[f][c]+"\t");

                }
                System.out.println("\n");
            }
        }

    }

}
