package br.com.ks.viagem.emvoos.controllers;

import br.com.ks.viagem.emvoos.DTOs.PaisDTO;
import br.com.ks.viagem.emvoos.services.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("api/v1/pais")
public class PaisController {

    private PaisService paisService;


    @Autowired
    public PaisController(PaisService paisService) {
        this.paisService = paisService;
    }

    @ResponseStatus(CREATED)
    @PostMapping(value = "/salvar",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public PaisDTO salvarPais(@Valid @RequestBody PaisDTO paisDTO) {
        return paisService.salvar(paisDTO);
    }


    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<PaisDTO> pegarTodosPaises() {
        return paisService.pegarTodos();

    }



}
