package org.example;

import javax.swing.*;

public class escreveVariaveis {
    public static void main(String[] args) {
        //String frunta = "Banana";
        double valor = 3.50;
        String frunta = JOptionPane.showInputDialog("Digite a frunta");
        //System.out.println("O valor da "+frunta+" é de "+valor);
        JOptionPane.showMessageDialog(null, "O valor da "+frunta+" é de "+valor);
    }
}