import java.io.BufferedReader;
import java.io.IOException;

import javax.swing.JOptionPane;

class main{


    public static void main (String args[]){
        System.out.println("hola mundo");
        potencia operacion = new potencia();
        
        JOptionPane.showConfirmDialog(null, "el resultado es "+operacion.potenciar(mensaje(),mensaje()), null, 0, 0);
    }



    public static int mensaje(){
        int resultado = 0;
        resultado = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero para la potencia", null));

        return resultado;

    }
}