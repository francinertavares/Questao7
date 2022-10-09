package Questao7;

import java.util.Scanner;

//Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.

public class Exerc7 {
    public static void main(String[] args){
        double area, aresta, dobro;

        Scanner fran = new Scanner(System.in);

        System.out.println("Informe o tamanho da aresta do quadrado: ");

        aresta = fran.nextFloat();
        area = Math.pow(aresta, 2);
        dobro = area * 2;
        
        System.out.println("A área do quadrado é: " + area + ", sendo que o dobro da área é: " + dobro);

        fran.close();
    }
}
