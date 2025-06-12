package org.example.SelecaoEncadeada;

import javax.swing.*;

public class CaixaEletronico {
    public static void main(String[] args) {
        int saque;
        double notas100, notas50, notas10;
        int resto;

        saque = Integer.parseInt(JOptionPane.showInputDialog("Favor digitar o valor do saque"));
        if(saque%10 == 0) // valor informado incorreto
        {
            notas100 = Math.floor(saque/100);
            resto = saque % 100;
            notas50 = Math.floor(saque/50);
            resto = resto % 50;
            notas10 = Math.floor(resto/10);

                if(notas100 > 0)
                    System.out.println("O número de notas cem= "+notas100);
                if (notas50 > 0)
                    System.out.println("O número de notas cinquentas= "+notas50);
                if (notas10 > 0)
                    System.out.println("O número de notas dez= "+notas10);

        }else {
            System.out.println("O valor informado está incorreto");
        }
    }
}
