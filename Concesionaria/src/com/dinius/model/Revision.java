package com.dinius.model;

public class Revision {
    //PK
    private String codigo;
    private String filtros;
    private String aceite;
    private String frenos;
    //FK
    private String coche;

    public Revision(){

    }

    public Revision(String codigo, String filtros, String aceite, String frenos, String coche) {
        this.codigo = codigo;
        this.filtros = filtros;
        this.aceite = aceite;
        this.frenos = frenos;
        this.coche = coche;
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFiltros() {
        return filtros;
    }

    public void setFiltros(String filtros) {
        this.filtros = filtros;
    }

    public String getAceite() {
        return aceite;
    }

    public void setAceite(String aceite) {
        this.aceite = aceite;
    }

    public String getFrenos() {
        return frenos;
    }

    public void setFrenos(String frenos) {
        this.frenos = frenos;
    }

    public String getCoche() {
        return coche;
    }

    public void setCoche(String coche) {
        this.coche = coche;
    }

    @Override
    public String toString() {
        return "Revision{" +
                "codigo='" + codigo + '\'' +
                ", filtros='" + filtros + '\'' +
                ", aceite='" + aceite + '\'' +
                ", frenos='" + frenos + '\'' +
                ", coche=" + coche +
                '}';
    }
}
