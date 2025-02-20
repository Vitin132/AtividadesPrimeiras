/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividades;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AT9 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        double valorDia = 90;
        
        double valorKm = 0.20;
        
        System.out.println("Quanto dias o carro foi alugado?");
        double dias = teclado.nextDouble();
        
        System.out.println("Quantos Km foram percorridos?");
        double Km = teclado.nextDouble();
        
        double valorTotal1 = valorDia * dias;
        
        double valorTotal2 = valorKm * Km;
        
        double valorFinal = valorTotal1 + valorTotal2;
        
        System.out.println("O valor total do aluguel ficou: "+valorFinal);
        
        
    }
          
    
}
