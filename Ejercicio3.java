/*
 *Crea una funcion que permita validar si una matriz es indentidad, tomando en 
cuenta los requisitos necesarios para que la misma cumpla con esta caracteristica
debe imprimir en pantalla el resultado de la validadcion de dicha matriz.
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String args[]) {
        Scanner datos = new Scanner(System.in);
        int identidad = 0;
        int Matriz[][] = new int[3][3];

        //Ingresa los datos dentro de la matriz
        System.out.println("Ingrese los elementos de la Matriz: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Posición[" + i + "][" + j + "]");
                Matriz[i][j] = datos.nextInt();
            }
        }
        //Muestra los datos anteriormente ingresados 
        System.out.println("Los datos de la matriz son: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + Matriz[i][j] + "]");
            }
            System.out.println("");
        }
        //Evalua los elementos de la matriz para verificar si es o no una matriz indetentidad
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j && Matriz[i][j] != 1) {
                    identidad = 1;
                    break;
                } else if (i != j && Matriz[i][j] != 0) {
                    identidad = 1;
                    break;
                }
            }
        }
        //Si la matriz ingrasada es de indentidad ejecuta el if 
        if (identidad == 0) {
            System.out.println("La matriz ingresada es una matriz identidad");
        } else {
            System.out.println("La matriz ingresada no es una matriz identidad");
        }
    }
}

//Máximo Correa C.I 28.412.743 Sección: Estructura de Datos T-01
