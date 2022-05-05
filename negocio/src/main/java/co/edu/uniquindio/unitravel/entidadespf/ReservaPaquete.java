package co.edu.uniquindio.unitravel.entidadespf;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Positive;
import java.io.Serializable;

@Table(name = "reserva_paquete")
@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ReservaPaquete implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "id_reserva_paquete")
    private Integer idReservaPaquete;

    @Positive
    @NonNull
    private Double subTotal;

    @ManyToOne
    @JoinColumn(name = "reserva_id")
    private Reserva reserva;

    @ManyToOne
    @JoinColumn(name = "paquete_id")
    private PaqueteTuristico paquete;
}
