/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao01;

/**
 *
 * @author helenas
 */
public class Triangulo extends Figura{

    public Triangulo(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    private int lado1 ;

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }
    private int lado2;
    private int lado3;

    @Override
    public double calcularArea() {
        double area; 
        double p;
        
        p = (this.getLado1() + this.getLado2() + this.getLado3())/2;
        area = Math.sqrt((p * ( p - this.getLado1()) * ((p-this.getLado2())) * ((p - this.getLado3()))));
        return area; 
    }
    
}
