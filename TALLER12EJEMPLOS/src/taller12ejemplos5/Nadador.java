/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller12ejemplos5;

/**
 *
 * @author yoven
 */

public interface Nadador {
    default void despegar() {
        System.out.println("Nadador despega.");
    }
}
