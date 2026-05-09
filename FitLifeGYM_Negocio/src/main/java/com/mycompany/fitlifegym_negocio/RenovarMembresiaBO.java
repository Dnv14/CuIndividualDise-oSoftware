
package com.mycompany.fitlifegym_negocio;

import Adapter.DtosAEntidadesAdapter;
import Adapter.EntidadesADTOsAdapter;
import DTOS.RenovarMembresiaDTO;
import PersistenciaConsola.IClientesDAO;
import PersistenciaConsola.PersistenciaException;
import Entidades.TipoMembresia;

/**
 *
 * @author PC GAMER MASTER RACE
 */
public class RenovarMembresiaBO implements IRenovarMembresiaBO {
    private final IClientesDAO clientesDAO;

    public RenovarMembresiaBO(IClientesDAO clientesDAO) {
        this.clientesDAO = clientesDAO;
    }

    @Override
    public void renovarMembresia(RenovarMembresiaDTO dto) throws NegocioException{
        TipoMembresia tipo = DtosAEntidadesAdapter.adaptarTipoMembresia(dto.getTipoMembresia());
        try {
            clientesDAO.actualizarMembresia(dto.getIdCliente(), tipo);
        } catch (PersistenciaException ex) {
            throw new NegocioException("Error al renovar la membresia.",ex);
        }
    }
    
}
