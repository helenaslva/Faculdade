/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author helenas
 */
public class Imovel {
    private String endereco; 
    private int area;
    private Bairro bairro; 
    private Finalidade finalidade; 

    public Finalidade getFinalidade() {
        return finalidade;
    }

    public void setFinalidade(Finalidade finalidade) {
        this.finalidade = finalidade;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        if(area < 0){
            throw new IllegalArgumentException("A área não pode ter valor negativo: " + area);
        }
        this.area = area;
    }
    
    public double calcularIptu(){
        if(this.getBairro() == null){
            throw new IllegalArgumentException("O bairro não foi definido");
        }
        
        if(this.getBairro().getCoeficienteIptu() < 0){
            throw new IllegalArgumentException("O valor do coeficiente não pode ser negativo" + this.getBairro().getCoeficienteIptu());
        }
        
        if(this.getFinalidade() == null){
            throw new  IllegalArgumentException("A finalidade deve ser definida");
        }
        if(this.getArea() == 0){
              throw new  IllegalArgumentException("A area deve ser definida");
        }
        
      
            double  valorIptu = 0; 
            
            switch(this.getFinalidade()){
                case RESIDENCIAL: 
                   valorIptu = this.getArea() * 1;
                    break; 
                case COMERCIAL: 
                    if(this.getArea() < 400){
                        if(this.getArea() <= 100){
                            valorIptu = 500;
                        }else if(this.getArea() > 100){
                            valorIptu = 1000;
                        }
                    }else{
                        valorIptu = this.getArea() * 2.55;
                    }
                    break;
                case INDUSTRIAL:
                    if(this.getArea()<=2000){
                        valorIptu = 1000;
                    }else{
                        valorIptu = this.getArea() * 0.55;
                    }
                    break; 
            }
            
            valorIptu = valorIptu * this.getBairro().getCoeficienteIptu();
            return valorIptu; 
        }
        
    
   
}
