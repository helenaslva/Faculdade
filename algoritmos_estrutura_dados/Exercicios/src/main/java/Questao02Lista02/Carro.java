package Questao02Lista02;

public class Carro {

    private String placa;
    private String nomeProprietario;

    public Carro(String placa, String nomeProprietario) {
        super();
        this.placa = placa;
        this.nomeProprietario = nomeProprietario;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public String getPlaca() {
        return placa;
    }

    @Override
    public String toString() {
        return placa;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((placa == null) ? 0 : placa.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Carro other = (Carro) obj;
        if (placa == null) {
            if (other.placa != null)
                return false;
        } else if (!placa.equals(other.placa))
            return false;
        return true;
    }



}
