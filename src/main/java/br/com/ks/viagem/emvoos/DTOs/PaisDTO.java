package br.com.ks.viagem.emvoos.DTOs;

import br.com.ks.viagem.emvoos.modelos.Pais;

public class PaisDTO {


    @
    private Long idPais;
    private String nome;
    private String capital;
    private Long qtdPopulacao;

    private PaisDTO() {
    }

    public PaisDTO(Pais pais) {
        this.idPais = pais.getId();
        this.nome = pais.getNome();
        this.capital = pais.getCapital();
        this.qtdPopulacao = pais.getQqtdPopulacao();
    }

    public Long getIdPais() {
        return idPais;
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
