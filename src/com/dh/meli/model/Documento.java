package com.dh.meli.model;

public abstract class Documento {
    private String identificacao;

    public Documento(String identificacao) {
        this.identificacao = identificacao;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "identificacao='" + identificacao + '\'' +
                '}';
    }
}
