package br.com.ks.viagem.emvoos.DTOs.request;

import br.com.ks.viagem.emvoos.exception.ResourceNotFoundException;
import br.com.ks.viagem.emvoos.modelos.Companhia;
import br.com.ks.viagem.emvoos.modelos.Pais;
import br.com.ks.viagem.emvoos.repositories.PaisRepository;

import javax.validation.constraints.NotBlank;
import java.util.Optional;

public class CompanhiaRequest {

    @NotBlank(message = "Nome da companhia não pode ser nulo")
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

    public Companhia novaCompanhia(PaisRepository paisRepository) {
        Optional<Pais> paisCompanhia = paisRepository.findByNome(this.getPais());
        if (paisCompanhia.isPresent()) {
            return new Companhia(this.nome, paisCompanhia.get());
        } else {
            throw new ResourceNotFoundException("Pais não encontrado");
        }
    }
}
