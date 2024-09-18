package Busca.ArvoreBinariaBusca.exercicio;

public class ArvoreBinariaBusca2<T extends Comparable<T>> extends ArvoreBinariaAbstract<T> {

    /**
     * Insere um novo n� na �rvore bin�ria
     *
     * @param info
     */
    public void inserir(T info) {
        NoArvoreBinaria<T> novo = new NoArvoreBinaria<>(info);

        if (estaVazia())
            setRaiz(novo);
        else {
            NoArvoreBinaria<T> p = getRaiz();
            NoArvoreBinaria<T> pai;

            while (true) {
                pai = p;
                if (info.compareTo(p.getInfo()) < 0) {
                    p = p.getEsquerda();
                    if (p == null) {
                        pai.setEsquerda(novo);
                        return;
                    }
                } else {
                    p = p.getDireita();
                    if (p == null) {
                        pai.setDireita(novo);
                        return;
                    }
                }
            }
        }
    }


    /**
     * Retorna o n� que cont�m o dado fornecido como argumento
     *
     * @param info dado a ser pesquisad
     * @return n� localizado
     */
    public NoArvoreBinaria<T> buscar(T info) {
        NoArvoreBinaria<T> p;

        p = getRaiz();

        while (p != null && !p.getInfo().equals(info)) {
            if (info.compareTo(p.getInfo()) < 0)
                p = p.getEsquerda();
            else
                p = p.getDireita();
        }

        return p;
    }


    private NoArvoreBinaria<T> extrairSucessor(NoArvoreBinaria<T> excluir) {
        NoArvoreBinaria<T> p = excluir.getDireita();
        NoArvoreBinaria<T> paiSucessor = excluir;
        NoArvoreBinaria<T> sucessor = p;

        while (p != null) {
            paiSucessor = sucessor;
            sucessor = p;
            p = p.getEsquerda();
        }

        if (sucessor != excluir.getDireita()) {
            paiSucessor.setEsquerda(sucessor.getDireita());
            sucessor.setDireita(excluir.getDireita());
        }

        return sucessor;
    }


    private DadosRemocao obterNoRemover(T info) {
        DadosRemocao dados = new DadosRemocao();
        dados.p = getRaiz();
        dados.pai = null;
        dados.filhoEsquerda = false;

        while ((dados.p != null) && (!dados.p.getInfo().equals(info))) {
            dados.pai = dados.p;

            if (info.compareTo(dados.p.getInfo()) < 0) {
                dados.filhoEsquerda = true;
                dados.p = dados.p.getEsquerda();
            } else {
                dados.filhoEsquerda = false;
                dados.p = dados.p.getDireita();
            }
        }

        return dados;
    }


    private void removerNoFolha(DadosRemocao dados) {
        if (dados.p == getRaiz())
            setRaiz(null);
        else {
            if (dados.filhoEsquerda)
                dados.pai.setEsquerda(null);
            else
                dados.pai.setDireita(null);
        }
    }


    private void removerNoUmFilho(DadosRemocao dados) {
        if (dados.p.getDireita() == null) { // caso 2
            if (dados.p == getRaiz())
                setRaiz(dados.p.getEsquerda());
            else {
                if (dados.filhoEsquerda)
                    dados.pai.setEsquerda(dados.p.getEsquerda());
                else
                    dados.pai.setDireita(dados.p.getEsquerda());
            }
        } else { // if (p.getEsquerda() == null) { // caso 2
            if (dados.p == getRaiz())
                setRaiz(dados.p.getDireita());
            else {
                if (dados.filhoEsquerda)
                    dados.pai.setEsquerda(dados.p.getDireita());
                else
                    dados.pai.setDireita(dados.p.getDireita());
            }
        }
    }


    private void removerNoDoisFilhos(DadosRemocao dados) {
        // caso 3
        NoArvoreBinaria<T> sucessor = extrairSucessor(dados.p);
        if (dados.p == getRaiz())
            setRaiz(sucessor);
        else {
            if (dados.filhoEsquerda)
                dados.pai.setEsquerda(sucessor);
            else
                dados.pai.setDireita(sucessor);
        }
        sucessor.setEsquerda(dados.p.getEsquerda());
    }


    public void retirar(T info) {
        DadosRemocao dados = obterNoRemover(info);

        if (dados.p != null) { // achou dado a ser removido
            if (dados.isNoFolha())
                removerNoFolha(dados);
            else if (dados.temSoUmFilho())
                removerNoUmFilho(dados);
            else
                removerNoDoisFilhos(dados);
        }
    }


    private class DadosRemocao {
        NoArvoreBinaria<T> p, pai;
        boolean filhoEsquerda;

        boolean isNoFolha() {
            return ((p.getDireita() == null) && (p.getEsquerda() == null));
        }

        boolean temSoUmFilho() {
            return ((p.getDireita() != null) ^ (p.getEsquerda() != null));
        }

//		boolean temDoisFilhos() {
//			return ((p.getDireita()!=null) && (p.getEsquerda()!=null));
//		}
    }
}
