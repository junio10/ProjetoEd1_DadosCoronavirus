/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoCoronaVirus;

import java.util.Date;

/**
 *
 * @author junio
 */
public class Arvore1 {
       public Nodo t;
     
       
       
       public void raiz(Nodo t){
           System.out.println("raiz:"+t.pai);
           System.out.println("dado:"+t.dado.getCasosNovos() +" chave:"+ t.dado.getData());
       }
       /*
       public void PreOrdem(Nodo t){
          if(t != null){
              System.out.print(t.dado.getChave()+" ");
              PreOrdem(t.esq);
              PreOrdem(t.dir);
          } 
       }
      */
       public void InOrdem(Nodo t){
           if(t != null){
               InOrdem(t.esq);
               System.out.println(t.dado.getCasosNovos()+" "+t.dado.getData());
               InOrdem(t.dir);
           }
       }
       public void InserePrincipal(Dados dado){
           t = insere(dado);
       }

       public Nodo insere(Dados dado){
           //brasil e estado, lado esquerdo
           if(dado.getCodregiao() == 0 && dado.getCodmun() == 0){
             t.esq = InsereEstados(dado, t.esq,null);
           }else{
               //municipios
             t.esq = insere(dado, t.dir, null); 
           }
          return t;
       }
       
       public Nodo InsereEstados(Dados dado,Nodo t, Nodo pai){
            if(t == null){
               t = new Nodo(dado, pai);
            }else{
                 pai =t;
                 if(dado.getCoduf() < t.dado.getCoduf()){
                   t.esq = insere(dado,t.esq , pai);  
                 }else if(dado.getCoduf() > t.dado.getCoduf()){
                   t.dir = insere(dado, t.esq,pai);  
                 }else if(dado.getCoduf() == t.dado.getCoduf()){
                   if(dado.getData().after(t.dado.getData())== true){
                       t.dado.setData(dado.getData());
                       return t;
                   }
                   return t;
                 }
                 
            }
             return t;
       }
       public Nodo insere(Dados dado, Nodo t, Nodo pai){
           if(t == null){
               t = new Nodo(dado, pai);
           }else{
            pai = t;

           if(dado.getCodmun() < t.dado.getCodmun()){
                t.esq = insere(dado,t.esq , pai);
           }else if(dado.getCodmun() > t.dado.getCodmun()){
               t.dir =insere(dado, t.dir, pai);
           }else if(dado.getCodmun() == t.dado.getCodmun()){
               //comparacao das datas duas condicoes, se for maior 
               if(dado.getData().before(t.dado.getData()) == true){
                   //dataMenor
                  t.esq = insere(dado, t.esq, pai); 
               }else{
                   //data maior
                  t.dir = insere(dado, t.dir, pai);
               }
             
               
           }
           }
       
           
           return t;
           
       }
       public void pesquisa(int codMun, Date data){
              Pesquisa(codMun,data, t);
       }
       public void Pesquisa(int codMun,Date dataNot , Nodo t){
              if(t == null){
                  System.out.println("no nao enocntrado");
              }
              
              if(codMun < t.dado.getCodmun()){
                Pesquisa(codMun,dataNot,t.esq);
              }else if(codMun > t.dado.getCodmun()){
                Pesquisa(codMun,dataNot,t.dir);
              }
              else if(codMun == t.dado.getCodmun()){
                  if(t.dado.getData().before(dataNot) == true){
                   //dataMenor
                   Pesquisa(codMun,dataNot,t.esq);
                   if(t.dado.getData().equals(dataNot)){
                       System.out.println(t.dado.getCasosNovos());
                   }
                   }else{
                   //data maior
                    Pesquisa(codMun,dataNot,t.dir);
                   }
                  
              }
              
            
              
       }
       /*
       public void Remover(int chave, Nodo t){
           if(t == null){
               System.out.println("Nao contem elementos");
           }else{
               if(chave == t.dado.getChave()){
                   //1 caso, no folha
                   if(t.esq == null && t.dir == null){
                       if(t.pai == null){
                           this.t = null;
                       }else{
                           if(chave < t.pai.dado.getChave()){
                              t.pai.esq = null;
                           }else{
                               t.pai.dir = null;
                           }
                       }
                   }else{
                    //2 caso, o no tem um filho
                   if(t.esq != null && t.dir == null){
                       if(t.pai != null){
                          t.pai.esq = t.esq;
                          t.esq.pai = t.pai;
                       }else{
                       //fazer a condicao para o pai ser null
                        this.t = t.esq;
                        this.t.pai = null;
                       }
                   }else if(t.dir != null && t.esq == null){
                        if(t.pai != null){
                          t.pai.dir = t.dir;
                          t.dir.pai = t.pai;
                        //fazer a condicao para o pai ser null
                       }else{
                         this.t = t.esq;
                         this.t.pai = null;
                       }
                   }else{
                       //caso no tem 2 filhos
                       Nodo aux = new Nodo();
                       
                       aux = t.esq;
                       Dados e = t.dado;
                       while(aux.dir != null){
                           aux = aux.dir;
                       }
                       
                       t.dado = aux.dado;
                       aux.dado = e;
                       Remover(aux.dado.getChave(), aux); 
                       
                   }
                }
               }else if(chave < t.dado.getChave()){
                   Remover(chave, t.esq);
               }else if(chave >t.dado.getChave()){
                   Remover(chave, t.dir);
               }
             
           }
       }
       */
      
    public Arvore1(){
        
    }    

    public Nodo getT() {
        return t;
    }

    public void setT(Nodo t) {
        this.t = t;
    }
     
        
    }
    

