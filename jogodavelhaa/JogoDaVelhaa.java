/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jogodavelhaa;

import java.util.Scanner;

/**
 *
 * @author adryan61389566
 */
public class JogoDaVelhaa {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
                
        Tabuleiro tabuleiro = new Tabuleiro("1 - Cada jogador deve escolher um simbolo;"
                + " 2 - O jogador 1 inicia a partida;");
        
        
        Jogador jogador1 = new Jogador(1, "Adryan", 'X');
        Jogador jogador2 = new Jogador(2, "Samis", 'O');

        do{
            tabuleiro.mostrarTabuleiro();
            
            if(tabuleiro.getJogadorDaVez() == 1){
                System.out.println("Jogador 1, escolha onde jogar: ");
                String local = entrada.nextLine();
                
                tabuleiro.marcarJogada(jogador1.getSimbolo(), local);
                tabuleiro.setJogadorDaVez(2);
                tabuleiro.mostrarTabuleiro();
                tabuleiro.verificarGanhador(jogador1.getSimbolo(), 1); 
            }
            else{
               System.out.println("Jogador 2, escolha onde jogar: "); 
               String local = entrada.nextLine();
                tabuleiro.marcarJogada(jogador2.getSimbolo(), local);
           tabuleiro.setJogadorDaVez(1);
           tabuleiro.mostrarTabuleiro();
           tabuleiro.verificarGanhador(jogador2.getSimbolo(), 2);
         
            }
            
        }while(tabuleiro.isHouveGanhadorUltimaRodada() == false);
        
            }
}
                 
                
                
                
                
            

                
               
            
                    
}
            

