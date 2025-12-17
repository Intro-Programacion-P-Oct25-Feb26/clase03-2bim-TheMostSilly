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

        for (int fila = 0; fila < estaciones.length; fila++) {
            
            System.out.println("Ingrese el nombre de la estación");
            nombres[fila] = entrada.nextLine();
            int suma = 0;
            for (int col = 0; col < estaciones[fila].length; col++) {
                System.out.println("Ingrese la producción de la estación");
                int prod = entrada.nextInt();
                entrada.nextLine();
                suma = suma + prod;
                estaciones[fila][col] = prod;
               

            }
            produccion[fila] = suma;
            reporte = String.format("%sNombre Estación %s - Total Producción:"
                    + "$%s\n", reporte, nombres[fila], produccion[fila]);
            

        }

        

        }
    }


