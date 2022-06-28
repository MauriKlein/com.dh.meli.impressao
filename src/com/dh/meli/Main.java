package com.dh.meli;

import com.dh.meli.model.*;
import com.dh.meli.util.Imprimiveis;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Mauri", 41);
        Habilidade habilidade1 = new Habilidade("Professor de Java");
        Habilidade habilidade2 = new Habilidade("Coordenador");
        List<Habilidade> habilidadeList = new ArrayList<>();
        habilidadeList.add(habilidade1);
        habilidadeList.add(habilidade2);

        Curriculo curriculo =new Curriculo("DOC123",pessoa, habilidadeList);
        Imprimiveis.imprimirDocumento(curriculo);

        Livro livro =new Livro("LIV123", 523, "Bruno Klein", "OBMEP - Exercícios", "Estudo");
        Imprimiveis.imprimirDocumento(livro);

        Relatorio relatorio = new Relatorio("REL123", "Os Bootcampers da Wave 6...", 12, "Mauri", "Emerson");
        Imprimiveis.imprimirDocumento(relatorio);






    }
}
