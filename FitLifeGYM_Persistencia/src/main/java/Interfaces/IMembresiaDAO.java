package Interfaces;

import Entidades.Membresia;
import Excepciones.PersistenciaException;
import java.util.List;

/**
 *
 * @author Julian
 */
public interface IMembresiaDAO {

    public abstract Membresia guardar(Membresia membresia) throws PersistenciaException;

    public abstract List<Membresia> obtenerTodas() throws PersistenciaException;

    public abstract Membresia obtenerPorId(String id) throws PersistenciaException;
}
