package main.java.questao10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salarioBruto, descontos, emprestimo;

        System.out.println("Digite o valor do seu salário bruto:");
        salarioBruto = input.nextDouble();

        System.out.println("Digite o valor total dos descontos:");
        descontos = input.nextDouble();

        System.out.println("Digite o valor do possível empréstimo:");
        emprestimo = input.nextDouble();

        if((salarioBruto - descontos) * 0.3 >= emprestimo)
            System.out.println("É possível realizar o empréstimo");
        else
            System.out.println("Não é possivel realizar o empréstimo");
    }
}
