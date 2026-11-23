package desarrollo.web.bibliotecas.repository;

import desarrollo.web.bibliotecas.entities.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Long> {
}