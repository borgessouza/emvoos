package br.com.ks.viagem.emvoos.modelos;

import br.com.ks.viagem.emvoos.DTOs.PaisDTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import static javax.persistence.GenerationType.AUTO;

@Entity
public class Pais {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    @NotBlank
    private String nome;

    private String capital;

    private Long QtdPopulacao;

    private Pais() {
    }

    public Pais(String nome, String capital, Long qutPopulacao) {
        this.nome = nome;
        this.capital = capital;
        this.QtdPopulacao = qutPopulacao;
    }

    public Pais(PaisDTO paisDTO) {
        this.nome = paisDTO.getNome();
        this.capital = paisDTO.getCapital();
        this.QtdPopulacao = paisDTO.getQtdPopulacao();

    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCapital() {
        return capital;
    }

    public Long getQtdPopulacao() {
        return QtdPopulacao;
    }

}
