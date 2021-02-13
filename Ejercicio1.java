/*
 Crear una funcion que permita sumar dos matrices y luego su resultado
multiplicarlo por una tercera e imprimir la matriz resultante por consola, quedando
la operacion de este modo: M_RESULTADO = (M_1+M_2)*M_3.Deben tomar en cuenta las
reglas tanto de la suma como de la multiplicacion de matrices. 
 */
 
package ejercicio1prueba;

import java.util.Scanner;

public class ejercicio1prueba {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int M_1[][] = new int[3][3];
        int M_2[][] = new int[3][3];
        int M_3[][] = new int[3][3];
        int M_S[][] = new int[3][3];
        int M_R[][] = new int[3][3];

        //Ingresa los elementos de cada una de las matrices 
        System.out.println("Ingrese los elementos de la Matriz 1: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("M_1[" + i + "][" + j + "]");
                M_1[i][j] = datos.nextInt();
            }
        }
        System.out.println("Ingrese los elementos de la Matriz 2: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("M_2[" + i + "][" + j + "]");
                M_2[i][j] = datos.nextInt();
            }
        }
        System.out.println("Ingrese los elementos de la Matriz 3: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("M_3[" + i + "][" + j + "]");
                M_3[i][j] = datos.nextInt();
            }
        }

        //Imprime en pantalla el valor de cada matriz 
        System.out.println("Los datos de las matrices son: ");
        System.out.println("M_1: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + M_1[i][j] + "]");
            }
            System.out.println();
        }
        System.out.println("M_2: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + M_2[i][j] + "]");
            }
            System.out.println();
        }
        System.out.println("M_3: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + M_3[i][j] + "]");
            }
            System.out.println();
        }

        //Realiza la suma 
        System.out.println("El resultado de la suma de las matrices M1 y M2 es: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                M_S[i][j] = M_1[i][j] + M_2[i][j];
                System.out.print("[" + M_S[i][j] + "]");
            }
            System.out.println();
        }
        System.out.println("El resultado final de la operiacion con la multiplicación es: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; i++) {
                for (int k = 0; k < 3; k++) {
                    M_R[i][j] = M_R[i][j] + M_S[i][k] * M_3[k][j]; 
                    System.out.print("[" + M_R[i][j] + "]");
                }
            }
            System.out.println("");
        }
    }
}

//Maximo Correa C.I 28.412.743 Seccion:Estructura de datos T-01
