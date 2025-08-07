package Lab01;

import java.util.Scanner;

public class setes {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        int contador,aux,i;

        contador = 0;


        System.out.print("Insira um numero :");
        aux = teclado.nextInt();

        for(i=0;i<=3;i++){
            if(aux%10==7){
                contador++;
            }
            aux/=10;
        }

        System.out.printf("A quantidade de 7 eh %d",contador);



    }
}
