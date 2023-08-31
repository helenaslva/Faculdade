/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.swing.JOptionPane;
import model.Retangulo;


/**
 *
 * @author helenas
 */
public class AppQuestao2ui {
     public static void main(String[] args) {
            
        Retangulo retangulo = new Retangulo();
        retangulo.setAltura(Integer.parseInt(JOptionPane.showInputDialog("Informe a altura: ")));
        retangulo.setComprimento(Integer.parseInt(JOptionPane.showInputDialog("Informe o comprimento: ")));
        
        
        JOptionPane.showMessageDialog(null, "Perimetro é "+ retangulo.calcularPerimetro() + "e a área é " + retangulo.calculaArea());
     }
  
    
}
