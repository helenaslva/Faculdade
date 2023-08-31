/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.swing.JOptionPane;
import model.Ponto;

/**
 *
 * @author helenas
 */
public class AppQuestao02ui {
    public static void main(String[] args) {
    
    Ponto ponto = new Ponto();
    
    ponto.setX(Integer.parseInt(JOptionPane.showInputDialog("Informe o x: ")));
    ponto.setY(Integer.parseInt(JOptionPane.showInputDialog("Informe o y: ")));
    
    }
    
}
