package co.edu.uniquindio.unitravel.repositorios;

import co.edu.uniquindio.unitravel.entidadespf.Gerente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GerenteRepository extends JpaRepository<Gerente, Integer> {
}