package Entidades;

import java.time.LocalDate;
import org.bson.BsonType;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonRepresentation;

/**
 *
 * @author Julian
 */
public class Cliente {

    @BsonId
    @BsonRepresentation(BsonType.OBJECT_ID)
    private String id;
    private String idUsuario;
    private String telefono;
    private LocalDate fechaNacimiento;
    private MembresiaComprada membresiaComprada;

    //no se usan como tal pero se ocupan para el inicio de sesion
    private String nombre;
    private String apellidos;
    private String correo;
    private String contrasenia;

    public Cliente() {
    }

    public Cliente(String id, String idUsuario, String telefono, LocalDate fechaNacimiento, MembresiaComprada membresiaComprada) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.membresiaComprada = membresiaComprada;
    }

    public Cliente(String idUsuario, String telefono, LocalDate fechaNacimiento, MembresiaComprada membresiaComprada) {
        this.idUsuario = idUsuario;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.membresiaComprada = membresiaComprada;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
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

    public MembresiaComprada getMembresiaComprada() {
        return membresiaComprada;
    }

    public void setMembresiaComprada(MembresiaComprada membresíaComprada) {
        this.membresiaComprada = membresíaComprada;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", idUsuario=" + idUsuario + ", telefono=" + telefono + ", fechaNacimiento=" + fechaNacimiento + " , membresiaComprada=" + membresiaComprada + '}';
    }

}
