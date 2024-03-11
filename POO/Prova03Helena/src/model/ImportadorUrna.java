/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author helenas
 */
public class ImportadorUrna {
    private HashMap<Chapa, Integer> votos;
    File arquivo;

    public ImportadorUrna() {
        this.votos = new HashMap();
    }

    public File getArquivo() {
        return arquivo;
    }

    public HashMap<Chapa, Integer> getVotos() {
        return votos;
    }

    public void setArquivo(File arquivo) {
        this.arquivo = arquivo;
    }

    public void processarArquivo() throws FileNotFoundException {
        try (Scanner sc = new Scanner(this.getArquivo(), "UTF-8")) {
            if (sc.hasNext()) {
                sc.nextLine();
            }
            while (sc.hasNextLine()) {
                String linha = sc.nextLine();
                String[] dados = linha.split(";");

                Chapa novaChapa = new Chapa();
                novaChapa.setNome(dados[0]);
                novaChapa.setPresidente(dados[1]);
                novaChapa.setCursoPresidente(dados[2]);
                novaChapa.setVicePresidente(dados[3]);
                novaChapa.setCursoVicePresidente(dados[4]);

                int voto = Integer.parseInt(dados[5]);
                if (votos.containsKey(novaChapa)) {
                    votos.put(novaChapa, (votos.get(novaChapa) + voto));
                } else {
                    votos.put(novaChapa, voto);
                }
            }
        }
    }

    public int obterTotalVotos() {
        int totalVotos = 0;
        for (Object voto : votos.values()) {
            if (voto instanceof Integer) {
                totalVotos += (Integer) voto;
            }
        }
        return totalVotos;
    }

    public Map.Entry<Chapa, Integer> obterChapaVencedora() {
        Map.Entry<Chapa, Integer> chapaMaisVotada = null;
        for (Map.Entry<Chapa, Integer> entry : votos.entrySet()) {
            if (chapaMaisVotada == null || entry.getValue() > chapaMaisVotada.getValue()) {
                chapaMaisVotada = entry;
            }
        }
        return chapaMaisVotada;

    }
    
}
