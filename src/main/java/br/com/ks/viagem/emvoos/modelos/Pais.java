package br.com.ks.viagem.emvoos.modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;

import static javax.persistence.GenerationType.AUTO;

@Entity
public class Pais {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    @NotBlank(message = "Nome não pode ser nulo")
    private String nome;

    @NotBlank(message = "Capital não pode ser nulo")
    @Size(max = 255, message = "Tamanho não permitido")
    private String capital;

    private Long QqtdPopulacao;

    private Pais() {
    }

    public Pais(String nome, String capital, Long qutPopulacao) {
        this.nome = nome;
        this.capital = capital;
        this.QqtdPopulacao = qutPopulacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public Long getQqtdPopulacao() {
        return QqtdPopulacao;
    }

    public void setQqtdPopulacao(Long qqtdPopulacao) {
        QqtdPopulacao = qqtdPopulacao;
    }
}
