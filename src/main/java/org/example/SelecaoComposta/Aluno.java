package org.example.SelecaoComposta;


import java.util.Scanner;

public class Aluno {
    public static void main(String[] args) {
        final double numero_avaliacoes = 4; //constante
        double nota1, nota2, nota3, nota4;
        double media;
        int frequencia = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Favor informar a nota 1");
        nota1 = teclado.nextDouble();
        System.out.println("Favor informar a nota 2");
        nota2 = teclado.nextDouble();
        System.out.println("Favor informar a nota 3");
        nota3 = teclado.nextDouble();
        System.out.println("Favor informar a nota 4");
        nota4 = teclado.nextDouble();
        media = (nota1+nota2+nota3+nota4)/numero_avaliacoes;

        System.out.println("A media aritimetrica foi de "+media);
        if ((media < 5 ) || (frequencia < 75))
            System.out.println("Aluno Reprovado!");
        else
            System.out.println("Aluno Aprovado");
    }
}
