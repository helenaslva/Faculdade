package MapaDispersao.Exercicio;

public class MapaDispersao<T> {
    private ListaEncadeada<NoMapa<T>>[] info;

    public MapaDispersao(int tamanho) {
        info = new ListaEncadeada[tamanho];
    }

    /**
     * Implementa a fun��o de hash, que � respons�vel por identificar
     * em que posi��o do vetor o objeto deve constar (ou ser armazenado)
     * @param chave Objeto a se calcular o hash
     * @return Hash calculado
     */
    private int calcularHash(int chave) {
        // compacta
        return (chave % info.length);
    }

    /**
     * Insere um objeto no mapa
     * @param dado Objeto a ser adicionado
     */
    public int inserir(int chave, T dado) {
        int indice = calcularHash(chave);

        if (info[indice] == null) {
            info[indice] = new ListaEncadeada<>();
        }

        NoMapa<T> no = new NoMapa<>();
        no.setChave(chave);
        no.setInfo(dado);

        info[indice].inserir(no);

        return indice;
    }


    /**
     * Remove um objeto do mapa. O objeto fornecido como argumento
     * deve ter a chave de busca informada.
     * @param chave Objeto que cont�m a chave de busca do objeto a ser removido
     */
    public void remover(int chave) {
        int indice = calcularHash(chave);

        if (info[indice] != null) {
            NoMapa<T> no = new NoMapa<>();
            no.setChave(chave);
            info[indice].retirar(no);
        }
    }

    /**
     * Busca um objeto na mem�ria. O objeto deve conter a chave de busca informada
     * e o objeto armazenado com a mesma chave ser� buscada
     * @param chave Objeto que cont�m a chave de busca do objeto a ser pesquisado
     * @return
     */
    public T buscar(int chave) {
        int indice = calcularHash(chave);

        if (info[indice] != null) {
            NoMapa<T> noMapa = new NoMapa<>();
            noMapa.setChave(chave);

            NoLista<NoMapa<T>> no;
            no = info[indice].buscar(noMapa);
            if (no != null) {
                return no.getInfo().getInfo();
            }
        }



        return null;
    }





    public void realocarMapa(int novoTamanho) {
        ListaEncadeada<NoMapa<T>>[] antigo = info;
        info = new ListaEncadeada[novoTamanho];

        for (int i=0; i<antigo.length; i++) {
            if (antigo[i] != null) {
                NoLista<NoMapa<T>> p = antigo[i].getPrimeiro();
                while (p!=null) {
                    inserir(p.getInfo().getChave(), p.getInfo().getInfo());
                    p = p.getProximo();
                }
            }
        }

    }

    public double calcularFatorCarga() {
        int quantidadeTotal = 0;
        for (int i = 0; i < info.length; i++) {
            if (info[i] != null) {
                quantidadeTotal += info[i].obterComprimento();
            }
        }

        return (1.0 * quantidadeTotal) / info.length;
    }
}

