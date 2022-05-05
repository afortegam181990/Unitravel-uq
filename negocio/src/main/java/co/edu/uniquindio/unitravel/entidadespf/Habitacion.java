package co.edu.uniquindio.unitravel.entidadespf;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Positive;
import java.io.Serializable;
import java.util.List;

@Table(name = "habitacion")
@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Habitacion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "id_habitacion")
    private Integer idHabitacion;

    @Positive
    @NonNull
    private Double precio;

    @Positive
    @NonNull
    private Integer capacidad;

    @OneToMany(mappedBy = "habitacion")
    @ToString.Exclude
    private List<Foto> fotos;

    @OneToMany(mappedBy = "habitacion")
    @ToString.Exclude
    private List<ReservaHabitacion> reservas;

    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;

    @ManyToMany(mappedBy = "habitaciones")
    @ToString.Exclude
    private List<Caracteristica> caracteristicas;

    @ManyToMany
    @ToString.Exclude
    private List<Cama> camas;
}