package com.example.qi.exconsumindojson;

/**
 * Created by QI on 21/12/2017.
 */

public class Cep {
    private String cep;
    private String logradouro;
    private String bairro;
    private String complemento;
    private String localidade;
    private String uf;
    private String unidade;
    private String ibge;
    private String gis;

    public Cep() {
    }

    public Cep(String cep, String logradouro, String bairro, String complemento, String localidade, String uf, String unidade, String ibge, String gis) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.complemento = complemento;
        this.localidade = localidade;
        this.uf = uf;
        this.unidade = unidade;
        this.ibge = ibge;
        this.gis = gis;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getIbge() {
        return ibge;
    }

    public void setIbge(String ibge) {
        this.ibge = ibge;
    }

    public String getGis() {
        return gis;
    }

    public void setGis(String gis) {
        this.gis = gis;
    }

    @Override
    public String toString() {
        return "Cep{" +
                "cep='" + cep + '\'' +
                ", logradouro='" + logradouro +
                ", bairro='" + bairro +
                ", complemento='" + complemento +
                ", localidade='" + localidade  +
                ", uf='" + uf +
                ", unidade='" + unidade +
                ", ibge='" + ibge +
                ", gis='" + gis +
                '}';
    }
}
