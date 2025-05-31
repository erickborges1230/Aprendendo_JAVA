package org.example.variaveis;

import javax.swing.*;

public class OpcoesPagamentos {
    public static void main(String[] args) {
        double valor_produto = Double.parseDouble(JOptionPane.showInputDialog("Informar o valor do produto"));
        double produto_avista = valor_produto * 0.9;
        double prodruto_parcelado = valor_produto/3;
        System.out.println("Produto parago à vista tem 10% de desconto e sairá por "+produto_avista);
        System.out.println("O pago a prazo em 3x de "+prodruto_parcelado);
    }
}
