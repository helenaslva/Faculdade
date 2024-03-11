/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista13questao2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author helenas
 */
public class ArquivoMp3 {

    private TagMp3 tagMp3; 

    public ArquivoMp3(String nomeArquivo) throws FileNotFoundException, IOException {
        File arquivo = new File(nomeArquivo);
        
        if(!arquivo.exists()){
            throw new FileNotFoundException(nomeArquivo);
        }
        
        if(!arquivo.isFile()){
            throw new ArgumentoNaoEhArquivoException(nomeArquivo);
        }
        
        try(FileInputStream fis = new FileInputStream(arquivo)){
            
            fis.skip(arquivo.length()-128);
            
            byte[] dados = new byte[128];
            
            fis.read(dados);
            
            String valor = new String(dados);
            
            System.out.println("valor");
        }
    }
    public TagMp3 getTagMp3() {
        return tagMp3;
    }
    
    
    
}
