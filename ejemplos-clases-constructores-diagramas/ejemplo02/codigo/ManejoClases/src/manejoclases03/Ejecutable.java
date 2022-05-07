/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases03;

public class Ejecutable {

    public static void main(String[] args) {
        // Se crea un objeto
        Computadora computadoraPersonal = new Computadora(8);
        computadoraPersonal.establecerTipoProcesador("Intel");
        Computadora computadoraPersona2 = new Computadora("AMD");
        computadoraPersona2.establecerMemoria(16);
        Computadora computadoraPersona3 = new Computadora("AMD", 32);

        // Se asigna valores particulares al objeto
        // a través de los métodos establecer
        // Se presenta valores en pantalla, rescatando los valores
        // que se necesita a través de los métodos obtener del
        // objeto 
        System.out.printf("Computadora\n"
                + "Procesador: %s\n"
                + "Memoria: %.2f GB\n\n",
                computadoraPersonal.obtenerTipoProcesador(),
                computadoraPersonal.obtenerMemoria());

        System.out.printf("Computadora\n"
                + "Procesador: %s\n"
                + "Memoria: %.2f GB\n\n",
                computadoraPersona2.obtenerTipoProcesador(),
                computadoraPersona2.obtenerMemoria());

        System.out.printf("Computadora\n"
                + "Procesador: %s\n"
                + "Memoria: %.2f GB\n",
                computadoraPersona3.obtenerTipoProcesador(),
                computadoraPersona3.obtenerMemoria());

    }
}
