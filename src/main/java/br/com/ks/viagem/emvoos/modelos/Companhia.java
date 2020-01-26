package br.com.ks.viagem.emvoos.modelos;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Currency;
import java.util.Date;

import static javax.persistence.GenerationType.AUTO;

@Entity
public class Companhia {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    @NotBlank
    private String nome;

    private LocalDate dataCriacao = LocalDate.now(ZoneId.systemDefault());


    @ManyToOne
    private Pais pais;

    private Companhia() {
    }

    public Companhia(String nome) {
        this.nome = nome;
    }


    public Companhia(String nome, Pais pais) {
        this.nome = nome;
        this.pais = pais;
    }


    public String getNome() {
        return nome;
    }

    public Pais getPais() {
        return pais;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }
}
