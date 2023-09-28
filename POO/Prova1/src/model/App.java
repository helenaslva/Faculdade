/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author helenas
 */
public class App {
    public static void main(String[] args) {
        
        Estadia estadia1 = new Estadia(22, 3);
        Estadia estadia2 = new Estadia(20, 2);
        
        
        System.out.println(estadia1.calcularValorPagar());
        System.out.println(estadia2.calcularValorPagar());
    }
}
