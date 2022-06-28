package com.dh.meli.model;

public class Livro extends Documento{

    //número de páginas, nome do autor, título e gênero
    private int numeroPaginas;
    private String autor;
    private String titulo;
    private String genero;

    public Livro(String identificacao, int numeroPaginas, String autor, String titulo, String genero) {
        super(identificacao);
        this.numeroPaginas = numeroPaginas;
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "numeroPaginas=" + numeroPaginas +
                ", autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}
