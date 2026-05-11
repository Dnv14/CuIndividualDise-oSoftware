/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fachada;

import Entidades.Cliente;
import Entidades.Ejercicio;
import Entidades.Enfermedades;
import Entidades.Lesiones;
import Entidades.Membresia;
import Entidades.MembresiaComprada;
import Entidades.RegistroFisico;
import Entidades.Rutina;
import Entidades.TipoMembresia;
import Excepciones.PersistenciaException;
import FabricaDAOS.IFabricaDAOS;
import Interfaces.IClientesDAO;
import Interfaces.IEjerciciosDAO;
import Interfaces.IEnfermedadesDAO;
import Interfaces.ILesionesDAO;
import Interfaces.IMembresiaCompradaDAO;
import Interfaces.IMembresiaDAO;
import Interfaces.IRegistroFisicoDAO;
import Interfaces.IRutinasDAO;
import java.util.List;

/**
 *
 * @author Diego
 */
public class PersistenciaFachada implements IPersistenciaFachada {

    private IClientesDAO clientesDAO;
    private IMembresiaCompradaDAO membresiaCompradaDAO;
    private IMembresiaDAO membresiaDAO;
    private IEjerciciosDAO ejerciciosDAO;
    private IEnfermedadesDAO enfermedadesDAO;
    private ILesionesDAO lesionesDAO;
    private IRutinasDAO rutinasDAO;
    private IRegistroFisicoDAO registroFisicoDAO;

    public PersistenciaFachada(IFabricaDAOS fabricaDAOS) {
        this.clientesDAO = fabricaDAOS.crearClientesDAO();
        this.membresiaCompradaDAO = fabricaDAOS.crearMembresiaCompradaDAO();
        this.membresiaDAO = fabricaDAOS.crearMembresiaDAO();
        this.ejerciciosDAO = fabricaDAOS.crearEjercicioDAO();
        this.enfermedadesDAO = fabricaDAOS.crearEnfermedadesDAO();
        this.lesionesDAO = fabricaDAOS.crearLesionesDAO();
        this.rutinasDAO = fabricaDAOS.crearRutinasDAO();
        this.registroFisicoDAO = fabricaDAOS.crearRegistroFisicoDAO();
    }

    //Clientes
    @Override
    public Cliente registrarCliente(Cliente cliente) throws PersistenciaException {
        return clientesDAO.registrarCliente(cliente);
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
    public void actualizarMembresia(String idCliente, TipoMembresia nuevaMembresia) throws PersistenciaException {
        clientesDAO.actualizarMembresia(idCliente, nuevaMembresia);
    }

    //membresia comprada
    @Override
    public MembresiaComprada guardarMembresiaComprada(MembresiaComprada compra) throws PersistenciaException {
        return membresiaCompradaDAO.guardar(compra);
    }

    @Override
    public List<MembresiaComprada> obtenerTodasMembresiasCompradas() throws PersistenciaException {
        return membresiaCompradaDAO.obtenerTodas();
    }

    //membresia
    @Override
    public Membresia guardarMembresia(Membresia membresia) throws PersistenciaException {
        return membresiaDAO.guardar(membresia);
    }

    @Override
    public List<Membresia> obtenerMembresias() throws PersistenciaException {
        return membresiaDAO.obtenerTodas();
    }

    @Override
    public Membresia obtenerMembresiaPorId(String id) throws PersistenciaException {
        return membresiaDAO.obtenerPorId(id);
    }

    //enfermedades
    @Override
    public List<Enfermedades> consultarEnfermedades() {
        return enfermedadesDAO.consultarTodos();
    }

    @Override
    public List<Enfermedades> cargarEnfermedades() {
        return enfermedadesDAO.cargarEnfermedades();
    }

    //Lesiones
    @Override
    public List<Lesiones> consultarLesiones() {
        return lesionesDAO.consultarTodos();
    }

    @Override
    public List<Lesiones> cargarLesiones() {
        return lesionesDAO.cargarLesiones();
    }

    //ejercicios
    @Override
    public List<Ejercicio> consultarEjercicios() {
        return ejerciciosDAO.consultarTodos();
    }

    @Override
    public List<Ejercicio> cargarEjercicios() {
        return ejerciciosDAO.cargarEjercicios();
    }

    //Rutina
    @Override
    public Rutina guardarRutina(Rutina rutina) {
        return rutinasDAO.guardarRutina(rutina);
    }

    @Override
    public void eliminarRutina(String idCliente) {
        rutinasDAO.eliminarRutina(idCliente);
    }

    @Override
    public Rutina editarRutina(Rutina rutina) {
        return rutinasDAO.editarRutina(rutina);
    }

    @Override
    public Rutina consultarRutina(String idCliente) {
        return rutinasDAO.consultarRutina(idCliente);
    }

    //registro fisico
    @Override
    public RegistroFisico guardarRegistroFisico(RegistroFisico registroFisico) {
        return registroFisicoDAO.guardarRegistroFisico(registroFisico);
    }

    @Override
    public RegistroFisico consultarRegistroFisico(String idCliente) {
        return registroFisicoDAO.consultarRegistroFisico(idCliente);
    }

}
