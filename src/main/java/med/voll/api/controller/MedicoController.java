package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.data.DadosCadastroMedico;
import med.voll.api.data.DadosListagemMedico;
import med.voll.api.entidade.Medico;
import med.voll.api.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("medicos")
public class MedicoController {
    @Autowired
    private MedicoRepository medicoRepository;
    @PostMapping
    @Transactional
    public void cadastrarMedico(@RequestBody @Valid DadosCadastroMedico dados) {
        medicoRepository.save(new Medico(dados));
    }

    @GetMapping
    public List<DadosListagemMedico> listagem() {
        return medicoRepository.findAll().stream().map(DadosListagemMedico::new).toList();
    }
}
