package br.com.ks.viagem.emvoos.DTOs.request;

import br.com.ks.viagem.emvoos.modelos.Pais;

import javax.validation.constraints.NotBlank;

public class PaisRequest {

    @NotBlank(message = "Nome nao pode esta vazio")
    private String nome;

    public Pais convertToEntity() {
        return new Pais(this.nome);
    }

}
