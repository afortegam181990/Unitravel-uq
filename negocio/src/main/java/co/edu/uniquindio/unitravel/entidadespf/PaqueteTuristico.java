package co.edu.uniquindio.unitravel.entidadespf;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Positive;
import java.io.Serializable;
import java.util.List;

@Table(name = "paquete_turistico")
@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class PaqueteTuristico implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer idPaquete;

    @Positive
    @NonNull
    private Double totalPaquete;

    @OneToMany(mappedBy = "paquete")
    @ToString.Exclude
    private List<ReservaPaquete> paquetes;

    @ManyToOne
    @JoinColumn(name = "guia_id")
    private Guia guia;

    @ManyToMany(mappedBy = "paquetes")
    @ToString.Exclude
    private List<Lugar> lugares;

    @ManyToMany(mappedBy = "paquetes")
    @ToString.Exclude
    private List<Horario> horarios;
}