import java.util.Date;

public class Audiencia {
    private String data;
    private String recoTribunal;
    private Processo procRelacionado;

    public Audiencia(String data, String recoTribunal, Processo procRelacionado) {
        this.data = data;
        this.recoTribunal = recoTribunal;
        this.procRelacionado = procRelacionado;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getRecoTribunal() {
        return recoTribunal;
    }

    public void setRecoTribunal(String recoTribunal) {
        this.recoTribunal = recoTribunal;
    }

    public Processo getProcRelacionado() {
        return procRelacionado;
    }

    public void setProcRelacionado(Processo procRelacionado) {
        this.procRelacionado = procRelacionado;
    }

    @Override
    public String toString() {
        return "\nData audiência: " + getData() + "\nRecomendação do tribunal: " + getRecoTribunal() +
                "\nProcesso relacionado: " + getProcRelacionado();
    }
}
