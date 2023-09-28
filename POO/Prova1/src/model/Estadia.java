/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author helenas
 */
public class Estadia {

    public Estadia() {
    }

    public Estadia(int horaEntrada, int horaSaida) {
        this.setHoraEntrada(horaEntrada);
        this.setHoraSaida(horaSaida);
    }
    private int horaEntrada;
    private int horaSaida; 

    public int getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(int horaEntrada) {
        if(this.horaEntrada > 24 || this.horaEntrada < 0){
            throw new IllegalArgumentException("Hora de entrada inválida" + horaEntrada);
        }else{
            this.horaEntrada = horaEntrada;
        }
        
    }

    public int getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(int horaSaida) {
         if(this.horaSaida > 24 || this.horaSaida < 0){
            throw new IllegalArgumentException("Hora de saída inválida" + horaSaida);
        }else{
            this.horaSaida = horaSaida;
        }
    }
    
    /**
     * Método para calcular o tempo de estadia de um veiculo no estacionamento. 
     * @return tempo, em horas, de estadia
     */
    public int calcularTempoEstadia(){
        int tempoEstadia;
        
        tempoEstadia = (this.getHoraSaida() - this.getHoraEntrada());
        if(tempoEstadia < 0){
            tempoEstadia = tempoEstadia + 24; 
        }
        return tempoEstadia;
        
    }
    /**
     * Método que calcula o valor a ser pago de acordo com as horas de estacionamento.
     * @return o valor total a ser pago.
     */
    
    public double calcularValorPagar(){
        int tempoEstadia = calcularTempoEstadia();
        double valorTotal;
        
        if(tempoEstadia <=4 ){
            valorTotal = 12.00;
            
        }else{
            valorTotal = 12 + ((tempoEstadia - 4) * 3);
        }
        
        return valorTotal;
    }
    
    
}
