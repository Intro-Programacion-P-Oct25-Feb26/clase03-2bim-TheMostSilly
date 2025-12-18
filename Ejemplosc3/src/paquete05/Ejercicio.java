/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Ejercicio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] estaciones = new int[5][12];
        String[] nombres = new String[5];
        int[] produccion = new int[5];
        String reporte = "";
        int mayor = produccion[0];
        int mejor = 0;

        for (int fila = 0; fila < estaciones[fila].length; fila++) {

            System.out.println("Ingrese el nombre de la estación");
            nombres[fila] = entrada.nextLine();
            int suma = 0;
            for (int col = 0; col < estaciones[fila].length; col++) {
                System.out.printf("Ingrese la producción de la estación %s\n", col
                        + 1);
                int prod = entrada.nextInt();
                entrada.nextLine();
                suma = suma + prod;
                estaciones[fila][col] = prod;

            }
            produccion[fila] = suma;

        }
        for (int fila = 0; fila < estaciones.length; fila++) {
            if (produccion[fila] > mayor) {
                mayor = produccion[fila];
                mejor = fila;

            }
        }

        for (int fila = 0; fila < estaciones.length; fila++) {
            reporte = String.format("%s%sNombre Estación %s - Total Producción:"
                    + "$%s\n", reporte, nombres[fila], fila + 1, produccion[fila]);

        }
        reporte = String.format("%s\nEstación más productiva: Estación %s\nEncargado"
                + "de la estación: %s\n"
                + "Cantidad de la estación mas productiva: $%s", reporte,
                mejor + 1, nombres[mejor], produccion[mejor]);
        System.out.println(reporte);

    }
}
