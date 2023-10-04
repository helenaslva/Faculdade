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
        

        switch (figura) {
            case "retangulo":
                System.out.println("Escreva a altura: ");
                int altura = input.nextInt();
                System.out.println("Escreva a largura: ");
                int largura = input.nextInt();

                Figura ret = new Retangulo(largura, altura);
                System.out.println("A área do retângulo é " + ret.calcularArea());
                break;
            case "triangulo":
                System.out.println("Escreva o lado 1: ");
                int lado1 = input.nextInt();
                System.out.println("Escreva o lado 2: ");
                int lado2 = input.nextInt();
                System.out.println("Escreva o lado 3");
                int lado3 = input.nextInt();

                Figura tri = new Triangulo(lado1, lado2, lado3);
                System.out.println("A área do triangulo é " + tri.calcularArea());
                break;

            case "quadrado":
                System.out.println("Escreva o lado: ");
                int ladoQuad = input.nextInt();
                Figura quad = new Quadrado(ladoQuad);
                System.out.println("A área do retângulo é " + quad.calcularArea());
                break;
                
            case "circulo":
                System.out.println("Escreva o raio: ");
                int raio = input.nextInt();
                Figura circ = new Circulo(raio);
                System.out.println("A área do retângulo é " + circ.calcularArea());
                break;

        }
    }

}
