import java.util.Date;

public class Custa {
    private String data;
    private String descricao;
    private double valor;
    private Pessoa pagante;

    public Custa(String data, String descricao, double valor) {
        this.data = data;
        this.descricao = descricao;
        this.valor = valor;
    }
    public Pessoa getPagante() {
        return pagante;
    }

    public void setPagante(Pessoa pagante) {
        this.pagante = pagante;
    }
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Pagante: "+ getPagante().getNome() + "- R$" + getValor() + " - Descrição: " + getDescricao() + " - Data: " + getData();
    }
}
