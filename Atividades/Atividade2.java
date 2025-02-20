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


public class Atividade2 {
    public static void main(String[] args) {
    
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int n1 = teclado.nextInt();
        
        
        int antecessor = n1 - 1; 
        
        System.out.println("O antecessor do numero e: "+antecessor);
        
        int sucessor = n1 + 1;
        
        System.out.println("O sucessor do numero e: "+sucessor);
        
    }
    
    
    
    
    
}
