package com.mycompany.triangulos;
import java.util.Scanner;

public class Triangulos {

    public static void main(String[] args) {
        Triangulos2 lados = new Triangulos2();
        
        Scanner side1 = new Scanner(System.in);
        System.out.println("Digite o primeiro lado:");
        lados.lado1 = (side1.nextDouble());
        
        Scanner side2 = new Scanner(System.in);
        System.out.println("Digite o segundo lado:");
        lados.lado2 = (side2.nextDouble());
        
        Scanner side3 = new Scanner(System.in);
        System.out.println("Digite o terceiro lado:");
        lados.lado3 = (side3.nextDouble());
        
        lados.saida();
    }
}
