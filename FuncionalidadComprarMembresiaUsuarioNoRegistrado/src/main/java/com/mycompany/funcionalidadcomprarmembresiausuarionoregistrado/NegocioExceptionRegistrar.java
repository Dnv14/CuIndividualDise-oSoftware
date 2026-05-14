/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.funcionalidadcomprarmembresiausuarionoregistrado;

/**
 *
 * @author Diego
 */
public class NegocioExceptionRegistrar extends Exception{
    public NegocioExceptionRegistrar() {
    }

    public NegocioExceptionRegistrar(String message) {
        super(message);
    }

    public NegocioExceptionRegistrar(String message, Throwable cause) {
        super(message, cause);
    }

    public NegocioExceptionRegistrar(Throwable cause) {
        super(cause);
    }

    public NegocioExceptionRegistrar(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
