
import java.awt.Color;
import java.util.Date;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import vista.Ventana1;
import vista.Ventana5;
import vista.Ventana6;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author INTERNET3
 */
public class EjecutableStalin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // JOptionPane.showConfirmDialog(null, "Desea salir?");
       
        Object x[]= {1,2,3,"Stalin"};
        Ventana5 v5 = new Ventana5();
//        v5.getjComboBox1().setBackground(Color.green);//para poner color en el combobox1(rojo verde azul)
      
        v5.getjComboBox1().setBackground(new Color(255, 255, 0));//para poner color
        v5.getjComboBox1().setModel(new DefaultComboBoxModel(x));
        v5.getjTextArea1().setText("Nombre");//para enviar un texto al te
        v5.setTitle(new Date()+"");//Para poner la fecha de titulo de la ventana
        v5.setLocation(50,50);//para ubicar la ventana en una posicion
        v5.setVisible(true);
        
        
    }
    
}
