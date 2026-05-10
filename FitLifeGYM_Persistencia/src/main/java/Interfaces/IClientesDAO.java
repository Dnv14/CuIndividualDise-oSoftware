package Interfaces;

import Entidades.Cliente;
import Entidades.TipoMembresia;
import Excepciones.PersistenciaException;
import java.util.List;

/**
 *
 * @author Julian
 */
public interface IClientesDAO {

    public abstract Cliente registrarCliente(Cliente cliente) throws PersistenciaException;

    public abstract Cliente consultarClientePorId(String id) throws PersistenciaException;

    public abstract List<Cliente> consultarClientes() throws PersistenciaException;

    public abstract Cliente buscarPorPin(String pin) throws PersistenciaException;

    public abstract void actualizarMembresia(String idCliente, TipoMembresia nuevaMembresia) throws PersistenciaException;

}
