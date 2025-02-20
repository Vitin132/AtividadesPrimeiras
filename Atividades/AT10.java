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
public class AT10 {
    
    
    public static void main(String[] args) {
        
        
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Quantos dias o cupincha trabalhou?");
        double dias = teclado.nextDouble();
        
        
        double salario = 25 * 8;
        
        double total = dias * salario;
        
        System.out.println("O cupincha recebeu "+total+" reais de salario!");
        
    }
    
}
