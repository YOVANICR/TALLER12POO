/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller12ejemplos2;

/**
 *
 * @author yoven
 */


public class Robot implements Caminador, Hablador {

    // Implementación del método caminar de la interfaz Caminador
    @Override
    public void caminar() {
        System.out.println("El robot esta caminando.");
    }

    // Implementación del método hablar de la interfaz Hablador
    @Override
    public void hablar() {
        System.out.println("El robot esta hablando.");
    }
}
