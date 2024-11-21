/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller12ejercicios.Numero2;

/**
 *
 * @author yoven
 */

public class Pez implements Nadador, Respirador {

    // Implementación del método nadar
    @Override
    public void nadar() {
        System.out.println("El pez esta nadando.");
    }

    // Implementación del método respirar
    @Override
    public void respirar() {
        System.out.println("El pez esta respirando.");
    }
}
