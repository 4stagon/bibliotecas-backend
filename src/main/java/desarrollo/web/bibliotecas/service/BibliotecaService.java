package desarrollo.web.bibliotecas.service;

import desarrollo.web.bibliotecas.entities.Biblioteca;
import desarrollo.web.bibliotecas.repository.BibliotecaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BibliotecaService {

    private final BibliotecaRepository bibliotecaRepository;

    public BibliotecaService(BibliotecaRepository bibliotecaRepository) {
        this.bibliotecaRepository = bibliotecaRepository;
    }

    public Biblioteca registrar(Biblioteca biblioteca) {
        return bibliotecaRepository.save(biblioteca);
    }

    public List<Biblioteca> listar() {
        return bibliotecaRepository.findAll();
    }
}