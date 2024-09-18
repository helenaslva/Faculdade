package EstudosProvaUm.ListaEstaticaGenerica;

import java.util.Objects;

public class Carro {

    private String placa;
    private  String nomeProprietario;

    public Carro(String placa, String nomeProprietario) {
        super();
        this.placa = placa;
        this.nomeProprietario = nomeProprietario;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Objects.equals(placa, carro.placa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(placa);
    }

    @Override
    public String toString() {
        return placa;
    }
}
