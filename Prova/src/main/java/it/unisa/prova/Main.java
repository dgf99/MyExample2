/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.prova;

/**
 *
 * @author Diego Fileno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        salute("world");
        salute("universe");
    }
    
    public static void salute(String whom) {
        System.out.println("Hello, " + whom);    
    }
}
