package med.vel.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.vel.api.medico.DadosCadastrosMedico;
import med.vel.api.medico.Medico;
import med.vel.api.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("medicos")
public class MedicoController {
    @Autowired
    private MedicoRepository repository;
    @PostMapping
    @Transactional
    public void cadastrarMedicos(@RequestBody @Valid DadosCadastrosMedico dados){
        System.out.println(dados);
        repository.save(new Medico(dados));
    }
}
