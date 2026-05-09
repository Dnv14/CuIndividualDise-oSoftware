
package PersistenciaConsola;

import Entidades.Membresia;
import java.util.List;

/**
 *
 * @author Julian
 */
public interface IMembresiaDAO {
    public abstract Membresia guardar(Membresia membresia) throws PersistenciaException;
    public abstract List<Membresia> obtenerTodas()throws PersistenciaException;
    public abstract Membresia obtenerPorId(Long id)throws PersistenciaException;
}
