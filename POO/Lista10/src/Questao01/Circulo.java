/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao01;

/**
 *
 * @author helenas
 */
public class Circulo extends Figura {

    public Circulo(int raio) {
        this.raio = raio;
    }
    
    private int raio;

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        double area;
        
        area = Math.PI * Math.pow(raio, 2);
        return area; 
    }
    
}
