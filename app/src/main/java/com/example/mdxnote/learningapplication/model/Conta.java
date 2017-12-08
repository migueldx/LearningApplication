package com.example.mdxnote.learningapplication.model;

import java.io.Serializable;

/**
 * Created by MDXNOTE on 08/12/2017.
 */

public class Conta implements Serializable {
    private String descricao;
    private String valor;

    public String getDescricao() {
        return descricao;
    }

    public String getValor() {
        return valor;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return descricao + ": " + valor;
    }
}
