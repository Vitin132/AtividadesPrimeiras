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
public class AT12 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        String nome = teclado.nextLine();

        System.out.println("Você nasceu em que ano?");
        int ano = teclado.nextInt();

        int idade = 2025 - ano;

        if (idade < 16) {

            System.out.println(nome+" você não pode votar!");

        } else {
            System.out.println(nome+" você pode votar!");
        }

    }

}
