/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
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
import java.util.List;

/**
 *
 * @author Diego
 */
public interface IPersistenciaFachada {

    //clientes
    public abstract Cliente registrarCliente(Cliente cliente) throws PersistenciaException;

    public abstract Cliente consultarClientePorId(String id) throws PersistenciaException;

    public abstract List<Cliente> consultarClientes() throws PersistenciaException;

    public abstract Cliente buscarPorPin(String pin) throws PersistenciaException;

    public abstract void renovarMembresiaCliente(String idCliente, TipoMembresia nuevaMembresia) throws PersistenciaException;

    //prueba
    public abstract MembresiaComprada guardarMembresiaCompradaCliente(String idCliente, MembresiaComprada compra) throws PersistenciaException;

    //membresia comprada
    public abstract MembresiaComprada guardarMembresiaComprada(MembresiaComprada compra) throws PersistenciaException;

    public abstract List<MembresiaComprada> obtenerTodasMembresiasCompradas() throws PersistenciaException;

    //membresia
    public abstract List<Membresia> obtenerYCargarMembresias() throws PersistenciaException;

    //enfermedades
    public abstract List<Enfermedades> consultarEnfermedades() throws PersistenciaException;

    //Lesiones
    public abstract List<Lesiones> consultarLesiones() throws PersistenciaException;

    //ejercicios
    public abstract List<Ejercicio> consultarEjercicios() throws PersistenciaException;

    //rutinas
    public abstract Rutina guardarRutina(Rutina rutina) throws PersistenciaException;

    public abstract void eliminarRutina(String idCliente, String diaSemana) throws PersistenciaException;

    public abstract Rutina editarRutina(Rutina rutina) throws PersistenciaException;

    public abstract Rutina consultarRutina(String idCliente, String diaSemana) throws PersistenciaException;

    //registro fisico 
    public abstract RegistroFisico guardarRegistroFisico(RegistroFisico registroFisico) throws PersistenciaException;

    public abstract RegistroFisico consultarRegistroFisico(String idCliente) throws PersistenciaException;
}
