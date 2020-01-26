package br.com.ks.viagem.emvoos.repositories;

import br.com.ks.viagem.emvoos.modelos.Pais;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PaisRepository extends JpaRepository<Pais, Long> {

    Optional<Pais> findByNome(String nome);
}
