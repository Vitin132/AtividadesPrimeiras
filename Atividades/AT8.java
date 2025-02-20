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
public class AT8 {
    
    
    public static void main(String[] args) {
        
        
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Qual o valor do produto? ");
        double valorProduto = teclado.nextDouble();
        
        
        System.out.println("Qual o valor do desconto? ");
        double percentual = teclado.nextDouble();
        
        
        double desconto = valorProduto * (percentual/100);
        double valorFinal = valorProduto + desconto;
        System.out.println("O valor com desconto fica: "+valorFinal);
         
        
    }
    
}
