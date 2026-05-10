/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package FabricaDAOS;

import Interfaces.IClientesDAO;
import Interfaces.IEjerciciosDAO;
import Interfaces.IEnfermedadesDAO;
import Interfaces.ILesionesDAO;
import Interfaces.IMembresiaCompradaDAO;
import Interfaces.IMembresiaDAO;
import Interfaces.IRegistroFisicoDAO;
import Interfaces.IRutinasDAO;

/**
 *
 * @author Diego
 */
public interface IFabricaDAOS {

    public abstract IClientesDAO crearClientesDAO();

    public abstract IMembresiaCompradaDAO crearMembresiaCompradaDAO();

    public abstract IMembresiaDAO crearMembresiaDAO();
    
    public abstract IEjerciciosDAO crearEjercicioDAO();
    
    public abstract IEnfermedadesDAO crearEnfermedadesDAO();
    
    public abstract ILesionesDAO crearLesionesDAO();
    
    public abstract IRutinasDAO crearRutinasDAO();
    
    public abstract IRegistroFisicoDAO crearRegistroFisicoDAO();
}
