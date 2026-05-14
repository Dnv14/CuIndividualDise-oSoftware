/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.funcionalidadiniciarsesionrenovarmembresia;

/**
 *
 * @author Diego
 */
public class NegocioExceptionRenovar extends Exception{
    public NegocioExceptionRenovar() {
    }

    public NegocioExceptionRenovar(String message) {
        super(message);
    }

    public NegocioExceptionRenovar(String message, Throwable cause) {
        super(message, cause);
    }

    public NegocioExceptionRenovar(Throwable cause) {
        super(cause);
    }

    public NegocioExceptionRenovar(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
