package med.voll.api.data;

import med.voll.api.entidade.Medico;

public record DadosListagemMedico(String nome, String email, String crm, EnumEspecialidade especialidade) {

    public DadosListagemMedico(Medico medico) {
        this(medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }

}
