package BOs;

import Interfaces.IRenovarMembresiaBO;
import Adapter.DtosAEntidadesAdapter;
import Adapter.EntidadesADTOsAdapter;
import DTOS.RenovarMembresiaDTO;
import Interfaces.IClientesDAO;
import Excepciones.PersistenciaException;
import Entidades.TipoMembresia;
import Fachada.IPersistenciaFachada;
import Fachada.PersistenciaFachada;

/**
 *
 * @author PC GAMER MASTER RACE
 */
public class RenovarMembresiaBO implements IRenovarMembresiaBO {

    private IPersistenciaFachada persistenciaFachada;

    public RenovarMembresiaBO() {
        this.persistenciaFachada = new PersistenciaFachada();
    }

    @Override
    public void renovarMembresia(RenovarMembresiaDTO dto) throws BOException {
        TipoMembresia tipo = DtosAEntidadesAdapter.adaptarTipoMembresiaDTO(dto.getTipoMembresia());
        try {
            persistenciaFachada.renovarMembresiaCliente(dto.getIdCliente(), tipo);
        } catch (PersistenciaException ex) {
            throw new BOException("Error al renovar la membresia.", ex);
        }
    }

}
