package desarrollo.web.bibliotecas.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "libros")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String autor;

    @Column(name = "anio_publicacion")
    private Integer anioPublicacion;

    @ManyToOne
    @JoinColumn(name = "biblioteca_id", nullable = false)
    @JsonIgnore
    private Biblioteca biblioteca;
}