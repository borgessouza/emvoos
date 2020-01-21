package br.com.ks.viagem.emvoos.services.Impl;

import br.com.ks.viagem.emvoos.DTOs.PaisDTO;
import br.com.ks.viagem.emvoos.modelos.Pais;
import br.com.ks.viagem.emvoos.repositories.PaisRepository;
import br.com.ks.viagem.emvoos.services.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PaisServiceImpl implements PaisService {

    private PaisRepository paisRepository;

    @Autowired
    public PaisServiceImpl(PaisRepository paisRepository) {
        this.paisRepository = paisRepository;
    }

    @Override
    public PaisDTO salvar(PaisDTO paisDTO) {
        Pais pais = paisRepository.save(new Pais(paisDTO.getNome(),
                paisDTO.getCapital(),
                paisDTO.getQtdPopulacao()));

        return new PaisDTO(pais);
    }

    @Override
    public List<PaisDTO> pegarTodos() {
        return paisRepository.findAll()
                .stream()
                .map(PaisDTO::new)
                .collect(Collectors.toList());
    }
}
