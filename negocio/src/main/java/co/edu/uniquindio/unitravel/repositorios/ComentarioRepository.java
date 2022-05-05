package co.edu.uniquindio.unitravel.repositorios;

import co.edu.uniquindio.unitravel.entidadespf.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComentarioRepository extends JpaRepository<Comentario, Integer> {
}