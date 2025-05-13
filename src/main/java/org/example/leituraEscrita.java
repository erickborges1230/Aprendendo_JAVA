package org.example;

import javax.swing.*;

public class leituraEscrita {
    public static void main(String[] args) {
    /*
       Scanner teclado = new Scanner(System.in);
       System.out.println("Digite seu nome: ");
       String nome = teclado.next();
       System.out.println("Seja Bem vimdo "+nome);
        */
        //Fazendo de uma maneira mais simples
        //O var difine automaticamente o tipo da variável
        //Usando a caixa de dialogo JOptionpane
        //JOptionPane x next(), quanto a quantidade de caracteries
        var nome = JOptionPane.showInputDialog("Digite o seu nome ");
        JOptionPane.showMessageDialog(null, "Seja Bem vindo " + nome);
    }
}
