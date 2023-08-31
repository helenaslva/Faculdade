/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Cria um ponto com as coordenadas x = 0 e y = 0
 *
 * @author helenas
 */
public class Ponto {

    /**
     * Cria um objeto ponto com as coordenadas x e y pré definidas
     *
     * @param x valor da coordenada x
     * @param y valor da coordenada y
     */
    public Ponto(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    /**
     * Construtor de ponto sem parâmetro (x e y inicializam em 0)
     */
    public Ponto() {
    }

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;

    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    /**
     * Método que identifica em qual quadrante está o ponto.
     *
     * @return quadrante do plano cartesiano.
     */
    public Quadrante identificarQuadrante() {

        if (this.getX() > 0 && this.getY() > 0) {
            return Quadrante.PRIMEIRO;
        } else if (this.getX() < 0 && this.getY() > 0) {
            return Quadrante.SEGUNDO;
        } else if (this.getX() < 0 && this.getY() < 0) {
            return Quadrante.TERCEIRO;
        } else if (this.getX() > 0 && this.getY() < 0) {
            return Quadrante.QUARTO;
        } else {
            return Quadrante.NENHUM;
        }

    }

    /**
     * Método que indica se o ponto está sobre o eixo X
     *
     * @return true se sim, false se não
     */
    public Boolean estaIncidindoSobreX() {
        if (this.getX() != 0 && this.getY() == 0) {
            return true;
        }
        return false;
    }

    /**
     * Método que indica se o ponto está sobre o eixo Y
     *
     * @return true se sim, false se não
     */
    public Boolean estaIncidindoSobreY() {
        if (this.getX() == 0 && this.getY() != 0) {
            return true;
        }
        return false;
    }

    /**
     * Calcula a distância entre o ponto de parametro e o ponto atual.
     *
     * @param ponto
     * @return distancia
     */
    public double calcularDistancia(Ponto ponto) {
        double dist = 0;
        dist = Math.sqrt(Math.pow((this.getX() - ponto.getX()), 2) + Math.pow((this.getY() - ponto.getY()), 2));
        return dist;
    }

    /**
     * Método estatico que calcula a distância entre dois ponto.
     *
     * @param ponto1 e ponto2
     * @return metodo de calcular a distancia do primeiro parametro.
     */
    public static double calcularDistancia(Ponto ponto1, Ponto ponto2) {

        return ponto1.calcularDistancia(ponto2);
    }

}
