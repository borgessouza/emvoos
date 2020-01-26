package br.com.ks.viagem.emvoos.DTOs.response;

import br.com.ks.viagem.emvoos.modelos.Pais;

public class PaisResponse {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public PaisResponse(Pais pais) {
        this.nome = pais.getNome();
    }

}
