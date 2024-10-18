package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Colaborador;
import service.ColaboradorService;

@RestController
@RequestMapping("/colaboradores")
public class ColaboradorController {

    @Autowired
    private ColaboradorService colaboradorService;

    @GetMapping
    public List<Colaborador> listarColaboradores() {
        return colaboradorService.listarTodos();
    }

    @PostMapping
    public Colaborador salvarColaborador(@RequestBody Colaborador colaborador) {
        return colaboradorService.salvar(colaborador);
    }

    @GetMapping("/{cpf}")
    public Colaborador buscarPorCpf(@PathVariable String cpf) {
        return colaboradorService.buscarPorCpf(cpf);
    }

    @DeleteMapping("/{cpf}")
    public void deletarColaborador(@PathVariable String cpf) {
        colaboradorService.deletar(cpf);
    }
}