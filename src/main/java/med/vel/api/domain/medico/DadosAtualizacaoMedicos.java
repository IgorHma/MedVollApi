package med.vel.api.domain.medico;

import jakarta.validation.constraints.NotNull;
import med.vel.api.domain.endereco.DadosEndereco;

public record DadosAtualizacaoMedicos(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco
) {
}
