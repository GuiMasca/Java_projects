package Lab01;

import java.util.Scanner;

public class Triangulo{
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        double altura, base, area;

        System.out.print("informe a altura: ");
        altura = teclado.nextDouble();

        System.out.print("informe a base: ");

        base = teclado.nextDouble();
        area = 0.5 * altura * base;
        System.out.println("Área: " + area);


    }
}