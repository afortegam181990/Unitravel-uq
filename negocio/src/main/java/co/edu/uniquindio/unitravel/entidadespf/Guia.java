package co.edu.uniquindio.unitravel.entidadespf;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.List;

@Table(name = "guia_turistico")
@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
public class Guia extends Persona implements Serializable {

    public Guia(@NonNull Integer id, @NonNull String nombre, @NonNull String apellido, @NonNull String email, @NonNull String password, @NonNull String nickname) {
        super(id, nombre, apellido, email, password, nickname);
    }

    @OneToMany(mappedBy = "guia")
    @ToString.Exclude
    private List<PaqueteTuristico> paquetes;
}