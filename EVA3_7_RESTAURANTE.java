/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_restaurante;

/**
 *
 * @author lujan
 */
public class EVA3_7_RESTAURANTE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // 2 NOMBRE Y PRECIO  <--- ARREGLOS
        // IMPRIMIR EL MENU DE UN RESTAURANTE, 10 PRODUCTOS, CADA UNO CON SU PRECIO (CON DECIMALES)
        
        String nombre[] = new String[10];
         double precio[] = new double[10];
        
        
       
        
        System.out.println("--------------MENU DEL RESTAURANTE--------------");
        
      
       nombre[0] = "TACOS DE BISTEC"; precio[0] = 25.00;
       nombre[1] = "TACOS DE LENGUA"; precio[1] = 27.00;
       nombre[2] = "TACOS AL PASTOR"; precio[2] = 22.00;
       nombre[3] = "HAMBURGUESAS   "; precio[3] = 85.00;
       nombre[4] = "PIZZA          "; precio[4] = 110.00;
       nombre[5] = "ENCHILADAS     "; precio[5] = 105.00;
       nombre[6] = "TORTA AHOGADA  "; precio[6] = 90.00;
       nombre[7] = "HOT DOG        "; precio[7] = 30.00;
       nombre[8] = "PAPAS FRANCESAS"; precio[8] = 30.00;
       nombre[9] = "REFRESC0       "; precio[9] = 25.00;
       
       
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1) + "." + nombre[i] + "-$" + precio[i]);
            
        }
       
        
        
        
    }
    
}
