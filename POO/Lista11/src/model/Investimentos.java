/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author helenas
 */
public abstract class Investimentos implements Pagavel{
    
    private double saldo; 

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    protected double getSaldo() {
        return saldo;
    }
}
