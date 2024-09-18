package MapaDispersao.Exercicio;

import java.time.LocalDate;
import java.util.Date;

public class ExemploHashString {
    public static void main(String[] args) {
        String textoCasa = "267485";

        System.out.println(textoCasa.hashCode());
        LocalDate data = LocalDate.now();
        Aluno aluno1 = new Aluno(197385,  "Blabla", data);
        MapaDispersao mapa = new MapaDispersao<>(521);
        System.out.println(mapa.inserir(aluno1.getMatricula(), aluno1));

       // System.out.println(257841%521);
        //System.out.println(365289%521);
        //System.out.println(746014%521);
        //System.out.println(197385%521);
        //System.out.println(267485%521);
    }
}
