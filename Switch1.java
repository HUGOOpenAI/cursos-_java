/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switch1;

/**
 *
 * @author PC14-LAB02
 */
public class Switch1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mes = 12;
        String estacion;
        if (mes== 1||mes==2||mes==12)
        estacion ="INVIERNO";
        else if (mes==3||mes==4||mes==5)
         estacion ="PRIMAVERA";
        else if (mes==6||mes==5||mes==7)
        estacion ="VERANO";
        else if (mes==7||mes==8||mes==8)
        estacion ="OTOÑO";
        else
        estacion ="MES INCORREVTO";
        System.out.println(estacion);
    }
    
}
