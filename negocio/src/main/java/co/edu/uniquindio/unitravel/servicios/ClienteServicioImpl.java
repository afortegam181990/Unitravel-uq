package co.edu.uniquindio.unitravel.servicios;

import co.edu.uniquindio.unitravel.entidadespf.Cliente;
import co.edu.uniquindio.unitravel.entidadespf.Comentario;
import co.edu.uniquindio.unitravel.entidadespf.Hotel;
import co.edu.uniquindio.unitravel.entidadespf.Reserva;
import co.edu.uniquindio.unitravel.repositorios.ClienteRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class ClienteServicioImpl implements ClienteServicio {

    private ClienteRepository clienteRepository;

    public ClienteServicioImpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public Cliente registrarCliente(Cliente cliente) throws Exception {

        Cliente buscado= obtenerCliente(cliente.getId());

        if(buscado!=null){
        throw new Exception("El codigo del cliente ya esta registrado");
        }
        Cliente clienteEmail= buscarPorEmail(cliente.getEmail());

        if(clienteEmail!=null){
            throw new Exception("El correo del cliente ya esta registrado");
        }
        return clienteRepository.save(cliente);
    }
    public Cliente buscarPorEmail(String email){
        return ClienteRepository.findByEmail(email).orElse(null);
    }

    @Override
    public Cliente actualizarCliente(Cliente cliente) throws Exception {
        Cliente buscado = obtenerCliente(cliente.getId());

        if(buscado==null){
            throw new Exception("El usuario no existe");
        }

        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente obtenerCliente(Integer id)  {
        return clienteRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminarCliente(Integer id) throws Exception {
        Cliente cliente = obtenerCliente(id);

        if(cliente==null){
        throw new Exception("El usuario no existe");
        }
        clienteRepository.delete(cliente);
    }

    @Override
    public List<Cliente> ListarCliente() throws Exception {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente validarLogin(String email, String password) throws Exception {
        Optional<Cliente> cliente = clienteRepository.findByEmailAndPassword(email,password);

        if(cliente.isEmpty()){
            throw new Exception("Los datos de autenticacion son incorrectos");
        }
        return cliente.get();
    }

    @Override
    public Comentario crearComentario(Comentario comentario) throws Exception {
        return null;
    }

    @Override
    public Reserva hacerReserva(Reserva reserva) throws Exception {
        return null;
    }

    @Override
    public List<Hotel> buscarHotelesCiudad(String nombreCiudad) throws Exception {
        return null;
    }
}