/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_6_captura;

import java.util.Scanner;

/**
 *
 * @author lujan
 */
public class EVA3_6_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //length----> cuando no sabmos que numero yb se ponen 
        Scanner captu= new Scanner(System.in);
        String nombres[];
        int edad[];
        int cant;
        
        System.out.println("CANTIDAD DE CLIENTES A CAPTURAR");
        cant = captu.nextInt();
       
        captu.nextLine();
        nombres = new String[cant];
        edad = new int[cant];
        
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("INTRODUCE EL NOMBRE DEL CLIENTE: ");
            nombres[i] = captu.nextLine();
            System.out.println("INTRODUCE LA EDAD DEL CLIENTE: ");
            edad[i] = captu.nextInt();
            captu.nextLine();
            
            
        }
        System.out.println("DATOS CAPTURADOS:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("NOMBRE: "+ nombres[i] + ", EDAD: " + edad[i]);
        }
            
        
    }
    
}
