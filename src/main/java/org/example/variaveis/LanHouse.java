package org.example.variaveis;

import javax.swing.*;

public class LanHouse {
    public static void main(String[] args) {
        final int VALOR_POR_15MINUTOS = 2;
        double horas, minutos, total_minutos;
        double total_apagar;
        horas = Double.parseDouble(JOptionPane.showInputDialog("Informe o número de horas utilizadas"));
        minutos = Double.parseDouble(JOptionPane.showInputDialog("Infome o número de minutos utilizados"));
         total_minutos = horas*60 + minutos;
         total_apagar = Math.ceil (total_minutos/15)*VALOR_POR_15MINUTOS; //Math.ceil para arredondar o valor sempre para cima.
        JOptionPane.showMessageDialog(null,"O valor a pagar é de R$ " +total_apagar);
    }

}
