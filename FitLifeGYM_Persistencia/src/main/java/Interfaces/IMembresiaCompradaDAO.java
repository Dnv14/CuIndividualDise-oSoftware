package Interfaces;

import Entidades.MembresiaComprada;
import Excepciones.PersistenciaException;
import java.util.List;

/**
 *
 * @author Julian
 */
public interface IMembresiaCompradaDAO {

    public abstract MembresiaComprada guardar(MembresiaComprada compra) throws PersistenciaException;

    public abstract List<MembresiaComprada> obtenerTodas() throws PersistenciaException;
}
