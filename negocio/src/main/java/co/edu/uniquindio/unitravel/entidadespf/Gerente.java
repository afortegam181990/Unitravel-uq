package co.edu.uniquindio.unitravel.entidadespf;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.List;

@Table(name = "gerente")
@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
public class Gerente extends Persona implements Serializable {

    public Gerente(@NonNull Integer id, @NonNull String nombre, @NonNull String apellido, @NonNull String email, @NonNull String password, @NonNull String nickname) {
        super(id, nombre, apellido, email, password, nickname);
    }

    @OneToMany(mappedBy = "gerente")
    @ToString.Exclude
    private List<Hotel> hoteles;

}