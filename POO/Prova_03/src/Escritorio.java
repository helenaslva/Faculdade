import java.util.ArrayList;
import java.util.List;

public class Escritorio {
    private ArrayList<Processo> processos = new ArrayList<>();

    public Processo buscarProcesso(String codigo) throws IllegalArgumentException{
        for(Processo processo : processos){
            if(processo.getCodigo().equals(codigo)) {
                return processo;
            }
        }
        throw new IllegalArgumentException("Processo não existe. Verfique o código e tente novamente");
    }
    public List<Processo> listarProcessosAbertos(){
        List<Processo> processosAbertos = new ArrayList<>();
        for(Processo processo : processos){
            if(processo.getStatus()==StatusProcesso.EM_ANDAMENTO){
                processosAbertos.add(processo);
            }
        }
        if(processosAbertos.isEmpty()){
            throw new IllegalArgumentException("Não há processos em aberto");
        }
        return processosAbertos;
    }

    public List<Custa> consultaDespesa(String codigo) {
        Processo processo = buscarProcesso(codigo);
        if (processo == null) {
            throw new IllegalArgumentException("Processo não existe");
        }
        return new ArrayList<>(processo.getCustas());
    }


    public List<Processo> processosAdvogado(Advogado advogado) {
        List<Processo> processoAdvogado = new ArrayList<>();
        for (Processo processo : processos) {
            if (processo.getAdvogado().equals(advogado)) {
                processoAdvogado.add(processo) ;
            }
        }
        if(processoAdvogado.isEmpty()){
            throw new IllegalArgumentException("Não há processos vinculados ao advogado");
        }
        return processoAdvogado;
    }


    public void adicionarProcesso(Processo processo) {
        this.processos.add(processo);
    }

}