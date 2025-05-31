package org.example.variaveis;

import javax.swing.*;

public class Numero {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("informe o número"));
        int anterior = numero - 1;
        int posterior = numero + 1;
        JOptionPane.showMessageDialog(null,"O valor do número anterior = "+anterior+" e o posterior = "+posterior);
    }
}
