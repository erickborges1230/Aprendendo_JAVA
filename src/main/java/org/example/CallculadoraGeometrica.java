package org.example;

import java.util.Scanner;

public class CallculadoraGeometrica {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
            class Triangulo {
            private double base;
            private double altura;

            public double getBase() {
                return base;
            }

            public void setBase(double base) {
                this.base = base;
            }

            public double getAltura() {
                return altura;
            }

            public void setAltura(double altura) {
                this.altura = altura;
            }
        }

        class Quadrado {
            double lado;

            public double getLado() {
                return lado;
            }

            public void setLado(double lado) {
                this.lado = lado;
            }
        }

        class CalculadoraGeometrica {
            public double obterArea(Quadrado quadrado) {
                return quadrado.getLado() * quadrado.getLado();
            }

            public double obterArea(Triangulo triangulo) {
                return triangulo.getBase() * triangulo.getAltura() / 2;
            }
        }
    }
}
