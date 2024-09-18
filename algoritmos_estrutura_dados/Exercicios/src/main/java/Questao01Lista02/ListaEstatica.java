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

    public int buscar(T valor) {
        // Percorre o vetor.
        for (int indice = 0; indice < tamanho; indice++) {
            // Obtém o valor do indice.
            T valorLista = info[indice];
            // Verifica se o valor é igual ao valor informado.
            if (valorLista.equals(valor)) {
                // Caso encontar o valor, retorna o indice do mesmo.
                return indice;
            }
        }
        // Se não encontrou nenhum elemento igual, retorna -1.
        return -1;
    }

    public void retirar(T valor) {
        // Busca indice do elemento que deverá ser removido.
        int indice = buscar(valor);
        // Se encontar, realiza a remoção.
        if (indice > -1) {
            // Percorre o vetor a partir do indice do elemento que deve ser removido.
            for (int indiceFor = indice; indiceFor < tamanho - 1; indiceFor++) {
                // Move todos os valores para a esquerda
                info[indiceFor] = info[indiceFor + 1];
            }
        }
        // Decrementa a variável de tamanho da lista.
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
