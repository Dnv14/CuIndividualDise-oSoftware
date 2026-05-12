package Entidades;

import java.time.LocalDate;

/**
 *
 * @author Julian
 */
public class Cliente extends Usuario {

    private String telefono;
    private LocalDate fechaNacimiento;
    private String pin;
    private MembresiaComprada membresiaComprada;

    public Cliente() {
    }

    
    
    public Cliente(String nombre, String apellidos, String correo, String contrasenia, String telefono, LocalDate fechaNacimiento, String pin, MembresiaComprada membresíaComprada) {
        super(nombre, apellidos, correo, contrasenia);
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.pin = pin;
        this.membresiaComprada = membresíaComprada;
    }

    public Cliente(String id, String nombre, String apellidos, String correo, String contrasenia, String telefono, LocalDate fechaNacimiento, String pin,MembresiaComprada membresíaComprada) {
        super(id, nombre, apellidos, correo, contrasenia); 
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.pin = pin;
        this.membresiaComprada = membresíaComprada;
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

    public MembresiaComprada getMembresiaComprada() {
        return membresiaComprada;
    }

    public void setMembresiaComprada(MembresiaComprada membresíaComprada) {
        this.membresiaComprada = membresíaComprada;
    }

}
