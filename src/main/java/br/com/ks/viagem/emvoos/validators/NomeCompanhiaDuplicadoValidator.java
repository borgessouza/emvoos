package br.com.ks.viagem.emvoos.validators;

import br.com.ks.viagem.emvoos.DTOs.request.CompanhiaRequest;
import br.com.ks.viagem.emvoos.modelos.Companhia;
import br.com.ks.viagem.emvoos.repositories.CompanhiaRepository;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.Optional;

public class NomeCompanhiaDuplicadoValidator implements Validator {

    private CompanhiaRepository companhiaRepository;

    public NomeCompanhiaDuplicadoValidator(CompanhiaRepository companhiaRepository) {
        this.companhiaRepository = companhiaRepository;

    }

    @Override
    public boolean supports(Class<?> aClass) {
        return CompanhiaRequest.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object object, Errors errors) {
        CompanhiaRequest request = (CompanhiaRequest) object;
        Optional<Companhia> possivelCompanhia = companhiaRepository.findByNome(request.getNome());
        if (possivelCompanhia.isPresent()) {
            errors.rejectValue("nome", null, "Companhia com o mesmo nome já existe");
        }


    }
}
