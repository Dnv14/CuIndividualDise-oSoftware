/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FabricaDAOS;

import Interfaces.IClientesDAO;
import Interfaces.IEjerciciosDAO;
import Interfaces.IEnfermedadesDAO;
import Interfaces.ILesionesDAO;

import Interfaces.IMembresiaDAO;
import Interfaces.IRegistroFisicoDAO;
import Interfaces.IRutinasDAO;
import Interfaces.IUsuariosDAO;
import PersistenciaMongo.ClientesDAOMongo;
import PersistenciaMongo.EjerciciosDAOSMongo;
import PersistenciaMongo.EnfermedadesDAOMongo;
import PersistenciaMongo.LesionesDAOMongo;

import PersistenciaMongo.MembresiaDAOMongo;
import PersistenciaMongo.RegistroFisicoDAOMongo;
import PersistenciaMongo.RutinasDAOMongo;
import PersistenciaMongo.UsuariosDAOMongo;

/**
 *
 * @author Diego
 */
public class FabricaDAOS implements IFabricaDAOS {

    @Override
    public IClientesDAO crearClientesDAO() {
        return new ClientesDAOMongo();
    }

    @Override
    public IMembresiaDAO crearMembresiaDAO() {
        return new MembresiaDAOMongo();
    }

    @Override
    public IEjerciciosDAO crearEjercicioDAO() {
        return new EjerciciosDAOSMongo();
    }

    @Override
    public IEnfermedadesDAO crearEnfermedadesDAO() {
        return new EnfermedadesDAOMongo();
    }

    @Override
    public ILesionesDAO crearLesionesDAO() {
        return new LesionesDAOMongo();
    }

    @Override
    public IRutinasDAO crearRutinasDAO() {
        return new RutinasDAOMongo();
    }

    @Override
    public IRegistroFisicoDAO crearRegistroFisicoDAO() {
        return new RegistroFisicoDAOMongo();
    }

    @Override
    public IUsuariosDAO crearUsuarioDAO() {
        return new UsuariosDAOMongo();
    }
}
