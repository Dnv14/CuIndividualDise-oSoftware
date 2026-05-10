package BOs;

import Interfaces.IRenovarMembresiaBO;
import Adapter.DtosAEntidadesAdapter;
import Adapter.EntidadesADTOsAdapter;
import DTOS.RenovarMembresiaDTO;
import Interfaces.IClientesDAO;
import Excepciones.PersistenciaException;
import Entidades.TipoMembresia;
import Fachada.IPersistenciaFachada;

/**
 *
 * @author PC GAMER MASTER RACE
 */
public class RenovarMembresiaBO implements IRenovarMembresiaBO {

    private IPersistenciaFachada persistenciaFachada;

    public RenovarMembresiaBO(IPersistenciaFachada fachadaPersistencia) {
        this.persistenciaFachada = fachadaPersistencia;
    }

    @Override
    public void renovarMembresia(RenovarMembresiaDTO dto) throws NegocioException {
        TipoMembresia tipo = DtosAEntidadesAdapter.adaptarTipoMembresia(dto.getTipoMembresia());
        try {
            persistenciaFachada.actualizarMembresia(dto.getIdCliente(), tipo);
        } catch (PersistenciaException ex) {
            throw new NegocioException("Error al renovar la membresia.", ex);
        }
    }

}
