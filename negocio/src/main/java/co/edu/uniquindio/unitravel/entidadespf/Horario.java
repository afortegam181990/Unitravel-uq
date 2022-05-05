package co.edu.uniquindio.unitravel.entidadespf;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.time.LocalTime;
import java.util.List;

@Table(name = "horario")
@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Horario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer idHorario;

    @Column(nullable = false, length = 10)
    @NotBlank
    @NonNull
    private String dia;

    @Column(name = "hora_inicio", columnDefinition = "TIME")
    private LocalTime horaInicio;

    @Column(name = "hora_fin", columnDefinition = "TIME")
    private LocalTime horaFin;

    @ManyToMany
    @ToString.Exclude
    private List<PaqueteTuristico> paquetes;
}