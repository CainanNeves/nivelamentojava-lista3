package main.java.questao01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int birthYear, currentYear, age;
        System.out.println("Informe seu ano de nascimento:");
        birthYear = input.nextInt();
        System.out.println("Informe o ano atual:");
        currentYear = input.nextInt();
        age = currentYear-birthYear;
        System.out.printf("Em %d você faz %d ano(s)",currentYear, age);
    }
}
