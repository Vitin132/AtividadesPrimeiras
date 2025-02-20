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
public class Atividade3 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        double n1 = teclado.nextDouble();
        
        double dobro = n1 * 2;
        
        double terca = n1 / 3;
        
        
        System.out.println("O dobro do numero e: "+dobro);
        
        System.out.println("A terca parte do numero e: "+String.format("%.4f", terca));
        
    }
          
    
    
}
