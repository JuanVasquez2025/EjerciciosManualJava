import java.util.Scanner;

public class SumaMatrices {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        double[][] mat1 = new double[3][3];
        double[][] mat2 = new double[3][3];
        double[][] matR = new double[3][3];

        System.out.println("Llenando la matriz 1");

        for (int f = 0; f < 3; f++) {

            for (int c = 0; c < 3; c++) {
                System.out.println("Escriba el elemento de la matriz 1:[" + f + "][" + c + "]");
                mat1[f][c] = ent.nextDouble();
            }
        }

        System.out.println("Llenando la matriz 2");
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Ingrese el numero [" + f + "][" + c + "]");
                mat2[f][c] = ent.nextDouble();
            }
        }

        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                matR[f][c] = mat1[f][c] + mat2[f][c];
            }
        }

        for (int f=0; f < 3; f++){
            for (int c=0; c < 3; c++){
                System.out.print(matR[f][c] + "\t");
            }
            System.out.println("\n");
        }

    }

}
