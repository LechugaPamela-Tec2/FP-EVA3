/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_18_metodos;

/**
 *
 * @author lujan
 */
public class EVA3_18_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //BLOQUES DE CODIGOS
        //A TODO PUBLIC SE LE LLAMA CABEZAERA Y MAIN APARTIR DE AHI
        //INVOCACION(DEFINICION DE METODOS)
        
        //LLAMAR O INVOCAR EL METODO
        mostrarMensaje("HOLA MUNDO");
         mostrarMensaje("Pamela Lechuga");
          mostrarMensaje("Fundamentos de Programacion");
          
        //QUE HACER CON METODOS QUE REGRESEN VALORES
        //1. RECUPERAR EL VALOR PARA USARLO DESPUES(VARIOS USOS)
         int resultado = sumar(10,20);
         System.out.println("Suma de 10 + 20 =" + resultado);
         //2. USARLO DIRECTAMENTE (ESTE ES SOLO UN USO)
         System.out.println("Suma de 10 + 20 = " + sumar(10,20));
         //3. NO IMPORTA EL VALOR DE RETORNO
         sumar(10,20);
        
    }
    //MODIFICADORES, VALOR DE RETORNO
                      //DEBE SER UN VERBO INIFINITIVO
                      //VARIAS PALABRAS: INICIAR EN MINUSCULAS, DDEMAS INICIAR EN MAY
    public static void mostrarMensaje(String mensaje)//CABECERA
    {//CUERPO DEL MÉTODO O IMPLEMENTACIÓN
        System.out.println(mensaje);   
    }
    public static int sumar(int val1, int val2){
        int resu = val1 + val2;
        return resu;
    } 
}
