//package class;

import java.util.Scanner;

public class Hello {

    public static void main (String arg[]){
        System.out.println("Hello World !!!!!");
        int idade;
        Integer idade2;
        float peso;
        Float peso2;
        char letra;
        String nome;
        boolean maiorDeIdade;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        nome = input.next();

        System.out.println("type you age:");
        idade = input.nextInt();

        System.out.println("Seus dados:\nNome:" + nome + "\nIdade:" +idade);
    }

}

