package br.com.ks.viagem.emvoos.modelos;

import br.com.ks.viagem.emvoos.DTOs.request.PaisRequest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import static javax.persistence.GenerationType.AUTO;

@Entity
public class Pais {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    @NotBlank
    private String nome;

    private Pais() {
    }
    public Pais(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
