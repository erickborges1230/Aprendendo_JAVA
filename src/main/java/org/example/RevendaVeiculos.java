package org.example;

import javax.swing.*;

public class RevendaVeiculos {
    public static void main(String[] args) {
        var modulo = JOptionPane.showInputDialog("Digite o modelo do carro");
        double preco_carro = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do carro"));
        double entrada = 0.5 * preco_carro;
        double restante = (0.5 * preco_carro)/12;
        System.out.println("O valor do carro com 50% de entrada é de "+entrada+"com o saldo restante em 12 parcelas de "+restante);
    }
}
