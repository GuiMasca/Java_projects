package Lab01;

import java.util.Scanner;

public class Triangulo{
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        int altura, base;
        float area;

        System.out.print("informe a altura: ");
        altura = teclado.nextInt();

        System.out.print("informe a base: ");

        base = teclado.nextInt();
        area = 0.5f * altura * base;
        System.out.println("Área: " + area);
    }
}