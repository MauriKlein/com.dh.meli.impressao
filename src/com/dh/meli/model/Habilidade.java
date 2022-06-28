package com.dh.meli.model;

public class Habilidade {
    private String descricao;

    public Habilidade(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Habilidades{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}
