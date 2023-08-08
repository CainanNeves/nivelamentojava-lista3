package main.java.questao04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float nota = 0;
        System.out.println("Digite suas 4 notas:");
        for (int i = 0; i < 4; i++) {
            nota += input.nextFloat();
        }
        System.out.printf("Sua média é = %.2f", nota/4);
    }
}
