/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasejulio82;

/**
 *
 * @author alexa
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int suma1 = SumaNumeros.obtenerSumaUno(5);
        int suma2 = SumaNumeros.obtenerSumaDos(5);
        
        System.out.printf("%d, %d",suma1, suma2);
    }
    
}
