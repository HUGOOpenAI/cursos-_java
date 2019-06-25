/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectores;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class VECTORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] notas = new int [10];
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        while (i<5){
            
            System.out.print("INGRESE NOTA  :");
            notas[i] = scanner.nextInt();
            i++;
        }
            i=0;
            while (i<5){
                System.out.println("LA NOTA ES :"+ notas[i]);
                i++;
            }
        }
    }
    

