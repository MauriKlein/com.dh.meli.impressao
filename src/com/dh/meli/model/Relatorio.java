package com.dh.meli.model;

public class Relatorio extends Documento{

    private String texto;
    private int numeroPaginas;
    private String autor;
    private String revisor;

    public Relatorio(String identificacao, String texto, int numeroPaginas, String autor, String revisor) {
        super(identificacao);
        this.texto = texto;
        this.numeroPaginas = numeroPaginas;
        this.autor = autor;
        this.revisor = revisor;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getRevisor() {
        return revisor;
    }

    public void setRevisor(String revisor) {
        this.revisor = revisor;
    }

    @Override
    public String toString() {
        return "Relatorio{" +
                "texto='" + texto + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                ", autor='" + autor + '\'' +
                ", revisor='" + revisor + '\'' +
                '}';
    }
}
