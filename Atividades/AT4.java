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
public class AT4 {
    
    public static void main(String[] args) {
        
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite a distancia em metros: ");
        double m = teclado.nextDouble();
        
        double km = m / 1000;
        
        double cm = m * 100;
        
        System.out.println("A distancia em km e: "+km);
        
        System.out.println("A distancia em cm e: "+cm);
        
    }
    
    
}
