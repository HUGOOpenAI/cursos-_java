/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switch2;

/**
 *
 * @author PC14-LAB02
 */
public class Switch2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mes=5;
        String estacion;
        switch(mes){
            case 1: case 2: case 12:
                estacion="INVIERNO";
                break;
            case 3: case 4: case 5:
                estacion="PRIMAVERA";
                break;
            case 6: case 7: case 8:
                estacion="VERANO";
                break;
            case 9: case 10: case 11:
                estacion="OTOÑO";
                break;
            default:
                estacion="MES INCORRECTO";
                break;
        }
        System.out.println(estacion);
       
    }
    
}
