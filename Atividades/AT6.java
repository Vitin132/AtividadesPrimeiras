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
public class AT6 {
    
    public static void main(String[] args) {
        
        
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Qual a altura da parede? ");
        double altura = teclado.nextDouble();
        
        System.out.println("Qual a largura da parede?");
        double largura = teclado.nextDouble();
        
        
        double area = altura * largura;
        System.out.println("A area da parede e: "+area);
        
        
        double tinta = area / 2;
                
        
        System.out.println("A quantidade de tinta necessaria e: "+tinta);
        
        
        
        
        
        
    }
          
    
    
}
