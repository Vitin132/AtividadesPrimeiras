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
public class AT11 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Qual a velocidade em que o veiculo estava?");
        double velocidade = teclado.nextDouble();
        
        if (velocidade > 80) {
            
            double multa = 5;
            
            double excesso = velocidade - 80;
            
            double valorMulta = excesso * multa;
            
            System.out.println("O motorista foi multado em: "+valorMulta+" reais!");
            
            
        }else{
            System.out.println("O motorista não foi multado!");
        }   
            
                
        
    }
    
}
