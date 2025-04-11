/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 *
 * @author CARLOS
 */
public class UsuarioNoEncontradoONoRegistradoException extends Exception {
    public UsuarioNoEncontradoONoRegistradoException(){
        super("Error: Este usuario no se encontro o no esta registrado por favor verifique sus datos o registrese");
    }
    
}
