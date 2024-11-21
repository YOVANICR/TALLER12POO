/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller12ejemplos3;

/**
 *
 * @author yoven
 */


public interface Vehiculo {
    void acelerar();  // Método abstracto

    // Método predeterminado
    default void encender() {
        System.out.println("El vehículo está encendido.");
    }
}
