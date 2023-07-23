package med.vel.api.domain.paciente;

import jakarta.validation.Valid;
import med.vel.api.domain.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco
) {
}