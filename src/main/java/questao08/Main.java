package main.java.questao08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b;
        System.out.println("Digite o numerador:");
        a = input.nextDouble();
        System.out.println("Digite o denominador:");
        b = input.nextDouble();

        if(b == 0){
            System.out.println("Alerta: Não é possível realizar uma divisão por zero");
        }else{
            System.out.printf("O resultado da divisão é = %.2f", a/b);
        }
    }
}
