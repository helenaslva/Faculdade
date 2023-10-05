/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

/**
 *
 * @author helenas
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
       Pagavel[] p = new Pagavel[3];
       p[0] = new ContaAgua(34, 3);
       p[1] = new PrevidenciaPrivada();
       p[2] = new MensalidadeEnsino(5, 345);
       
      ((PrevidenciaPrivada)p[1]).setValor(76);
      
      Conta conta = new Conta();
      
      for(int i = 0; i < p.length; i++){
          conta.incluirConta(p[i]);
      }
       for(int i = 0; i < p.length; i++){
           System.out.println(p[i]);
      }
      
      System.out.println(conta.calcularValorTotal());
     
           
    }
    
}
