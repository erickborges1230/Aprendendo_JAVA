package org.example.SelecaoEncadeada;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o lado A do tringulo");
        var a = teclado.nextInt();

        System.out.println("Digite o lado B do tringulo");
        var b = teclado.nextInt();

        System.out.println("Digite o lado C do tringulo");
        var c = teclado.nextInt();

        if ((a<b+c) && (b<a+c) && (c<a+b)){
            if((a==b)&&(b==c))
                System.out.println("Triângulo Equiláterio");
         else {
             if((a==b) || (b==c))
                 System.out.println("Triângulo Isósceles");
             else
                 System.out.println("Triângulo Escaleno");
            }
        }else
            System.out.println("Os lados informados não formão um triangulo");

    }
}
