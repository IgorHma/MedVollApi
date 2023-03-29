package med.vel.api.medico;

import jakarta.validation.constraints.NotNull;
import med.vel.api.endereco.DadosEndereco;

public record DadosAtualizacaoMedicos(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco
) {
}
