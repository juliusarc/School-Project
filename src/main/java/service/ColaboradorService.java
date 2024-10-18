package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Colaborador;
import repository.ColaboradorRepository;

@Service
public class ColaboradorService {

    @Autowired
    private ColaboradorRepository colaboradorRepository;

    public List<Colaborador> listarTodos() {
        return colaboradorRepository.findAll();
    }

    public Colaborador salvar(Colaborador colaborador) {
        return colaboradorRepository.save(colaborador);
    }

    public Colaborador buscarPorCpf(String cpf) {
        return colaboradorRepository.findById(cpf).orElse(null);
    }

    public void deletar(String cpf) {
        colaboradorRepository.deleteById(cpf);
    }
}