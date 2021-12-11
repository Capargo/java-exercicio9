import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Crie um programa que receba dois valores do usuário
        //e exiba a o resultado de sua soma;

        Scanner scr = new Scanner(System.in);

        int valor;
        int valor1;
        int soma;

        System.out.print("informar valor\n");
        valor = scr.nextInt();
        System.out.print("informe o valor\n");
        valor1 = scr.nextInt();


        System.out.print("resultado é \n");
        soma= scr.nextInt();

        soma = valor + valor1;




    }
}
