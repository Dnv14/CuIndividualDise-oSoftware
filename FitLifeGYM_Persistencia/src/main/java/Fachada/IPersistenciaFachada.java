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

    public abstract void actualizarMembresia(String idCliente, TipoMembresia nuevaMembresia) throws PersistenciaException;

    //membresia comprada
    public abstract MembresiaComprada guardarMembresiaComprada(MembresiaComprada compra) throws PersistenciaException;

    public abstract List<MembresiaComprada> obtenerTodasMembresiasCompradas() throws PersistenciaException;

    //membresia
    public abstract Membresia guardarMembresiaCatalogo(Membresia membresia) throws PersistenciaException;

    public abstract List<Membresia> obtenerMembresiasCatalogo() throws PersistenciaException;

    public abstract Membresia obtenerMembresiaPorId(String id) throws PersistenciaException;

    //enfermedades
    public abstract List<Enfermedades> consultarEnfermedades();

    //Lesiones
    public abstract List<Lesiones> consultarLesiones();

    //ejercicios
    public abstract List<Ejercicio> consultarEjercicios();

    //rutinas
    public abstract Rutina guardarRutina(Rutina rutina);

    public abstract void eliminarRutina(String idCliente);

    public abstract Rutina editarRutina(Rutina rutina);

    public abstract Rutina consultarRutina(String idCliente);

    //registro fisico 
    public abstract RegistroFisico guardarRegistroFisico(RegistroFisico registroFisico);

    public abstract RegistroFisico consultarRegistroFisico(String idCliente);
}
