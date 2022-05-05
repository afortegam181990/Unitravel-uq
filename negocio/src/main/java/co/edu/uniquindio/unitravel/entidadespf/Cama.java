package co.edu.uniquindio.unitravel.entidadespf;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Table(name = "cama")
@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Cama implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "id_cama")
    private Integer idCama;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    @NonNull
    private TipoCama tipoCama;

    @ManyToMany(mappedBy = "camas")
    @ToString.Exclude
    private List<Habitacion> habitaciones;
}
