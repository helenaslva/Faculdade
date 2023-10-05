/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao01;

import java.util.Scanner;

/**
 *
 * @author helenas
 */
public class App {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite a figura desejada: ");
        String figura = input.nextLine().toLowerCase();
        
        Figura figuraGeometrica = null; 

        switch (figura) {
            case "retangulo":
                System.out.println("Escreva a altura: ");
                int altura = input.nextInt();
                System.out.println("Escreva a largura: ");
                int largura = input.nextInt();
                figuraGeometrica = new Retangulo(largura, altura);
                break;
            case "triangulo":
                System.out.println("Escreva o lado 1: ");
                int lado1 = input.nextInt();
                System.out.println("Escreva o lado 2: ");
                int lado2 = input.nextInt();
                System.out.println("Escreva o lado 3");
                int lado3 = input.nextInt();
                figuraGeometrica = new Triangulo(lado1, lado2, lado3);
                break;

            case "quadrado":
                System.out.println("Escreva o lado: ");
                int ladoQuad = input.nextInt();
                figuraGeometrica = new Quadrado(ladoQuad);
                break;
                
            case "circulo":
                System.out.println("Escreva o raio: ");
                int raio = input.nextInt();
                figuraGeometrica = new Circulo(raio);
                break;

        }
        System.out.println("A área da figura é " + figuraGeometrica.calcularArea());
    }

}
