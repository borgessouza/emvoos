package br.com.ks.viagem.emvoos.DTOs.request;

import br.com.ks.viagem.emvoos.modelos.Companhia;

import javax.validation.constraints.NotBlank;

public class CompanhiaRequest {

    @NotBlank(message = "Nome não pode ser nulo")
    private String nome;

    @NotBlank
    private String pais;

    public Companhia convertToEntity() {
        return new Companhia(this.nome);
    }

    public String getNome() {
        return this.nome;
    }

    public String getPais() {
        return this.pais;
    }
}
