/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import java.util.Scanner;

/**
 *
 * @author PC14-LAB02
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer =  new Scanner(System.in);
    int notas;

    System.out.print("INGRESE CANTIDAD DE DATOS :");
    notas = leer.nextInt();

     int suma = 0;
     int prom = 0; 
     int nota = 0;

      for(int i=1; i<= notas; i++){
      System.out.println("INGRESE DATOS  :"+" "+i+" "+"de"+" "+notas+":");
      nota = leer.nextInt();          
      suma = suma + nota;
     }

       prom = suma / notas;
       System.out.println("PROMEDIO DE LAS NOTAS ES  :"+prom );
        }
        
    }
    
