package co.edu.uniquindio.unitravel.servicios;

import co.edu.uniquindio.unitravel.entidadespf.Cliente;
import co.edu.uniquindio.unitravel.entidadespf.Comentario;
import co.edu.uniquindio.unitravel.entidadespf.Hotel;
import co.edu.uniquindio.unitravel.entidadespf.Reserva;

import java.util.List;

public interface ClienteServicio {

    Cliente registrarCliente(Cliente cliente) throws  Exception;

    Cliente actualizarCliente(Cliente cliente) throws  Exception;

    Cliente obtenerCliente(Integer id);

    void eliminarCliente(Integer id) throws  Exception;

    List<Cliente> ListarCliente() throws  Exception;

    Cliente validarLogin(String email,String password) throws Exception;

    Comentario crearComentario(Comentario comentario) throws Exception;

    Reserva hacerReserva(Reserva reserva) throws Exception;

    List<Hotel> buscarHotelesCiudad(String nombreCiudad) throws Exception;

}
