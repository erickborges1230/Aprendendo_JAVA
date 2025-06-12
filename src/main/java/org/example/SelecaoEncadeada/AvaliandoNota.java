package org.example.SelecaoEncadeada;

import java.util.Scanner;

public class AvaliandoNota {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor da nota ");
        var nota = teclado.nextInt();

        if((nota >= 0) && (nota<=100)){
            if (nota >= 90) //conceito [90, 100]
                System.out.println("Conceito Excelete");
            else if(nota >=70) //conceito [70, 90[
                System.out.println("Conceito bom");
            else if(nota>=50) //conceito [50, 70[
                System.out.println("Conceito regular");
            else //conceito [0, 50[
                System.out.println("Conceito insuficiente");
        }
        else
            System.out.println("Nota inválida");
        AvaliandoNota.main(null); //Chama novamente o valor da nota caso tenha digitado uma nota inválida
    }
}
