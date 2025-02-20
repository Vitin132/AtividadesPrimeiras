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
public class AT13 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Qual o seu nome?");
        String nome = teclado.nextLine();
        
        System.out.println("Qual a sua primeira nota?");
        double nota1 = teclado.nextDouble();
        
        System.out.println("Qual a sua segunda nota?");
        double nota2 = teclado.nextDouble();
        
        double media = (nota1 + nota2) / 2;
        
        if (media < 7) {
            
            System.out.println(nome+" você foi reprovado!");
            
            
        }else{
        
            System.out.println(nome+" você foi aprovado!");
        }
        
    }
    
}
