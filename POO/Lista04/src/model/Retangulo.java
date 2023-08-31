/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *  Construtor de um retângulo
 * @author helenas
 */
public class Retangulo {
    

    public Retangulo() {
    }
    /**
     * Construtor de um retangulo
     * @param altura
     * @param comprimento 
     */
    public Retangulo(int altura, int comprimento) {
        this.setAltura(altura);
        this.setComprimento(comprimento);
    }
    
    private int altura; 
    private int comprimento; 

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        if(altura>= 0){
        this.altura = altura;
        }else{
            throw new RuntimeException("Valor incorreto para altura: "+ altura);
        }
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        if(comprimento >= 0){
        this.comprimento = comprimento;
        }else{
            throw new RuntimeException("Valor incorreto para comprimento: "+comprimento);
        }
    }
    
    /**
     * Método para calcular o perímetro de um retângulo
     * @return Valor do perímetro
     */
    public int calcularPerimetro(){
        int perimetro = 0; 
        
        perimetro = (this.getAltura()*2) + (this.getComprimento()*2);
        
        return perimetro;
    }
     /**
     * Método para calcular a area de um retângulo
     * @return Valor da área
     */
    public int calculaArea(){
        int area = 0;
         area = (this.getAltura()*this.getComprimento());
        return area; 
    }
  
    
}
