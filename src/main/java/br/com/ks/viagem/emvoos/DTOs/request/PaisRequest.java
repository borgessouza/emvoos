package br.com.ks.viagem.emvoos.DTOs.request;

import br.com.ks.viagem.emvoos.modelos.Pais;

import javax.validation.constraints.NotBlank;

public class PaisRequest {

    @NotBlank(message = "Nome do País deve ser obrigatório")
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pais convertToEntity() {
        return new Pais(this.nome);
    }

}
