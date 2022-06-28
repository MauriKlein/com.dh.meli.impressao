package com.dh.meli.model;

import java.util.List;

public class Curriculo extends Documento {

    private Pessoa pessoa;
    List<Habilidade> habilidadeList;

    public Curriculo(String identificacao, Pessoa pessoa, List<Habilidade> habilidadeList) {
        super(identificacao);
        this.pessoa = pessoa;
        this.habilidadeList = habilidadeList;
    }

    @Override
    public String toString() {
        return "Curriculo{" +
                "pessoa=" + pessoa +
                ", habilidadeList=" + habilidadeList +
                '}';
    }


}
