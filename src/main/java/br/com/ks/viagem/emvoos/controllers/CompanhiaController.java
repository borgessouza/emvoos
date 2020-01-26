package br.com.ks.viagem.emvoos.controllers;


import br.com.ks.viagem.emvoos.DTOs.request.CompanhiaRequest;
import br.com.ks.viagem.emvoos.DTOs.response.CompanhiaResponse;
import br.com.ks.viagem.emvoos.modelos.Companhia;
import br.com.ks.viagem.emvoos.repositories.CompanhiaRepository;
import br.com.ks.viagem.emvoos.repositories.PaisRepository;
import br.com.ks.viagem.emvoos.validators.NomeCompanhiaDuplicadoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("api/v1/companhia/")
public class CompanhiaController {

    private CompanhiaRepository companhiaRepository;
    private PaisRepository paisRepository;

    @Autowired
    public CompanhiaController(CompanhiaRepository companhiaRepository, PaisRepository paisRepository) {
        this.companhiaRepository = companhiaRepository;
        this.paisRepository = paisRepository;
    }

    @InitBinder("companhiaRequest")
    public void init(WebDataBinder dataBinder) {
        dataBinder.addValidators(new NomeCompanhiaDuplicadoValidator(companhiaRepository));
    }

    @ResponseStatus(CREATED)
    @PostMapping("salvar")
    public CompanhiaResponse salvarNovaCompanhia(@Valid @RequestBody CompanhiaRequest companhiaRequest) {
        Companhia novaCompanhia = companhiaRequest.novaCompanhia(paisRepository);
        novaCompanhia = companhiaRepository.save(novaCompanhia);
        return new CompanhiaResponse(novaCompanhia);
    }
}
