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
        Veiculo veiculo = new Veiculo("JASD","Audi", "carro");
        
        veiculo.calculaValorTotal(15, 18);
        System.out.println(veiculo.calculaValorTotal(15, 18));
    }
    
}
