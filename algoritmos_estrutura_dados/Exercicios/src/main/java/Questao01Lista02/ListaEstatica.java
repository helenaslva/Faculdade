package Questao01Lista02;

public class ListaEstatica<T>{

    private T[] info;
    private int tamanho;

    public ListaEstatica(){
        info = (T[])  new Object[10];
        tamanho = 0;
    }
    private void redimensionar() {
        T[] novoInfo = (T[]) new Object[info.length + 10];
        for (int i = 0; i < info.length; i++) {
            novoInfo[i] = info[i];
        }
        info = novoInfo;
    }

    public void inserir(T valor) {
        if (tamanho == info.length) {
            redimensionar();
        }
        info[tamanho] = valor;

        tamanho++;
    }

    public void exibir() {
        for (int indice = 0; indice < tamanho; indice++) {
           T valor = info[indice];
            System.out.println(valor);
        }
    }

    public int buscar(String string) {
        for (int indice = 0; indice < tamanho; indice++) {
            T valorLista = info[indice];
            if (valorLista.toString().equals(string)) {
                return indice;
            }
        }
        return -1;
    }

    public void retirar(String string) {
        int indice = buscar(string);
        if (indice > -1) {
            for (int indiceFor = indice; indiceFor < tamanho - 1; indiceFor++) {
                info[indiceFor] = info[indiceFor + 1];
            }
        }
        tamanho--;
    }

    public void liberar() {
        info = (T[]) new Object[10];
        tamanho = 0;
    }

    public T obterElemento(int posicao) {
        if (posicao >= 0 && (posicao < tamanho)) {
            return info[posicao];
        }
        throw new IndexOutOfBoundsException();
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public int getTamanho() {
        return tamanho;
    }
    @Override
    public String toString() {
        String resultado = "";
        for (int indice = 0; indice < tamanho; indice++) {
            if (indice > 0) {
                resultado += ", ";
            }
            T valor = info[indice];
            resultado += valor.toString();
        }
        return resultado;
    }

    public void inverter(){

        for (int indice = tamanho - 1; indice <= info.length; indice--){
            for(int j = 0; j < indice;j++){

                T temp;
                temp = info[j];
                info[j] = info[j+1];
                info[j+1] = temp;

            }

        }

    }


}
