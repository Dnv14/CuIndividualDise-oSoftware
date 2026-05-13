/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOS;

import java.time.LocalDate;

/**
 *
 * @author Diego
 */
public class NuevoClienteDTO {

    private String id;
    private String idUsuario;
    private String telefono;
    private LocalDate fechaNacimiento;
    private String pin;
    private NuevaMembresiaCompradaDTO membresíaComprada;

    public NuevoClienteDTO() {
    }

    public NuevoClienteDTO(String id, String idUsuario, String telefono, LocalDate fechaNacimiento, String pin, NuevaMembresiaCompradaDTO membresíaComprada) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.pin = pin;
        this.membresíaComprada = membresíaComprada;
    }

    public NuevoClienteDTO(String idUsuario, String telefono, LocalDate fechaNacimiento, String pin, NuevaMembresiaCompradaDTO membresíaComprada) {
        this.idUsuario = idUsuario;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.pin = pin;
        this.membresíaComprada = membresíaComprada;
    }

    public NuevoClienteDTO(String telefono, LocalDate fechaNacimiento, String pin, NuevaMembresiaCompradaDTO membresíaComprada) {
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.pin = pin;
        this.membresíaComprada = membresíaComprada;
    }
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public NuevaMembresiaCompradaDTO getMembresíaComprada() {
        return membresíaComprada;
    }

    public void setMembresíaComprada(NuevaMembresiaCompradaDTO membresíaComprada) {
        this.membresíaComprada = membresíaComprada;
    }

    @Override
    public String toString() {
        return "NuevoClienteDTO{" + "id=" + id + ", idUsuario=" + idUsuario + ", telefono=" + telefono + ", fechaNacimiento=" + fechaNacimiento + ", pin=" + pin + ", membres\u00edaComprada=" + membresíaComprada + '}';
    }

}
