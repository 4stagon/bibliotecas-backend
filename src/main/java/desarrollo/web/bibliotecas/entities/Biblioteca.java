package desarrollo.web.bibliotecas.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "bibliotecas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Biblioteca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String direccion;

    private String ciudad;

    @OneToMany(mappedBy = "biblioteca", cascade = CascadeType.ALL)
    private List<Libro> libros = new ArrayList<>();
}