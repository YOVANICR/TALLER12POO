/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller12ejercicios.Numero1;

/**
 *
 * @author yoven
 */


public class Ave implements Volador, Cantante {

    // Implementación del método volar
    @Override
    public void volar() {
        System.out.println("El ave está volando.");
    }

    // Implementación del método cantar
    @Override
    public void cantar() {
        System.out.println("El ave está cantando.");
    }
}
