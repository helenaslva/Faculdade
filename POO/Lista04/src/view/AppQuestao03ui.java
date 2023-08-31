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
public class AppQuestao03ui {
    public static void main(String[] args) {
    
    int altura = Integer.parseInt(JOptionPane.showInputDialog("Informe a altura: "));
    int comprimento = Integer.parseInt(JOptionPane.showInputDialog("Informe o comprimento: "));
    
    Retangulo retangulo = new Retangulo(altura ,comprimento);
    
    JOptionPane.showMessageDialog(null, "O perímetro é " + retangulo.calcularPerimetro() + " e a área é: " + retangulo.calculaArea());
    
            
    
    
    }
}
