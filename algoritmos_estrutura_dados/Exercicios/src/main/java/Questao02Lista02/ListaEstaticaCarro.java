package Questao02Lista02;

public class ListaEstaticaCarro {

    private Carro[] info;
    private int tamanho;

        public ListaEstaticaCarro() {
            info = new Carro[10];
            tamanho = 0;
        }

        private void redimensionar() {
            Carro[] novoInfo = new Carro[info.length + 10];
            for (int i = 0; i < info.length; i++) {
                novoInfo[i] = info[i];
            }
            info = novoInfo;
        }

        public void inserir(Carro valor) {
            if (tamanho == info.length) {
                redimensionar();
            }
            info[tamanho] = valor;

            tamanho++;
        }

        public void exibir() {
            for (int indice = 0; indice < tamanho; indice++) {
                Carro valor = info[indice];
                System.out.println(valor);
            }
        }

        public int buscar(String placa) {
            for (int indice = 0; indice < tamanho; indice++) {
                Carro valorLista = info[indice];
                if (valorLista.getPlaca().equals(placa)) {
                    return indice;
                }
            }
            return -1;
        }

        public void retirar(String placa) {
            int indice = buscar(placa);
            if (indice > -1) {
                for (int indiceFor = indice; indiceFor < tamanho - 1; indiceFor++) {
                    info[indiceFor] = info[indiceFor + 1];
                }
            }
            tamanho--;
        }

        public void liberar() {
            info = new Carro[10];
            tamanho = 0;
        }

        public Carro obterElemento(int posicao) {
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
                Carro valor = info[indice];
                resultado += valor.toString();
            }
            return resultado;
        }
}
