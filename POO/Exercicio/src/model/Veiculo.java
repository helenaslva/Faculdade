/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalTime;
import java.util.Date;

/**
 *
 * @author helenas
 */
public class Veiculo {

    public Veiculo(String placa, String modelo, String tipo) {
        this.setPlaca(placa);
        this.setModelo(modelo);
        this.setTipo(tipo);
    }
    private String placa;
    private String modelo;
    private String tipo; 
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    public double calculaValorTotal(int horaEntrada, int horaSaida){
        double valorTotal = 0; 
        if(horaSaida >= horaEntrada){
            if(this.getTipo() == "carro"){
                int precoCarro;
                precoCarro = 10;
                valorTotal = (horaSaida - horaEntrada)*precoCarro;
            }else if(this.getTipo() == "moto"){
                 int precoMoto = 5;
                 valorTotal = (horaSaida - horaEntrada)*precoMoto;
            }
        }else{
             throw new IllegalArgumentException("A hora de entrada deve ser menor que a hora de saída");
        }
        
       
        return valorTotal;
    }
    
   
}
