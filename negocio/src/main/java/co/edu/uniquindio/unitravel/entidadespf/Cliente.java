package co.edu.uniquindio.unitravel.entidadespf;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Table(name = "cliente")
@Entity
@Getter
@Setter
@ToString(callSuper = true)
@RequiredArgsConstructor
public class Cliente extends Persona{

    @Builder
    public Cliente(@NonNull Integer id, @NonNull String nombre, @NonNull String apellido, @NonNull String email,
                   @NonNull String password, @NonNull String nickname,  @NonNull Ciudad ciudad) {
        super(id, nombre, apellido, email, password, nickname);
        this.ciudad = ciudad;
    }

    @OneToMany(mappedBy = "cliente")
    @ToString.Exclude
    private List<Comentario> comentarios;

    @OneToMany(mappedBy = "cliente")
    @ToString.Exclude
    private List<Reserva> reservas;

    @ManyToOne
    @JoinColumn(name = "ciudad_id")
    private Ciudad ciudad;

    @ElementCollection
    @ToString.Exclude
    @JoinTable(name = "telefono")
    @Column(name = "numero", nullable = false, length = 30, unique = true)
    private List<String> telefonos;

}