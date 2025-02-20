package Atividades;

import java.util.Scanner;


public class Atividade1 {
    
    public static void main(String[] args) {
        
        
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Digite o seu nome: ");
        String nome = teclado.nextLine();
        
        System.out.println("Digite o seu salario");
        double salario = teclado.nextDouble();
        
        System.out.println(" Ola, " +nome+ ". Voce recebe " +salario+ " reais");
        
    }
    
    
}
