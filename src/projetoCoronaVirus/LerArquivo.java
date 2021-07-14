/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoCoronaVirus;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author junio
 */
public class LerArquivo {
    public static void main(String[] args) {
        Arvore1 a = new Arvore1();
        File arquivoCSV = new File("C:\\Users\\junio\\Downloads\\arquivoLeitura.csv");
        
        DateFormat formatter = new SimpleDateFormat("dd/mm/yy");
      
        
        try{
            String linhas= new String();
            Scanner leitor = new Scanner(arquivoCSV);
           
            leitor.nextLine();
            
            while(leitor.hasNext()){
                Dados dadosLidos = new Dados();
                linhas = leitor.nextLine();
                
                String []valores = linhas.split(";");
               
                dadosLidos.setRegiao(valores[0]);
                dadosLidos.setEstado(valores[1]);
                dadosLidos.setMunicipio(valores[2]);
              
                if(valores[3].isEmpty()==true){
                  valores[3] = "0";
                }
                if(valores[4].isEmpty()==true){
                   valores[4]="0";
                }
                if(valores[5].isEmpty()==true){
                    valores[5]="0";
                }    
                
                dadosLidos.setCoduf(Integer.parseInt(valores[3]));
                dadosLidos.setCodmun(Integer.parseInt(valores[4]));
                dadosLidos.setCodregiao(Integer.parseInt(valores[5]));
                dadosLidos.setNomeRegiao(valores[6]);
                
                Date data = null;
                try {
                    data = (Date)formatter.parse(valores[7]);
                } catch (ParseException ex) {
                    Logger.getLogger(LerArquivo.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                dadosLidos.setData(data);
                
                dadosLidos.setSemanaEpi(valores[8]);
                dadosLidos.setNumPopulacao(valores[9]);
                dadosLidos.setCasosAcumulados(valores[10]);
                dadosLidos.setCasosNovos(valores[11]);
                dadosLidos.setObitosAcumulados(valores[12]);
                dadosLidos.setObitosNovos(valores[13]);
                dadosLidos.setRecuperadosNovos(valores[14]);
                dadosLidos.setAcompanhamentoNovos(valores[15]);
                dadosLidos.setInteriorMet(valores[16]);
               
              
                a.insere(dadosLidos);
               
             
            }
            
        }catch(FileNotFoundException e){
        
        }
        a.raiz(a.getT());
       
    }
    
         
}   
         
    
    
    