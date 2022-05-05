package co.edu.uniquindio.unitravel.servicios;

import co.edu.uniquindio.unitravel.entidadespf.Administrador;
import co.edu.uniquindio.unitravel.entidadespf.Ciudad;
import co.edu.uniquindio.unitravel.entidadespf.Hotel;
import co.edu.uniquindio.unitravel.entidadespf.Vuelo;

public interface AdministradorServicio {

    Administrador registrarAdministrador(Administrador administrador) throws Exception;

    Vuelo crearVuelo(Vuelo vuelo) throws Exception;
    Ciudad crearCiudad(Ciudad ciudad) throws Exception;
    Hotel crearHotel(Hotel hotel) throws Exception;
    void eliminarHotel(Integer id) throws Exception;
}
