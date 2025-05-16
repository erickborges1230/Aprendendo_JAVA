package org.example;

import javax.swing.*;

public class JantarPizza {
    public static void main(String[] args) {
        double valor_jantar = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do jantar"));
        int numero_cliente = Integer.parseInt(JOptionPane.showInputDialog("Informar o número de clientes"));
        double valor_jantar_cliente = valor_jantar/numero_cliente;
        JOptionPane.showMessageDialog(null, "O valor total do jantar a ser pago é de "+valor_jantar_cliente+" para cada cliente");

    }
}
