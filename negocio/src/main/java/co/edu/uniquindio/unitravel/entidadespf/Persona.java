package co.edu.uniquindio.unitravel.entidadespf;

import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@MappedSuperclass
@NoArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Persona implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @Column(name = "id_persona")
    private Integer id;

    @Length(min = 2, max = 30)
    @NotBlank
    @Column(name = "nombre", nullable = false, length = 30)
    private String nombre;

    @Length(min = 2, max = 30)
    @NotBlank
    @Column(name = "apellido", nullable = false, length = 30)
    private String apellido;

    @Email(message = "Ingrese un correo valido")
    @Length(max = 100)
    @NotBlank
    @Column(name = "email", nullable = false, length = 100, unique = true)
    @NonNull
    private String email;

    @Length(min = 4)
    @NotBlank
    @Column(name = "password", nullable = false)
    private String password;

    @Length(min = 4, max = 32)
    @NotBlank
    @Column(name = "nickname", nullable = false, length = 20, unique = true)
    private String nickname;

    @Column(name = "fecha_registro", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime fechaRegistro;

    public Persona(@NonNull Integer id, @NonNull String nombre, @NonNull String apellido, @NonNull String email,
                   @NonNull String password, @NonNull String nickname) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.password = password;
        this.nickname = nickname;
        fechaRegistro = LocalDateTime.now();
    }
}
