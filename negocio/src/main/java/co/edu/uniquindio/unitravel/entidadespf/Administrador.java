package co.edu.uniquindio.unitravel.entidadespf;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "administrador")
@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
public class Administrador extends Persona implements Serializable {

    public Administrador(@NonNull Integer id, @NonNull String nombre, @NonNull String apellido, @NonNull String email, @NonNull String password, @NonNull String nickname) {
        super(id, nombre, apellido, email, password, nickname);
    }
}
