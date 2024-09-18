package Pilhas;

import java.util.Arrays;

public class PilhaEstatica implements Pilha{

    private int limite;
    private int tamanho;
    private int[] info;

    public PilhaEstatica(int limite) {
        this.limite = limite;
        this.tamanho = 0;
        this.info = new int[limite];
    }

    @Override
    public void push(int valor) {
        if(tamanho==limite){
            throw new RuntimeException("Capacidade máxima da pilha atingida");
        }
        info[tamanho] = valor;
        tamanho++;

    }

    @Override
    public int pop() {
      int valor = peek();
      tamanho--;
      return valor;
    }

    @Override
    public int peek() {
        if(estaVazia()){
            throw new RuntimeException("Pilha está vazia!");
        }
        return info[tamanho - 1];
    }

    @Override
    public boolean estaVazia() {
        return tamanho==0;
    }

    @Override
    public void liberar() {
        info = new int[limite];

    }

    @Override
    public String toString() {
        String resultado = "";
        // Itera de tamanho - 1 até 0 para percorrer os elementos da pilha
        for (int i = tamanho - 1; i >= 0; i--) {
            // Verifica se não é o último elemento
            if (i < tamanho - 1) {
                // Adiciona uma vírgula e um espaço antes do próximo elemento
                resultado += ", ";
            }
            // Obtém o valor do índice i
            int valor = info[i];

            // Concatena o valor ao resultado
            resultado += valor;
        }
        return resultado;
    }

    public void concatenar(PilhaEstatica pilha){
        int tamanhoPilha = pilha.tamanho;

        for(int i = 0; i<tamanhoPilha; i++){
            this.push(pilha.info[i]);

            if(i > this.limite){
                throw new RuntimeException("Pilha sem capacidade");
            }

        }

    }
}
