package com.mycompany.triangulos;
import java.util.Scanner;

public class Triangulos {

    public static void main(String[] args) {
        Triangulos2 lados = new Triangulos2();
        Scanner sides = new Scanner(System.in);
        
        
        System.out.println("Digite o primeiro lado:");
        lados.lado1 = (sides.nextFloat());
        
        System.out.println("Digite o segundo lado:");
        lados.lado2 = (sides.nextFloat());
        
        System.out.println("Digite o terceiro lado:");
        lados.lado3 = (sides.nextFloat());
        
        lados.saida();
    }
}
