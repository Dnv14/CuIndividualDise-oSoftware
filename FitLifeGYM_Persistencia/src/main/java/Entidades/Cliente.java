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
    private String pin;
    private MembresiaComprada membresiaComprada;

    public Cliente() {
    }

    public Cliente(String id, String idUsuario, String telefono, LocalDate fechaNacimiento, String pin, MembresiaComprada membresiaComprada) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.pin = pin;
        this.membresiaComprada = membresiaComprada;
    }

    public Cliente(String idUsuario, String telefono, LocalDate fechaNacimiento, String pin, MembresiaComprada membresiaComprada) {
        this.idUsuario = idUsuario;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.pin = pin;
        this.membresiaComprada = membresiaComprada;
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

    public MembresiaComprada getMembresiaComprada() {
        return membresiaComprada;
    }

    public void setMembresiaComprada(MembresiaComprada membresíaComprada) {
        this.membresiaComprada = membresíaComprada;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", idUsuario=" + idUsuario + ", telefono=" + telefono + ", fechaNacimiento=" + fechaNacimiento + ", pin=" + pin + ", membresiaComprada=" + membresiaComprada + '}';
    }

    

}
