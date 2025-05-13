package org.example;

import javax.swing.*;
import java.util.Optional;

public class CalcularHoras {
    public static void main(String[] args) {
        int dias = Integer.parseInt(JOptionPane.showInputDialog("Informar o número de dias de viagem"));
        int horas = Integer.parseInt(JOptionPane.showInputDialog("informar o número de horas de viagem"));
        int total_horas = (dias*24) + horas;
        JOptionPane.showMessageDialog(null,"O valor da viagem em horas foi de "+total_horas);

    }
}
