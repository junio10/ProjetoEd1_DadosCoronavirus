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
               System.out.println(t.dado.getCoduf()+" "+t.dado.getCasosNovos()+" "+t.dado.getData()+" " +t.dado.getEstado()+" "+t.dado.getNomeRegiao());
               InOrdem(t.dir);
           }
       }
       public void Inserebin(Dados []dados, int comeco, int fim){
           t = Inserebin(t,dados, comeco, fim);
       }
       public Nodo Inserebin(Nodo t,Dados []dados, int comeco, int fim){
            int meio;
            meio = (comeco+fim)/2;
            if(comeco > fim){
                return null;
            }
              t = new Nodo(dados[meio]);
            
            
              t.esq = Inserebin(t.esq, dados,comeco,meio-1);
              t.dir = Inserebin(t.dir, dados,meio+1,fim);
              
              return t;
       }
       
       public void insere(Dados dado){
           //brasil e estado, lado esquerdo  
             t = insere(dado,t,null);
       }
      
       public Nodo insere(Dados dado, Nodo t, Nodo pai){
           if(t == null){
               t = new Nodo(dado, pai);
           }else{
                if(dado.getMunicipio().equals("") && dado.getCodmun() == 0){
                   if(dado.getCoduf() > t.dado.getCoduf()){
                    t.dir = insere(dado,t.dir, pai);
                   }else if(dado.getCoduf() < t.dado.getCoduf()){
                    t.esq = insere(dado,t.esq, pai);        
                   }else{
                     if (dado.getData().after(t.dado.getData())){
                          t.dado = dado;
                          return t;
                     }
                    } 
                }else if(!dado.getMunicipio().equals("") && dado.getCodmun()!= 0){
                    if(dado.getCodmun() < t.dado.getCodmun()){
                    t.esq = insere(dado, t.esq, pai);
                    }else if(dado.getCodmun() > t.dado.getCodmun()){
                    t.dir=  insere(dado, t.dir, pai);
                    //caso o id codmun for igual
                    }else{
                        if(dado.getData().before(t.dado.getData())){
                          t.esq= insere(dado, t.esq, pai);
                        }else{
                          t.dir= insere(dado, t.dir, pai);
                        }
                    }
                   
               }
               }
             return t;
       
           }
           
       
       public Nodo pesquisa(Dados aux){
              t = Pesquisa(aux, t);
              return t;
       }
       public Nodo Pesquisa(Dados aux, Nodo t){
              if(t == null){
                  return t;
              }
              
              if(aux.getCodmun() < t.dado.getCodmun()){
                t = Pesquisa(aux,t.esq);
              }
              if(aux.getCodmun() > t.dado.getCodmun()){
                t = Pesquisa(aux,t.dir);
              }
              if(aux.getCodmun() == t.dado.getCodmun()){
                  if(t.dado.getData().equals(aux.getData())){
                      return t;
                  }
                  else if(aux.getData().before(t.dado.getData()) == true){
                   //dataMenor
                    t = Pesquisa(aux,t.esq);
                  }else{
                   //data maior
                    t = Pesquisa(aux,t.dir);
                   }
                  
              }
               return t;
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
    

