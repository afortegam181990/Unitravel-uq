package co.edu.uniquindio.unitravel.entidadespf;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import java.io.Serializable;
import java.util.List;

@Table(name = "hotel")
@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Hotel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer idHotel;

    @Column(nullable = false, length = 50)
    @NotBlank
    @NonNull
    private String nombre;

    @Column(nullable = false, length = 100)
    @NotBlank
    @NonNull
    private String direccion;

    @Column(nullable = false, name = "numero_estrellas")
    @Positive
    @Max(5)
    @NonNull
    private Integer estrellas;

    @OneToMany(mappedBy = "hotel")
    @ToString.Exclude
    private List<Foto> fotos;

    @OneToMany(mappedBy = "hotel")
    @ToString.Exclude
    private List<Habitacion> habitaciones;

    @OneToMany(mappedBy = "hotel")
    @ToString.Exclude
    private List<Comentario> comentarios;

    @ManyToOne
    @JoinColumn(name = "gerente_id")
    private Gerente gerente;

    @ManyToOne
    @JoinColumn(name = "ciudad_id")
    private Ciudad ciudad;

    @ManyToMany(mappedBy = "hoteles")
    @ToString.Exclude
    private List<Caracteristica> caracteristicas;

}