package br.com.ks.viagem.emvoos.DTOs;

import br.com.ks.viagem.emvoos.modelos.Pais;

import javax.validation.constraints.NotBlank;

public class PaisDTO {

    @NotBlank(message = "Nome não pode ser vazio")
    private String nome;
    private String capital;
    private Long qtdPopulacao;

    private PaisDTO() {
    }

    public PaisDTO(Pais pais) {
        this.nome = pais.getNome();
        this.capital = pais.getCapital();
        this.qtdPopulacao = pais.getQtdPopulacao();
    }
    public String getNome() {
        return nome;
    }

    public String getCapital() {
        return capital;
    }

    public Long getQtdPopulacao() {
        return qtdPopulacao;
    }

}
