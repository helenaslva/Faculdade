/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio02;

import java.util.Scanner;

/**
 *
 * @author helenas
 */
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ContaBancaria b[] = new ContaBancaria[2];
        
      
//            b[0] = new ContaBancaria();
//            System.out.println("Digite o titular da 1ª conta: ");
//            b[0].setTitular(input.nextLine());
//            System.out.println("Digite o numero da  1ª conta: ");
//            b[0].setNumero(input.nextLine());
//            b[1] = new ContaBancaria();
//             System.out.println("Digite o titular da 2ª conta: ");
//            b[1].setTitular(input.nextLine());
//            System.out.println("Digite o numero da  2ª conta: ");
//            b[1].setNumero(input.nextLine());
for (int i = 0; i < b.length; i++) {
            b[i] = new ContaBancaria();
            System.out.println("Digite o titular da "  + (i + 1)+ "ª conta: ");
            b[i].setTitular(input.nextLine());
            System.out.println("Digite o numero da " + (i + 1)+ "ª conta: ");
            b[i].setNumero(input.nextLine());

        }
            
        
        
        b[0].depositar(1000);
        b[0].depositar(700);
        b[1].depositar(5000);
        b[1].sacar(3000);
        b[0].transferir(b[1], 1800);
        
        for(int i = 0; i<b.length; i++){
        System.out.println("Titular da "+ (i + 1)+ "ª conta: " + b[i].getTitular());
        System.out.println("Saldo da "+ (i + 1)+ "ª conta: " + b[i].getSaldo());
            
        }
        
        
//        System.out.println("Titular: " + b[0].getTitular());
//        System.out.println("Saldo: " + b[0].getSaldo());
//        System.out.println("Titular: " + b[1].getTitular());
//        System.out.println("Saldo: " + b[1].getSaldo());
       
        
    }
   
    
    
    
    
   
}
    
    

