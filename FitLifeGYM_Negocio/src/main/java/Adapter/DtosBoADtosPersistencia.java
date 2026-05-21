/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter;

import DTOS.FiltrosBusquedaClientesDTOBo;
import DTOsPersistencia.FiltrosBusquedaClientesDTO;

/**
 *
 * @author Diego
 */
public class DtosBoADtosPersistencia {

    public static FiltrosBusquedaClientesDTO adaptarFiltrosBoAPersistencia(FiltrosBusquedaClientesDTOBo filtrosBusquedaBo) {

        if (filtrosBusquedaBo == null) {
            return null;
        }
        FiltrosBusquedaClientesDTO filtrosPersistencia = new FiltrosBusquedaClientesDTO();
        filtrosPersistencia.setNombreCliente(filtrosBusquedaBo.getNombreCliente());
        filtrosPersistencia.setEstadoRutina(filtrosBusquedaBo.getEstadoRutina());

        return filtrosPersistencia;
    }
}
