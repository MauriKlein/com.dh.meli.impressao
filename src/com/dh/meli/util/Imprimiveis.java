package com.dh.meli.util;

import com.dh.meli.model.Documento;

public interface Imprimiveis{

    public static void imprimirDocumento(Documento documento){
        System.out.println(documento.toString());
    }

}
