package desarrollo.web.bibliotecas.controller;

import desarrollo.web.bibliotecas.entities.Biblioteca;
import desarrollo.web.bibliotecas.service.BibliotecaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bibliotecas")
@CrossOrigin(origins = "http://localhost:4200")
public class BibliotecaController {

    private final BibliotecaService bibliotecaService;

    public BibliotecaController(BibliotecaService bibliotecaService) {
        this.bibliotecaService = bibliotecaService;
    }

    @PostMapping
    public Biblioteca registrar(@RequestBody Biblioteca biblioteca) {
        return bibliotecaService.registrar(biblioteca);
    }

    @GetMapping
    public List<Biblioteca> listar() {
        return bibliotecaService.listar();
    }
}