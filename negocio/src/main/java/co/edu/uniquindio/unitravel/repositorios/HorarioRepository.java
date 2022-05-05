package co.edu.uniquindio.unitravel.repositorios;

import co.edu.uniquindio.unitravel.entidadespf.Horario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HorarioRepository extends JpaRepository<Horario, Integer> {
}