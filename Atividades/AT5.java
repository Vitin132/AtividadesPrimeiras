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
public class AT5 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Quantos R$ voce possui na carteira?");
        double R$ = teclado.nextDouble();
        
        
        double USD = R$ / 5.45;
        
        System.out.println("Voce possui "+String.format("%.4f", USD)+" dolares!");
        
        
        
        
    }
    
}
