package med.vel.api.paciente;

import jakarta.validation.Valid;
import med.vel.api.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco
) {
}