package Lista0301;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Publicacao {
    public LocalDate data;
    public String textoPublicacao;

    public Publicacao(LocalDate data, String textoPublicacao) {
        this.data = data;
        this.textoPublicacao = textoPublicacao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getTextoPublicacao() {
        return textoPublicacao;
    }

    public void setTextoPublicacao(String textoPublicacao) {
        this.textoPublicacao = textoPublicacao;
    }


    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.data);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Publicacao other = (Publicacao) obj;
        return Objects.equals(this.data, other.data);
    }
}
