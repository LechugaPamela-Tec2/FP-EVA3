/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_5_menu2;

import java.util.Scanner;

/**
 *
 * @author lujan
 */
public class EVA3_5_MENU2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] opciones= {"VENTAS", "CLIENTES", "PROVEEDORES", "SALIR"};
        System.out.println("--------------MENU DEL SISTEMA--------------");
        for (int i = 0; i < opciones.length; i++){
            System.out.println(i +" - " + opciones[i]);
        }
        Scanner captu= new Scanner(System.in);
        System.out.println("SELECCIONA UNA OPCION: ");
        int sel = captu.nextInt();
        switch(sel){
            case 0:
                System.out.println("MODULO DE VENTAS ");
                break;
            case 1:
                System.out.println("MODULO DE CLENTES ");
                break;
            case 2:
                System.out.println("MODULO DE PROVEEDORES ");
                break;
            case 3:
                System.out.println("MODULO DE SISTEMA ");
                break;
            default:
                System.out.println("OPCION INCORRECTA");
        }
    }
    
}
