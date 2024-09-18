package EstudosProvaUm.Lista04Exercicio;


import java.time.LocalDate;
import java.util.Objects;

public class Publicacao {
    private LocalDate data;
    private String texto;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Publicacao other = (Publicacao) obj;
        return Objects.equals(data, other.data);
    }
}
