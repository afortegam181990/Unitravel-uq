package co.edu.uniquindio.unitravel.entidadespf;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import java.io.Serializable;
import java.util.List;

@Table(name = "silla")
@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Silla implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "id_silla")
    private Integer idSilla;

    @Column(nullable = false, length = 4, unique = true)
    @NotBlank
    @NonNull
    private String asiento;

    @Positive
    @NonNull
    private Double precio;

    @OneToMany(mappedBy = "silla")
    @ToString.Exclude
    private List<ReservaSilla> reservas;

    @ManyToOne
    @JoinColumn(name = "vuelo_id")
    private Vuelo vuelo;




}
