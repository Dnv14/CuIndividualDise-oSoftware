package Entidades;


import java.util.Date;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MrGam
 */
public class Rutina {
    private String id;
    private String diaSemana;
    private Date fechaAsignada;
    private EstadoRutina estadoRutina;
    private String idCliente;
    private List<DetallesRutina> detallesRutina;

    public Rutina() {
    }
    
}
