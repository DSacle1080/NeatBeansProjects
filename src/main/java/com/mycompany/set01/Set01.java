/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.set01;

import java.util.Scanner;

/**
 *
 * @author dario
 */
//En este proyecto veremos como se desarrolla un código para saber quien gana una partida de tennis.
public class Set01 {

    public static void main(String[] args) {
            Scanner lector = new Scanner(System.in);
            int puntosJugador1 = 0;
            int puntosJugador2 = 0;
            int diferencia1 = 0;
            int diferencia = Math.abs(diferencia1);
            
            System.out.println("Escrible el nombre del primer jugador.");
            String j1 = lector.next();
            System.out.println("Escrible el nombre del segundo jugador.");
            String j2 = lector.next();
            //System.out.println("Tu primer jugador es: "+j1);
            //System.out.println("Tu segundo jugador es: "+j2);
            for(int i = 0; i < 6; i++){
                System.out.println("Elige quién gana el punto. \n Jugador 1 (1) ó Jugador 2 (2).");
                int punto = lector.nextInt();
                if(punto == 1){
                    puntosJugador1 += 1;
                }else if(punto == 2){
                    puntosJugador2 += 1;
                }else{
                    System.out.println("Opción no válida");
                    i--;
                }
                System.out.println("Tabla de puntajes.\nJ1 = "+puntosJugador1+"   J2 = "+puntosJugador2);
                if(puntosJugador1 == 4 && puntosJugador2 < 2){
                    i += 2;
                }else if( puntosJugador2 == 4 && puntosJugador1 < 2) {
                    i += 2;
                }
            }
            if(puntosJugador1 == 4 || puntosJugador2 == 4){
                if(puntosJugador1 == 4){
                    System.out.println("El Jugador 1 ha ganado el partido (Game). \nFelicidades "+j1);
                }else{
                    System.out.println("El jugador 2 ha ganado el partido (Game). \n Felicidades "+j2);
                }
            }else if(puntosJugador1 == 3 && puntosJugador2 == 3){
                System.out.println("Estais en Deuce.");
                
                while(diferencia != 2){
                    System.out.println("Elige quién gana el punto. \n Jugador 1 (1) ó Jugador 2 (2).");
                    int punto = lector.nextInt();
                if(punto == 1){
                    puntosJugador1 += 1;
                    diferencia1 += 1;
                }else if(punto == 2){
                    puntosJugador2 += 1;
                    diferencia1 -= 1;
                }else{
                    System.out.println("Opción no válida");
                    
                }
                if(puntosJugador1-puntosJugador2 == 1){
                    System.out.println("Jugador 1 Add in.");
                }else if(puntosJugador2-puntosJugador1 == 1){
                    System.out.println("Jugador 2 Add in.");
                }else if(puntosJugador1-puntosJugador2 == 2){
                    System.out.println("Jugador 1 Add out.");
                    System.out.println("Jugador 1 win.\nFelicidades "+j1+"!!");
                    
                }else if(puntosJugador2-puntosJugador1 == 2){
                    System.out.println("Jugador 2 Add out.");
                    System.out.println("Jugador 2 win.\nFelicidades "+j2+"!!");
                }else{
                    System.out.println("Estais en Deuce.");
                }
                diferencia = Math.abs(diferencia1);
                }
            }
            
    }
}
