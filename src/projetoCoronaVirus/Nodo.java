/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoCoronaVirus;

/**
 *
 * @author junio
 */
public class Nodo {
     Dados dado;
     Nodo esq;
     Nodo dir;
     Nodo pai;
     
    public Nodo(){
        
    }
    
    public Nodo(Dados dado, Nodo pai){
        this.dado = new Dados(dado.getRegiao(),dado.getEstado(),dado.getMunicipio(),dado.getCoduf(),dado.getCodmun(),
        dado.getCodregiao(),dado.getNomeRegiao(),dado.getData(),dado.getSemanaEpi(),dado.getNumPopulacao(),dado.getCasosAcumulados(),
        dado.getCasosNovos(),dado.getObitosAcumulados(),dado.getObitosNovos(),dado.getRecuperadosNovos(),dado.getAcompanhamentoNovos(),dado.getInteriorMet());
        this.esq = null;
        this.dir = null;
        this.pai = pai;
    }


}