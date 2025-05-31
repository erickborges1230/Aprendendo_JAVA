package org.example.variaveis;

import javax.swing.*;
import java.util.Scanner;

public class CalcularDobro {
    public static void main(String[] args){
        //Versão 1 do código
        /*
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o seu número");
        double numero = teclado.nextDouble();
        double dobro = numero * 2;
        System.out.println("O dobro do número é "+dobro);

         */
        //=> Versão 2 do código
        var numero = JOptionPane.showInputDialog("Digite o seu número");
        //Será preciso fazer uma conversão
        //Convertendo uma String para um tipo REAL
        var dobro = Double.parseDouble(numero) * 2;
        JOptionPane.showMessageDialog(null, "O dobro do número é"+dobro);
    }
}
