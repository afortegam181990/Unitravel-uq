package co.edu.uniquindio.unitravel.repositorios;

import co.edu.uniquindio.unitravel.entidadespf.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {


   static Optional<Cliente> findByEmail(String email) {
       return null;
   }

    Optional<Cliente> findByEmailAndPassword(String email, String password);
}