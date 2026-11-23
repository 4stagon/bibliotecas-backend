package desarrollo.web.bibliotecas.repository;

import desarrollo.web.bibliotecas.entities.Biblioteca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BibliotecaRepository extends JpaRepository<Biblioteca, Long> {
}