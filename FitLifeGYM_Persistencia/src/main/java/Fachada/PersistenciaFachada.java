/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fachada;

import DTOsPersistencia.filtrosBusquedaClientesDTO;
import Entidades.Cliente;
import Entidades.Ejercicio;
import Entidades.Enfermedades;
import Entidades.Lesiones;
import Entidades.Membresia;
import Entidades.MembresiaComprada;
import Entidades.RegistroFisico;
import Entidades.Rutina;
import Entidades.TipoMembresia;
import Entidades.Usuario;
import Excepciones.PersistenciaException;
import FabricaDAOS.FabricaDAOS;
import FabricaDAOS.IFabricaDAOS;
import Interfaces.IAdministradorDAO;
import Interfaces.IClientesDAO;
import Interfaces.IEjerciciosDAO;
import Interfaces.IEnfermedadesDAO;
import Interfaces.ILesionesDAO;

import Interfaces.IMembresiaDAO;
import Interfaces.IRegistroFisicoDAO;
import Interfaces.IRutinasDAO;
import Interfaces.IUsuariosDAO;
import java.util.List;
import org.bson.Document;

/**
 *
 * @author Diego
 */
public class PersistenciaFachada implements IPersistenciaFachada {

    private IClientesDAO clientesDAO;

    private IMembresiaDAO membresiaDAO;
    private IEjerciciosDAO ejerciciosDAO;
    private IEnfermedadesDAO enfermedadesDAO;
    private ILesionesDAO lesionesDAO;
    private IRutinasDAO rutinasDAO;
    private IRegistroFisicoDAO registroFisicoDAO;
    private IUsuariosDAO usuariosDAO;
    private IAdministradorDAO administradorDAO;

    public PersistenciaFachada() {
        IFabricaDAOS fabricaDAOS = new FabricaDAOS();
        this.clientesDAO = fabricaDAOS.crearClientesDAO();
        this.usuariosDAO = fabricaDAOS.crearUsuarioDAO();
        this.membresiaDAO = fabricaDAOS.crearMembresiaDAO();
        this.ejerciciosDAO = fabricaDAOS.crearEjercicioDAO();
        this.enfermedadesDAO = fabricaDAOS.crearEnfermedadesDAO();
        this.lesionesDAO = fabricaDAOS.crearLesionesDAO();
        this.rutinasDAO = fabricaDAOS.crearRutinasDAO();
        this.registroFisicoDAO = fabricaDAOS.crearRegistroFisicoDAO();
        this.administradorDAO = fabricaDAOS.crearAdministradorDAO();
    }

    //Clientes
    @Override
    public Cliente registrarCliente(Cliente cliente) throws PersistenciaException {
        return clientesDAO.registrarCliente(cliente);
    }

    @Override
    public Cliente iniciarSesionCliente(String correo, String contrasenia) throws PersistenciaException {
        return clientesDAO.iniciarSesionCliente(correo, contrasenia);
    }
    
    
    @Override
    public List<Document> barraBusquedaConsultarClientes(filtrosBusquedaClientesDTO filtrosDTO) throws PersistenciaException {
        return clientesDAO.barraBusquedaConsultarClientes(filtrosDTO);
    }

    @Override
    public Cliente consultarClientePorId(String id) throws PersistenciaException {
        return clientesDAO.consultarClientePorId(id);
    }

    @Override
    public List<Cliente> consultarClientes() throws PersistenciaException {
        return clientesDAO.consultarClientes();
    }

    @Override
    public Cliente buscarPorPin(String pin) throws PersistenciaException {
        return clientesDAO.buscarPorPin(pin);
    }

    @Override
    public void renovarMembresiaCliente(String idCliente, TipoMembresia nuevaMembresia) throws PersistenciaException {
        clientesDAO.actualizarMembresia(idCliente, nuevaMembresia);
    }

    //membresiaComprada por parte de cliente
    @Override
    public MembresiaComprada guardarMembresiaCompradaCliente(String idCliente, MembresiaComprada compra) throws PersistenciaException {
        return clientesDAO.guardarMembresiaCompradaCliente(idCliente, compra);
    }

    //membresia
    @Override
    public List<Membresia> obtenerYCargarMembresias() throws PersistenciaException {
        return membresiaDAO.obtenerYCargarMembresias();
    }

    //enfermedades
    @Override
    public List<Enfermedades> consultarEnfermedades() throws PersistenciaException {
        return enfermedadesDAO.consultarTodos();
    }

    //Lesiones
    @Override
    public List<Lesiones> consultarLesiones() throws PersistenciaException {
        return lesionesDAO.consultarTodos();
    }

    //ejercicios
    @Override
    public List<Ejercicio> consultarEjercicios() throws PersistenciaException {
        return ejerciciosDAO.consultarTodos();
    }

    //Rutina
    @Override
    public Rutina guardarRutina(Rutina rutina) throws PersistenciaException {
        return rutinasDAO.guardarRutina(rutina);
    }

    @Override
    public void eliminarRutina(String idCliente, String diaSemana) throws PersistenciaException {
        rutinasDAO.eliminarRutina(idCliente, diaSemana);
    }

    @Override
    public Rutina editarRutina(Rutina rutina) throws PersistenciaException {
        return rutinasDAO.editarRutina(rutina);
    }

    @Override
    public Rutina consultarRutina(String idCliente, String diaSemana) throws PersistenciaException {
        return rutinasDAO.consultarRutina(idCliente, diaSemana);
    }

    //registro fisico
    @Override
    public RegistroFisico guardarRegistroFisico(RegistroFisico registroFisico) throws PersistenciaException {
        return registroFisicoDAO.guardarRegistroFisico(registroFisico);
    }

    @Override
    public RegistroFisico consultarRegistroFisico(String idCliente) throws PersistenciaException {
        return registroFisicoDAO.consultarRegistroFisico(idCliente);
    }

    @Override
    public Usuario registrarUsuario(Usuario usuario) throws PersistenciaException {
        return usuariosDAO.registrarUsuario(usuario);
    }

}
