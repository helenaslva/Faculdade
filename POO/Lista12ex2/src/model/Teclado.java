package model;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author helenas
 */
public class Teclado {
        private Scanner scanner;
    public Teclado() {
         scanner  = new Scanner(System.in);
    }
    
    public int lerInt(){
     
        boolean valid = true; 
        int i = 0;
        do{
          try{
            i = Integer.parseInt(scanner.nextLine());
        }catch(NumberFormatException e){
            
            System.out.println("Digite um número inteiro: ");
            valid = false;
        }
        }while(valid == false);
    
        return i;

      
    }
    

    
    public String lerString(){
        String m = scanner.nextLine();
        return m;
    }
    
    public boolean lerBoolean(){
        boolean valor = true;
        boolean valid = false;
        String s = " ";
        do{
            try{
                           
          
           s = scanner.nextLine().toLowerCase();
          if(s.equals("sim") || s.equals("verdadeiro") || s.equals("positivo")|| s.equals("s")){
              valor = true;
              valid = true;
          }else if(s.equals("nao") || s.equals("falso") || s.equals("negativo")|| s.equals("n")){
              valor = false;
              valid = true;
          }else{
              throw new IllegalArgumentException();
              
          }
            }catch(IllegalArgumentException e){
                System.out.println("Digite um texto válido");
                valid = false;
            }
           
        }while(valid == false);
            
    
        return valor;
    }
   
    
}

