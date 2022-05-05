package co.edu.uniquindio.unitravel;

import co.edu.uniquindio.unitravel.entidadespf.Cliente;
import co.edu.uniquindio.unitravel.servicios.ClienteServicio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@Transactional
public class ClienteServicioTest {

    @Autowired
    private ClienteServicio clienteServicio;

    @Test
    @Sql("classpath:dataset.sql")
    public void registrarCliente(){
        //Cliente c= new Cliente("123","Pablito","Velez","pablo67@gmail.com","osito123","oso");
        Cliente c= new Cliente();
        List<String> telfs = new ArrayList<>();
        telfs.add("872872");
        telfs.add("893398");

        c.setTelefonos(telfs);

        try {
            Cliente guardado = clienteServicio.registrarCliente(c);
            Assertions.assertNotNull(guardado);
        } catch (Exception e) {
           Assertions.assertTrue(false);
        }
    }

    @Test
    @Sql("classpath:dataset.sql")
    public void actualizarClienteTest(){
        Cliente cliente = clienteServicio.obtenerCliente(Integer.valueOf("9223"));
        cliente.setPassword("abcde123");

        try {
           Cliente actualizado = clienteServicio.actualizarCliente(cliente);
           Assertions.assertEquals("abcde123", actualizado.getPassword());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    @Sql("classpath:dataset.sql")
    public void eliminarClienteTest(){

        try {
           clienteServicio.eliminarCliente(Integer.valueOf("6767"));
           Cliente eliminado = clienteServicio.obtenerCliente(Integer.valueOf("6767"));
           Assertions.assertNull(eliminado);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    @Sql("classpath:dataset.sql")
    public void listarClienteTest() throws Exception {
        List<Cliente> lista = clienteServicio.ListarCliente();
        lista.forEach(System.out::println);
    }
    @Test
    @Sql("classpath:dataset.sql")
    public void loginClienteTest(){
        try {
            Cliente cliente = clienteServicio.validarLogin("pepe@gmail.com","45545");
            Assertions.assertNotNull(cliente);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
//super(id, nombre, apellido, email, password, nickname);