package Interfaces;

import Entidades.Membresia;
import Excepciones.PersistenciaException;
import java.util.List;

/**
 *
 * @author Julian
 */
public interface IMembresiaDAO {

    public abstract List<Membresia> obtenerYCargarMembresias() throws PersistenciaException;

    
}
