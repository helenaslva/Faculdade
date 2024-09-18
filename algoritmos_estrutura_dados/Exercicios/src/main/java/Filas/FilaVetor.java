package Filas;

import java.util.Arrays;

public class FilaVetor implements Fila {
    private int[] info;
    private int limite;
    private int tamanho;
    private int inicio;

    public FilaVetor(int limite) {
        this.limite = limite;
        this.info = new int[limite];
        this.tamanho = 0;
        this.inicio = 0;
    }

    @Override
    public void inserir(int valor) {
        if(tamanho == limite){
            throw new RuntimeException("Sem capacidade para armazenar");
        }

        int posicao = (inicio + tamanho) % limite;

        info[posicao] = valor;
        tamanho++;
    }

    @Override
    public boolean estaVazia() {
        return this.tamanho == 0;
    }

    @Override
    public int peek() {
        if (estaVazia()){
            throw new RuntimeException("A lista está vazia!");
        }
        return info[inicio];
    }

    @Override
    public int retirar() {
        //busca o primeiro da lista
        int valor = peek();

        info[inicio] = 0;

        inicio = (inicio + 1) % limite;
        tamanho--;
        return valor;
    }

    @Override
    public void liberar() {
        info = new int[limite];
        tamanho = 0;
        inicio = 0;

    }

//    public void encolher() {
//
//        int[] novaInfo = new int [this.tamanho];
//
//        for (int i = 0; i < this.tamanho; i++) {
//            novaInfo[i] = info[(inicio + i) % limite];
//        }
//
//        this.info = novaInfo;
//        this.limite = tamanho;
//        this.inicio = 0;
//    }

    @Override
    public String toString() {
        return "FilaVetor{" +
                "info=" + Arrays.toString(info) +
                ", limite=" + limite +
                ", tamanho=" + tamanho +
                ", inicio=" + inicio +
                '}';
    }
}
