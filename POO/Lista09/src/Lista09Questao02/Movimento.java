/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista09Questao02;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author helenas
 */
public class Movimento {
    private double valor; 
    private TipoMovimento tipoMovimento; 
    private LocalDate data; 
    private LocalTime tempo;

    public double getValor() {
        return valor;
    }

    public TipoMovimento getTipoMovimento() {
        return tipoMovimento;
       
    }

    public LocalDate getData() {
        return data;
    }

    public LocalTime getTempo() {
        return tempo;
    }

    public Movimento(double valor, TipoMovimento tipoMovimento) {
        
        this.valor = valor;
        this.tipoMovimento = tipoMovimento;
    }

    
}
