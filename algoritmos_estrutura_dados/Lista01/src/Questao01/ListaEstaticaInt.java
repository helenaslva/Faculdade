package Questao01;

public class ListaEstaticaInt {

    private int[] info;
    private int tamanho;

    public ListaEstaticaInt(){
        info = new int[10];
        tamanho = 0;
    }

    private void redimensionar(){
        int[] novoInfo = new int[info.length + 10];

        for(int indice = 0; indice < info.length; indice++){
            novoInfo[indice] = info[indice];
        }
        info = novoInfo;
    }

    public void inserir(int valor){
        if(tamanho == info.length){
            redimensionar();
        }

        info[tamanho] = valor;
        tamanho++;
    }

    public void exibir(int valor) {
        for (int indice = 0; indice < tamanho; indice++) {
            System.out.println("[" + indice + "]: " + valor);
        }
    }

    public int buscar(int valor){
        for(int indice = 0; indice<tamanho; indice++){
            int valorLista = info[indice];

            if(valorLista == valor){
                return indice;
            }

        }
        return -1;
    }

    public void retirar(int valor){
        int indice = buscar(valor);

        if(indice < -1){
            for(int indiceFor = indice; indiceFor < tamanho - 1; indice --){
                info[indiceFor] = info[indiceFor - 1];
            }
        }
    }

    public int ObterElemento(int posicao){
        if(posicao>=0 && (posicao < tamanho)){
            return info[posicao];
        }

        throw new IndexOutOfBoundsException();
    }

    public boolean estaVazia(){
        return tamanho == 0;
    }

    public int getTamanho(){
        return tamanho;
    }


    //@Override
//    public String toString(){
//
//    }
}
