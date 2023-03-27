package med.vel.api.medico;

import med.vel.api.endereco.DadosEndereco;

public record DadosCadastrosMedico(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco ) {
}
