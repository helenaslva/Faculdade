/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao01;

/**
 *
 * @author helenas
 */
public class Retangulo extends Figura {

    public Retangulo(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }
    private int largura;
    private int altura; 


    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        double area  = 0;
         area = this.getAltura() * this.getLargura();
        return area; 
    }
    
    
}
