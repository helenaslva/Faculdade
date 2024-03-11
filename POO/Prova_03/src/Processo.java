import java.util.ArrayList;

public class Processo {
    private String codigo;
    private StatusProcesso status;
    private String descricao;
    private Pessoa cliente;
    private Pessoa parteContraria;
    private Secretaria secretaria;
    private Advogado advogado;
    private ArrayList<Custa> custas;
    private Tribunal tribunal;
    private Vara vara;
    private ArrayList<Audiencia> audiencias;
    private boolean processoGanho= false;

    public Processo(String codigo, StatusProcesso status, String descricao, Pessoa cliente, Pessoa parteContraria, Secretaria secretaria, Advogado advogado) {
        setCodigo(codigo);
        setStatus(status);
        setDescricao(descricao);
        this.cliente = cliente;
        this.parteContraria = parteContraria;
        this.secretaria = secretaria;
        this.advogado = advogado;
        this.custas = new ArrayList<>();
        this.audiencias = new ArrayList<>();
        }

    public boolean isProcessoGanho() {
        return processoGanho;
    }

    public void setProcessoGanho(boolean processoGanho) {
        this.processoGanho = processoGanho;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public StatusProcesso getStatus() {
        return status;
    }

    public void setStatus(StatusProcesso status) {
        this.status = status;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public Pessoa getParteContraria() {
        return parteContraria;
    }

    public void setParteContraria(Pessoa parteContraria) {
        this.parteContraria = parteContraria;
    }

    public Secretaria getSecretaria() {
        return secretaria;
    }

    public void setSecretaria(Secretaria secretaria) {
        this.secretaria = secretaria;
    }

    public Advogado getAdvogado() {
        return advogado;
    }

    public void setAdvogado(Advogado advogado) {
        this.advogado = advogado;
    }

    public ArrayList<Custa> getCustas() {
        return custas;
    }

    public void setCustas(ArrayList<Custa> custas) {
        this.custas = custas;
    }

    public Tribunal getTribunal() {
        return tribunal;
    }

    public void setTribunal(Tribunal tribunal) {
        this.tribunal = tribunal;
    }

    public Vara getVara() {
        return vara;
    }

    public void setVara(Vara vara) {
        this.vara = vara;
    }

    public ArrayList<Audiencia> getAudiencias() {
        return audiencias;
    }

    public void setAudiencias(ArrayList<Audiencia> audiencias) {
        this.audiencias = audiencias;
    }

    public void adicionarCustas(Custa newCustas) {
        if (newCustas == null || custas.contains(newCustas)) {
            throw new IllegalArgumentException("Custa inexistente ou inválida");
        }
        this.custas.add(newCustas);
    }
    public void adicionarTribunal(Tribunal tribunal){
        this.tribunal = tribunal;
    }
    public void adicionarAudiencia(Audiencia audiencia){
        if(audiencia == null || this.tribunal == null || !this.tribunal.equals(audiencia.getProcRelacionado().getTribunal())){
            throw new IllegalArgumentException("A Audiência deve ocorrer no tribunal ao qual o processo está vinculado.");
       }
        this.audiencias.add(audiencia);
    }
    public void adicionarVara(Vara vara){
        if(this.tribunal != null && this.tribunal.contemVara(vara)){
            this.vara = vara;
        } else {
            throw new IllegalArgumentException("Vara não pertence ao tribunal relacionado");
        }
    }
    public void mudarStatus(){
        setStatus((this.status == StatusProcesso.EM_ANDAMENTO) ? StatusProcesso.FECHADO : StatusProcesso.EM_ANDAMENTO);
    }

    public void processoGanho(boolean ganhou){
        setProcessoGanho(ganhou);
        atribuirCustas();
    }

    private void atribuirCustas(){
        if(this.isProcessoGanho() == true){
            for(Custa c: this.getCustas()){
                c.setPagante(this.getParteContraria());
            }
        }else{
            for(Custa c: this.getCustas()){
                c.setPagante(this.getCliente());
            }
        }
    }

    @Override
    public String toString() {
        String string = "\nProcesso: " + getCodigo() +
                "\nProcesso ganho: " + isProcessoGanho() +
                "\nStatus: " + (getStatus()) +
                "\nDescrição: " + getDescricao() +
                "\nCliente: " + cliente.getNome() +
                "\nParte contrária: " + parteContraria.getNome() +
                "\nSecretária: " + secretaria.getNome() +
                "\nAdvogado: " + advogado.getNome() +
                "\nTribunal: " + tribunal.toString() +
                "\nVara: " + (vara != null ? vara.toString() : "Não atribuída") +
                "\nCustas: ";

        for (Custa custa : custas){
            string += custa.toString()  + "\n";
        }

        return string;
    }
}
