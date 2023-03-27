package med.vel.api.controller;

import med.vel.api.medico.DadosCadastrosMedico;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("medicos")
public class MedicoController {
    @PostMapping
    public void cadastrarMedicos(@RequestBody DadosCadastrosMedico dados){
        System.out.println(dados);
    }
}
