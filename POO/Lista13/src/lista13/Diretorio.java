/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista13;

import java.io.File;

/**
 *
 * @author helenas
 */
public class Diretorio {

    private File diretorio; 
    
    public Diretorio(String caminho) {
        
        diretorio = new File(caminho);
        
        if(!diretorio.exists()){
            throw new IllegalArgumentException("O diretório " + caminho + " não existe");
        }
    }
    
     public long ObterTamanho(){
         return ObterTamanho(this.diretorio);
     }
             
     private long ObterTamanho(File algumDiretorio){
        long tamanhoTotalArquivos = 0; 
        
        File[] dir = algumDiretorio.listFiles();
        if(dir != null){
            for(File f: dir){
            if(f.isDirectory()){
                tamanhoTotalArquivos += ObterTamanho(f);
                
            }else{
                tamanhoTotalArquivos += f.length();
            }
        }
        }
        
                
        return tamanhoTotalArquivos; 
    }

   
    
}
