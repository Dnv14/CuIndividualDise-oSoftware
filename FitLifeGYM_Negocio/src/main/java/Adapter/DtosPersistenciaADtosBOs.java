/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter;

import DTOS.BusquedaClientesDTOBo;
import DTOS.FiltrosBusquedaClientesDTOBo;
import DTOsPersistencia.BusquedaClientesDTO;
import DTOsPersistencia.FiltrosBusquedaClientesDTO;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Diego
 */
public class DtosPersistenciaADtosBOs {

    public static List<BusquedaClientesDTOBo> adaptarBusquedaClientePersistenciaABo(List<BusquedaClientesDTO> busquedaClientesDTO) {
        if (busquedaClientesDTO == null) {
            return null;
        }

        List<BusquedaClientesDTOBo> listaNueva = new LinkedList<>();

        for (BusquedaClientesDTO bcDTO : busquedaClientesDTO) {
            BusquedaClientesDTOBo busquedaClientesDTOBo = new BusquedaClientesDTOBo();
            busquedaClientesDTOBo.setIdCliente(bcDTO.getIdCliente());
            busquedaClientesDTOBo.setNombreCompleto(bcDTO.getNombreCompleto());
            busquedaClientesDTOBo.setDiasRutina(bcDTO.getDiasRutina());
            listaNueva.add(busquedaClientesDTOBo);
        }
        return listaNueva;
    }

    
}
