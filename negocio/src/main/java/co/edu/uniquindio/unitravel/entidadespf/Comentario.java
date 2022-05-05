package co.edu.uniquindio.unitravel.entidadespf;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.io.Serializable;
import java.time.LocalDateTime;

@Table(name = "comentario")
@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Comentario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "id_comentario")
    private Integer idComentario;

    @Lob
    private String comentario;

    @Min(-1)
    @Max(1)
    @Column(precision = 1, scale = 1)
    private Integer calificacion;

    @Column(name = "fecha_comentario", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime fechaComentario;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;
}