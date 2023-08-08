package main.java.questao02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float income, minimumWage, count;
        System.out.println("Informe seu salário:");
        income = input.nextInt();
        System.out.println("Informe o salário mínimo atual:");
        minimumWage = input.nextInt();
        count = income/minimumWage;
        System.out.printf("Você recebe %.2f salários mínimos", count);
    }
}
