package br.com.ks.viagem.emvoos.repositories;

import br.com.ks.viagem.emvoos.modelos.Companhia;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CompanhiaRepository extends CrudRepository<Companhia, Long> {
    Optional<Companhia> findByNome(String nome);
}
