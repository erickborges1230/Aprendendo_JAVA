package org.example.SelecaoComposta;

import javax.swing.*;

public class PesoIdeal {
    public static void main(String[] args) {
        double altura, peso_idea_home, peso_ideal_mulher;
        String sexo;

        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura"));
        sexo = JOptionPane.showInputDialog("Digite o sexo");

        if(sexo.equalsIgnoreCase("M")){ //metado para comparar Strings e ingnora minúscula de maiúscula
            peso_idea_home = (altura*72.7) - 58;
            System.out.println("O peso ideal do homen é de "+peso_idea_home);
        }else {
            peso_ideal_mulher = (altura*62.1) - 44.7;
            System.out.println("O peso ideal da mulher é de "+peso_ideal_mulher);
        }
    }
}
