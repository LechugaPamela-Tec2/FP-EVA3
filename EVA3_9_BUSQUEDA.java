/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_9_busqueda;

import java.util.Scanner;

/**
 *
 * @author lujan
 */
public class EVA3_9_BUSQUEDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] valores= new int[10];
        Scanner captu= new Scanner(System.in);
        
        int valor;
        boolean valorEncontrado = false;
        for(int i = 0; i < valores.length; i++){
            valores[i] = (int)(Math.random()* 100);
            
        }
        for (int i = 0; i < valores.length; i++) {
             System.out.println("[" + valores[i] + "]" );
            
        }
        do{//PIDE VALORES AL USUARIO
            //PEDIR VALOR AL USUARIO
            System.out.println("INTRODUCE EL VALOR A BUSCAR EN EL ARREGLO: ");
            valor = captu.nextInt();
            captu.nextLine();
            //BUSCAR
            // RECORRER TODOS LOS  VALORES DEL ARREGLO
            for (int i = 0; i < valores.length; i++) {
                if(valor == valores[i]){//BUSCA POSICION POR POSICION HASTA ENCONTRARLO
                 System.out.println("ENCONTRE EL VALOR, ESTA EN LA POSICION: " + i);
                 valorEncntrado = true;
                 break;
                    
                }
               
                
            }
            //SI ESTA EN EL ARREGLO SALIMOS DEL CICLO
            if(valorEncontrado)
                break;
        }while(true);
    }
    
}
