package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Livro;
import repository.LivroRepository;
import java.util.List;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    public List<Livro> listarTodos() {
        return livroRepository.findAll();
    }

    public Livro salvar(Livro livro) {
        return livroRepository.save(livro);
    }

    public Livro buscarPorId(String isbn) {
        return livroRepository.findById(isbn).orElse(null);
    }

    public void deletar(String isbn) {
        livroRepository.deleteById(isbn);
    }
}