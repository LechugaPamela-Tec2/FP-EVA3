/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_10_arreglos_multi;

/**
 *
 * @author lujan
 */
public class EVA3_10_ARREGLOS_MULTI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //UN ARREGLO PUEDE TENER  MULTIPLES DOMENSIONES:
        //ARREGLO DE UNA DIMERNSION:
        //FILAS , COLUMNAS
        int datos[] = new int[10]; // [][][][]
        //ARREGLO DE DOS DIIMENSIONES (MATRIZ)
        int matriz[][] = new int [3][3];
        /*
        [][][]
        [][][]
        [][][]
        */
        for (int i = 0; i < matriz.length; i++) {//FILAS---. ESTE Va A CONTROLAR LAS FILAS
            for (int j = 0; j < matriz[i].length; j++) {//COLUMNAS
                matriz[i][j] = (int) (Math.random()* 100);
                
                
            }
            
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("[" + matriz[i][j] + "]");
                
            }//SIMPRE QUE SE IMPRIMA, TIENEN QUE SER UN SALTO DE FILA, 
            //OSEA EN System.out.println("");
            System.out.println("");
            
        }

               
    }
    
}
