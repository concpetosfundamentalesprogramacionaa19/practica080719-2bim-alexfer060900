/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasejulio84;

/**
 *
 * @author alexa
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos el array donde los datos seran almacenados
        int [] arreglo = {10, 20, 30, 1, 2, 3, 40, 4};
        //Llamamos a los metodos con sus respectivos datos 
        int tamaño = TamañoArreglo.obtenerTamanioArreglo(arreglo, 8);
        int tamañoConCiclo = TamañoArreglo.obtenerTamanioArregloConCiclo(arreglo, 8);
        //Imprimimos el resultado final
        System.out.printf("%d\n%d\n" , tamaño, tamañoConCiclo);
    }
    
}
