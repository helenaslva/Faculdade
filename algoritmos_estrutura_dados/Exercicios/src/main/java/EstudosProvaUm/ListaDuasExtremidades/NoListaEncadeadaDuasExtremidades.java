package EstudosProvaUm.ListaDuasExtremidades;

public class NoListaEncadeadaDuasExtremidades {
    private int info;
    private NoListaEncadeadaDuasExtremidades proximo;

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public NoListaEncadeadaDuasExtremidades getProximo() {
        return proximo;
    }

    public void setProximo(NoListaEncadeadaDuasExtremidades proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return String.valueOf(info);
    }
}
