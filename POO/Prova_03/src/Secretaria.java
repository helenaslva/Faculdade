public class Secretaria extends Usuario{
    private String clt;

    public Secretaria(String nome, String login, String senha, String clt) {
        super(nome, login, senha);
        this.clt = clt;
    }

    public String getClt() {
        return clt;
    }

    public void setClt(String clt) {
        this.clt = clt;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCLT: " + getClt();
    }
}
