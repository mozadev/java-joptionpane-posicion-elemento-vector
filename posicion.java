package posicion;

import javax.swing.JOptionPane;

public class posicion {

    public static void main(String[] args) {

        int num;
        int posicion=0;
        int buscado;

        num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tamaño del arreglo"));

        int[] notas = new int[num];
        
        

        for (int i = 0; i < notas.length; i++) {

            notas[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor[" + i + "]"));

        }
        
        buscado = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor buscado"));

        // intercambio 
        for (int i = 0; i < notas.length; i++) {
            if(buscado==notas[i]){
                posicion=i;
            }
            
        }
        
         
        JOptionPane.showMessageDialog(null, "posicion del buscado: " + posicion);

    }

}

