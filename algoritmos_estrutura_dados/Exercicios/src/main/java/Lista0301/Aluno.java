package Lista0301;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Aluno {
    public LocalDate dataNascimento;
    public String nome;

    public Aluno(LocalDate dataNascimento, String nome) {
        this.dataNascimento = dataNascimento;
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
        final Aluno other = (Aluno) obj;
        return Objects.equals(this.nome, other.nome);
    }
}
