/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista13;

import java.util.Scanner;

/**
 *
 * @author helenas
 */
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um diretorio: ");
        String dir = input.nextLine();
        try{
            Diretorio meuDiretorio = new Diretorio(dir);
            System.out.println("O tamanho do diretório é: " + meuDiretorio.ObterTamanho()); 
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        
        
        
    }
    
}
