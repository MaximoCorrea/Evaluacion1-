/*
 Crear una función que determine si una matriz es triangular supererio,tomando
end cuenta todas las validaciones necesarias al momento de realizar dicha operación.
 */
package Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int M_T[][] = new int[3][3];

        System.out.println("Ingrese los datos de la matriz: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Posición[" + i + "][" + j + "]");
                M_T[i][j] = datos.nextInt();
            }
        }
        System.out.println("Los datos de la matiz son: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + M_T[i][j] + "]");
            }
            System.out.println("");
        }
        if((M_T[1][0] == M_T[2][0]) && (M_T[2][0] == M_T[2][1])){
        System.out.println("La matriz ingresada es una matriz triangular superior");
         }
         else{
         System.out.println("La matriz ingresada no es una matriz triangular superior");
             }
    }
}

//Maximo Correa C.I 28.412.743 Seccion:Estructura de datos T-01
