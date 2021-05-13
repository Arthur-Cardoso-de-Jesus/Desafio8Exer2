/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio8exer2;

import java.util.Scanner;

/**
 *
 * @author Arthur Cardoso de Jesus
 */
public class Desafio8Exer2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numeros, cont025, cont2650, cont5175, cont76100;
        cont025 = 0;
        cont2650 = 0;
        cont5175 = 0;
        cont76100 = 0;
        System.out.println("Digite um numero positivo para continuar ou negativo para sair:");
        numeros = ler.nextInt();
        while (numeros >= 0) {
            if (numeros >= 0 && numeros <= 25) {
                cont025++;
            } else if (numeros >= 26 && numeros <= 56) {
                cont2650++;
            } else if (numeros >= 51 && numeros <= 75) {
                cont5175++;
            } else if (numeros >= 76 && numeros <= 100) {
                cont76100++;
            }
            System.out.println("digite um nomero positivo para continuar ou um  negativo para sair.");
            numeros = ler.nextInt();
        }
         System.out.println("Foram digitados "+cont025+" numeros entre 0 e 25");
         System.out.println("Foram digitados "+cont2650+" numeros entre 26 e 50");
         System.out.println("Foram digitados "+cont5175+" numeros entre 51 e 75");
         System.out.println("Foram digitados "+cont76100+" numeros entre 75 e 100");
    }

}
