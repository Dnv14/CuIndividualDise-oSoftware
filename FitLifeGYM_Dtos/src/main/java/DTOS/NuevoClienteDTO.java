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
public class NuevoClienteDTO extends UsuarioDTO {

    private String telefono;
    private LocalDate fechaNacimiento;
    private String pin;
    private NuevaMembresiaCompradaDTO membresíaComprada;

    public NuevoClienteDTO() {
    }

    public NuevoClienteDTO(String nombre, String apellidos, String correo, String contrasenia, String telefono, LocalDate fechaNacimiento, String pin, NuevaMembresiaCompradaDTO membresíaComprada) {
        super(nombre, apellidos, correo, contrasenia);
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.pin = pin;
        this.membresíaComprada = membresíaComprada;
    }

    public NuevoClienteDTO(String id, String nombre, String apellidos, String correo, String contrasenia, String telefono, LocalDate fechaNacimiento, String pin, NuevaMembresiaCompradaDTO membresíaComprada) {
        super(id, nombre, apellidos, correo, contrasenia);
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.pin = pin;
        this.membresíaComprada = membresíaComprada;
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
        return "NuevoClienteDTO{" + "telefono=" + telefono + ", fechaNacimiento=" + fechaNacimiento + ", pin=" + pin + ", membres\u00edaComprada=" + membresíaComprada + '}';
    }
    
    

}
