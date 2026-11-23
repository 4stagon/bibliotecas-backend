package desarrollo.web.bibliotecas;

import desarrollo.web.bibliotecas.entities.Biblioteca;
import desarrollo.web.bibliotecas.entities.Libro;
import desarrollo.web.bibliotecas.repository.BibliotecaRepository;
import desarrollo.web.bibliotecas.repository.LibroRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final BibliotecaRepository bibliotecaRepository;
    private final LibroRepository libroRepository;

    public DataInitializer(BibliotecaRepository bibliotecaRepository,
                           LibroRepository libroRepository) {
        this.bibliotecaRepository = bibliotecaRepository;
        this.libroRepository = libroRepository;
    }

    @Override
    public void run(String... args) {

        Biblioteca bibliotecaCentral = new Biblioteca();
        bibliotecaCentral.setNombre("Biblioteca Central");
        bibliotecaCentral.setDireccion("Carrera 7 # 20-15");
        bibliotecaCentral.setCiudad("Bogotá");

        Biblioteca bibliotecaNorte = new Biblioteca();
        bibliotecaNorte.setNombre("Biblioteca Norte");
        bibliotecaNorte.setDireccion("Calle 127 # 15-30");
        bibliotecaNorte.setCiudad("Bogotá");

        bibliotecaRepository.save(bibliotecaCentral);
        bibliotecaRepository.save(bibliotecaNorte);

        Libro libro1 = new Libro();
        libro1.setTitulo("Cien años de soledad");
        libro1.setAutor("Gabriel García Márquez");
        libro1.setAnioPublicacion(1967);
        libro1.setBiblioteca(bibliotecaCentral);

        Libro libro2 = new Libro();
        libro2.setTitulo("El coronel no tiene quien le escriba");
        libro2.setAutor("Gabriel García Márquez");
        libro2.setAnioPublicacion(1961);
        libro2.setBiblioteca(bibliotecaNorte);

        libroRepository.save(libro1);
        libroRepository.save(libro2);
    }
}