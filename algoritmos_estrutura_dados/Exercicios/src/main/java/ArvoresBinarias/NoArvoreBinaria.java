package ArvoresBinarias;

public class NoArvoreBinaria {
    private int info;
    private NoArvoreBinaria esquerda;
    private NoArvoreBinaria direita;

    public NoArvoreBinaria(int info) {
        this.info = info;
        esquerda = null;
        direita = null;
    }

    public NoArvoreBinaria(int info, NoArvoreBinaria esquerda, NoArvoreBinaria direita) {
        this.info = info;
        this.esquerda = esquerda;
        this.direita = direita;
    }

    public int getInfo() {
        return info;
    }

    public NoArvoreBinaria getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(NoArvoreBinaria esquerda) {
        this.esquerda = esquerda;
    }

    public NoArvoreBinaria getDireita() {
        return direita;
    }

    public void setDireita(NoArvoreBinaria direita) {
        this.direita = direita;
    }
}
