public class Advogado extends Usuario{
    private String oab;

    public Advogado(String nome, String login, String senha, String oab) {
        super(nome, login, senha);
        this.oab = oab;
    }

    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }

    @Override
    public String toString() {
        return super.toString() + "\nOAB: " + getOab();
    }
}
