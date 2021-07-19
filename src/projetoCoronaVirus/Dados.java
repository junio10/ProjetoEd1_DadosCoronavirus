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
public class Dados{
    String regiao;
    String estado;
    String municipio;
    int coduf;
    int codmun;
    int codregiao;
    String nomeRegiao;
    Date data;
    String semanaEpi;
    String numPopulacao;
    String casosAcumulados;
    String casosNovos;
    String ObitosAcumulados;
    String ObitosNovos;
    String RecuperadosNovos;
    String AcompanhamentoNovos;
    String interiorMet;

    @Override
    public String toString() {
        return "Dados{" + "regiao=" + regiao + ", estado=" + estado + ", municipio=" + municipio + ", coduf=" + coduf + ", codmun=" + codmun + ", codregiao=" + codregiao + ", nomeRegiao=" + nomeRegiao + ", data=" + data + ", semanaEpi=" + semanaEpi + ", numPopulacao=" + numPopulacao + ", casosAcumulados=" + casosAcumulados + ", casosNovos=" + casosNovos + ", ObitosAcumulados=" + ObitosAcumulados + ", ObitosNovos=" + ObitosNovos + ", RecuperadosNovos=" + RecuperadosNovos + ", AcompanhamentoNovos=" + AcompanhamentoNovos + ", interiorMet=" + interiorMet + '}';
    }
    public Dados(int codMun, Date data){
          this.codmun = codMun;
          this.data = data;
    }

    public Dados(String regiao, String estado, String municipio, int coduf, int codmun, int codregiao, String nomeRegiao, Date data, String semanaEpi, String numPopulacao, String casosAcumulados, String casosNovos, String ObitosAcumulados, String ObitosNovos, String RecuperadosNovos, String AcompanhamentoNovos, String interiorMet) {
        this.regiao = regiao;
        this.estado = estado;
        this.municipio = municipio;
        this.coduf = coduf;
        this.codmun = codmun;
        this.codregiao = codregiao;
        this.nomeRegiao = nomeRegiao;
        this.data = data;
        this.semanaEpi = semanaEpi;
        this.numPopulacao = numPopulacao;
        this.casosAcumulados = casosAcumulados;
        this.casosNovos = casosNovos;
        this.ObitosAcumulados = ObitosAcumulados;
        this.ObitosNovos = ObitosNovos;
        this.RecuperadosNovos = RecuperadosNovos;
        this.AcompanhamentoNovos = AcompanhamentoNovos;
        this.interiorMet = interiorMet;
    }
    
    public Dados(){
        
    }
    
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

     public int getCoduf() {
        return coduf;
    }

    public void setCoduf(int coduf) {
        this.coduf = coduf;
    }

    public int getCodmun() {
        return codmun;
    }

    public void setCodmun(int codmun) {
        this.codmun = codmun;
    }

    public int getCodregiao() {
        return codregiao;
    }

    public void setCodregiao(int codregiao) {
        this.codregiao = codregiao;
    }
    
    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

   

    public String getNomeRegiao() {
        return nomeRegiao;
    }

    public void setNomeRegiao(String nomeRegiao) {
        this.nomeRegiao = nomeRegiao;
    }

    

    public String getSemanaEpi() {
        return semanaEpi;
    }

    public void setSemanaEpi(String semanaEpi) {
        this.semanaEpi = semanaEpi;
    }

    public String getNumPopulacao() {
        return numPopulacao;
    }

    public void setNumPopulacao(String numPopulacao) {
        this.numPopulacao = numPopulacao;
    }

    public String getCasosAcumulados() {
        return casosAcumulados;
    }

    public void setCasosAcumulados(String casosAcumulados) {
        this.casosAcumulados = casosAcumulados;
    }

    public String getCasosNovos() {
        return casosNovos;
    }

    public void setCasosNovos(String casosNovos) {
        this.casosNovos = casosNovos;
    }

    public String getObitosAcumulados() {
        return ObitosAcumulados;
    }

    public void setObitosAcumulados(String ObitosAcumulados) {
        this.ObitosAcumulados = ObitosAcumulados;
    }

    public String getObitosNovos() {
        return ObitosNovos;
    }

    public void setObitosNovos(String ObitosNovos) {
        this.ObitosNovos = ObitosNovos;
    }

    public String getRecuperadosNovos() {
        return RecuperadosNovos;
    }

    public void setRecuperadosNovos(String RecuperadosNovos) {
        this.RecuperadosNovos = RecuperadosNovos;
    }

    public String getAcompanhamentoNovos() {
        return AcompanhamentoNovos;
    }

    public void setAcompanhamentoNovos(String AcompanhamentoNovos) {
        this.AcompanhamentoNovos = AcompanhamentoNovos;
    }

    public String getInteriorMet() {
        return interiorMet;
    }

    public void setInteriorMet(String interiorMet) {
        this.interiorMet = interiorMet;
    }
    
    

    
    
    
}
