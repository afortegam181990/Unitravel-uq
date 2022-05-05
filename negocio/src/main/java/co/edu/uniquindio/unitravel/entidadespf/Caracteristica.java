package co.edu.uniquindio.unitravel.entidadespf;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.List;

@Table(name= "caracteristica")
@Entity
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@ToString
public class Caracteristica implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column (name = "id_caracteristica")
    private Integer idCaracteristica;

    @Column(nullable = false,length = 50)
    @NotBlank
    @NonNull
    private String caracteristica;

    //@ManyToMany(mappedBy = "caracteristicas")
    @ManyToMany
    @ToString.Exclude
    private List<Hotel> hoteles;

    //@ManyToMany(mappedBy = "caracteristicas")
    @ManyToMany
    @ToString.Exclude
    private List<Habitacion> habitaciones;

    //@Column(nullable = false, length = 200)
    //private String nombre;

    //@Column(nullable = false,length = 2)
    //private String tipo;

    //public Caracteristica(String nombre, String tipo) {
       // this.nombre = nombre;
        //this.tipo = tipo;
    //}
}
