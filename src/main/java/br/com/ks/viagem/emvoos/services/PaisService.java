package br.com.ks.viagem.emvoos.services;

import br.com.ks.viagem.emvoos.DTOs.PaisDTO;

import java.util.List;

public interface PaisService {
    PaisDTO salvar(PaisDTO paisDTO);

    List<PaisDTO> pegarTodos();
}
