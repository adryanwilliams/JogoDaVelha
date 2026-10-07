package com.mycompany.jogodavelhaa;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author adryan61389566
 */
public class Tabuleiro {
     private int notaJ1;
    private int notaJ2;
    private String regras;
    private boolean houveGanhadorUltimaRodada;
    private int jogadorDaVez;
    private char A1 = ' ', A2 = ' ', A3 = ' ', B1 = ' ', B2 = ' ', B3 = ' ', C1 = ' ', C2 = ' ', C3 = ' ';

    public int getJogadorDaVez() {
        return jogadorDaVez;
    }

    public void setJogadorDaVez(int jogadorDaVez) {
        this.jogadorDaVez = jogadorDaVez;
    }
    public int getNotaJ1() {
        return notaJ1;
    }

    public boolean isHouveGanhadorUltimaRodada() {
        return houveGanhadorUltimaRodada;
    }

    public void setHouveGanhadorUltimaRodada(boolean houveGanhadorUltimaRodada) {
        this.houveGanhadorUltimaRodada = houveGanhadorUltimaRodada;
    }


    public void setNotaJ1(int notaJ1) {
        this.notaJ1 = notaJ1;
    }

    public int getNotaJ2() {
        return notaJ2;
    }

    public void setNotaJ2(int notaJ2) {
        this.notaJ2 = notaJ2;
    }

    public String getRegras() {
        return regras;
    }

    public void setRegras(String regras) {
        this.regras = regras;
    }

    public Tabuleiro(String regras) {
        this.notaJ1 = 0;
        this.notaJ2 = 0;
        this.regras = regras;
        this.houveGanhadorUltimaRodada = false;
        this.jogadorDaVez = 1;
    }
    
    public void verificarGanhador(char simbolo, int numeroJogador){
         if(A3 == simbolo && B2 == simbolo && C1 == simbolo) {
           this.houveGanhadorUltimaRodada = true;
       }
    else if (A1 == simbolo && B1 == simbolo && C1 == simbolo) {
        this.houveGanhadorUltimaRodada = true;
    }else if (A2 == simbolo && A2 == simbolo && C2 == simbolo) {
        this.houveGanhadorUltimaRodada = true;
        
    }else if (B3 == simbolo && B3 == simbolo && C3 == simbolo) {
     this.houveGanhadorUltimaRodada = true;   
    }else if (A1 == simbolo && B2 == simbolo && C3 == simbolo) {
        this.houveGanhadorUltimaRodada = true;
    }else if (C1 == simbolo && C2 == simbolo && C3 == simbolo) {
        this.houveGanhadorUltimaRodada = true;
    }else if (B1 == simbolo && B2 == simbolo && B3 == simbolo) {
        this.houveGanhadorUltimaRodada = true;
    }else if (A1 == simbolo && A2 == simbolo && A3 == simbolo) {
        this.houveGanhadorUltimaRodada = true;
    }else if (A1 == simbolo && B1 == simbolo && C1 == simbolo) {
        this.houveGanhadorUltimaRodada = true;
    }
         if (this.houveGanhadorUltimaRodada) {
        System.out.println(" Parabéns! O Jogador " + numeroJogador + " (" + simbolo + ") venceu o jogo!");
    }
    }
    
    public void organizar(){
   
     }
    
    
    public void mostrarTabuleiro(){
       System.out.printf("""
     A     B      C
        +      +
1    %c  +  %c   +  %c  
        +      +                 |                
   ++++++++++++++++++               
        +      + 
2    %c  +  %c   +  %c          
        +      +     
   ++++++++++++++++++               
        +      + 
3    %c  +  %c   +  %c        
        +      +                           
""", A1, B1, C1, A2,
   B2, C2,A3, B3, C3);
    }
    
    public void marcarJogada(char simbolo, String coordenada){
        switch(coordenada){
            case "a1":
            case "A1":
                   this.A1 = simbolo;
                break;
            case "a2":
            case "A2":
                   this.A2 = simbolo;
                break;
            case "a3":    
            case "A3":
                   this.A3 = simbolo;
                break; 
            case "b1":
            case "B1":
                   this.B1 = simbolo;
                break;    
            case "b2":
            case "B2":
                   this.B2 = simbolo;
                break; 
            case "b3":    
            case "B3":
                   this.B3 = simbolo;
                break;    
            case "c1":    
            case "C1":
                   this.C1 = simbolo;
                break;  
            case "c2":    
            case "C2":
                   this.C2 = simbolo;
                break;
            case "c3":    
            case "C3":
                   this.C3 = simbolo;
                break;
        }
    }
}
