package co.edu.uniquindio.unitravel.entidadespf;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Future;
import javax.validation.constraints.Min;
import javax.validation.constraints.Positive;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Table(name = "reserva")
@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Reserva implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "id_reserva")
    private Integer idReserva;

    @Column(name = "fecha_reserva", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime fechaReserva;

    @Future
    @Column(name = "fecha_inicio")
    private LocalDateTime fechaInicio;

    @Future
    @Column(name = "fecha_fin")
    private LocalDateTime fechaFin;

    @Positive
    @NonNull
    private Double total;

    @Column(name = "numero_personas", nullable = false)
    @NonNull
    @Min(value = 1)
    private Integer numeroPersonas;

    @OneToMany(mappedBy = "reserva")
    @ToString.Exclude
    private List<ReservaSilla> sillas;

    @OneToMany(mappedBy = "reserva")
    @ToString.Exclude
    private List<ReservaHabitacion> habitaciones;

    @OneToMany(mappedBy = "reserva")
    @ToString.Exclude
    private List<ReservaPaquete> paquetes;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
}