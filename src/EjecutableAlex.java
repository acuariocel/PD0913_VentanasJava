
import java.awt.Color;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import vista.Ventana1;
import vista.Ventana5;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author INTERNET3
 */
public class EjecutableAlex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // JOptionPane.showConfirmDialog(null, "Desea salir?");
        //new Ventana1().setVisible(true);
        Object x[]={1,2,3,"Alex"};
        Ventana5 v5 = new Ventana5();
       //v5.getjComboBox1().setBackground(Color.yellow);
        v5.getjComboBox1().setBackground(new Color(255, 255, 0));
        v5.setTitle(new Date()+"");
        v5.setLocation(50,50);
        v5.getjTextArea1().setText("Holaaa");
        v5.getjComboBox1().setModel(new DefaultComboBoxModel(x));
        v5.setVisible(true);
    }
    
}
