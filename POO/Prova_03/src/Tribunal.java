import java.util.List;

public class Tribunal {
    private String nome;
    private List<Vara> varas;

    public Tribunal(String nome, List<Vara> varas) {
        this.nome = nome;
        this.varas = varas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Vara> getVaras() {
        return varas;
    }
    public boolean contemVara(Vara vara){
        return this.varas.contains(vara);
    }

    @Override
    public String toString() {
        return getNome();
    }
}

