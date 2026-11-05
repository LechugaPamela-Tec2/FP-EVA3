/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_2_arreglos;

/**
 *
 * @author lujan
 */
public class EVA3_2_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //SI QUIERES HACER UN ARREGLO LO TIENES QUE CREAR
        int arreglo[], x, y;// SOLO ARREGLO EN UN ARREGLO
        //int[] arreglo, x, y;
        arreglo = new int[10];//ARREGLO CON 10 ENTEROS
        
        //arreglo[9] = 100; EL INDICE ES INCORRECTO, 10 NO ES UNA POSICION VALIDA (LLEGA HASTA EL 9)
        //EL USO DE ARREGLOS VA LIGADOAL USO DE CICLOS,
        //EN PARTICULAR EL CICLO FOR
        // el for fue diseñado para tra{bajr con arreglos
        for(int i = 0; i < 10; i++){
             arreglo[i] = (int)(Math.random() * 100);//CASTING ---> COMPATIBLES
             // ES UN PROCESO DE CAMBIO, SE COMVIRTIO EN INT
                    
           
        }
        for(int i = 0; i < 10; i++){
            System.out.println(arreglo[i] + " - ");
        }
        
        
    }
    
}
