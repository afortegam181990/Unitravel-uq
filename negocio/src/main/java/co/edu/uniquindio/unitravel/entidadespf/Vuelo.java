package co.edu.uniquindio.unitravel.entidadespf;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Table(name = "vuelo")
@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Vuelo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "id_vuelo")
    private Integer idVuelo;

    @Column(nullable = false, length = 40)
    @NotBlank
    @NonNull
    private String estado;

    @Column(nullable = false, length = 60)
    @NotBlank
    @NonNull
    private String aerolinea;

    @Future
    @Column(name = "fecha_salida")
    private LocalDateTime fechaSalida;

    @Future
    @Column(name = "fecha_llegada")
    private LocalDateTime fechaLlegada;

    @OneToMany(mappedBy = "vuelo")
    @ToString.Exclude
    private List<Silla> sillas;

    @ManyToOne
    @JoinColumn(name = "origen_id")
    private Ciudad origen;

    @ManyToOne
    @JoinColumn(name = "destino_id")
    private Ciudad destino;

}

