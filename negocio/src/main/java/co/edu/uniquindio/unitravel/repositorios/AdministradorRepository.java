package co.edu.uniquindio.unitravel.repositorios;

import co.edu.uniquindio.unitravel.entidadespf.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministradorRepository extends JpaRepository<Administrador, Integer> {
}