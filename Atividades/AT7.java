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
public class AT7 {
    
    public static void main(String[] args) {
        
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Qual o valor de a: ");
        double a = teclado.nextDouble();
        
        System.out.println("Qual o valor de b: ");
        double b = teclado.nextDouble();
        
        System.out.println("Qual o valor de c: ");
        double c = teclado.nextDouble();
        
        
        double delta = Math.pow(b, 2) - 4 * a * c;
        
        System.out.println("o valor de Delta é "+delta);
                
        
    }
    
}
