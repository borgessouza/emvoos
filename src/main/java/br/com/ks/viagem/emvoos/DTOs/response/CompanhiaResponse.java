package br.com.ks.viagem.emvoos.DTOs.response;

import br.com.ks.viagem.emvoos.modelos.Companhia;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public class CompanhiaResponse {

    private String nome;
    private PaisResponse pais;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate dataCriacao;

    public CompanhiaResponse(Companhia companhia) {
        this.nome = companhia.getNome();
        this.pais = new PaisResponse(companhia.getPais());
        this.dataCriacao = companhia.getDataCriacao();
    }

    public String getNome() {
        return nome;
    }

    public PaisResponse getPais() {
        return pais;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

 }
