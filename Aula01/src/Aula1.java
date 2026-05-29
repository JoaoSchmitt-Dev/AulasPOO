
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entradas = new Scanner(System.in);
        System.out.print("Digite um numero e veja se e par ou impar: ");
        int numero = entradas.nextInt();

        if(numero % 2 == 0 && numero != 0){
            System.out.printf("O numero " + numero + " é par!");
        } else if (numero % 2 != 0) {
            System.out.printf("O numero " + numero + " é impar!");
        } else {
            System.out.printf("O numero não pode ser zero!");
        }

    }
}*/

/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entradas = new Scanner(System.in);
        System.out.println("Digite dois valores e veja o maior!");

        System.out.printf("Digite o primeiro valor: ");
        int valor1 = entradas.nextInt();

        System.out.printf("Digite o segundo valor: ");
        int valor2 = entradas.nextInt();

        if (valor1 > valor2){
            System.out.printf("O valor " + valor1 + " é maior que o valor " + valor2 + " !");
        } else if (valor2 > valor1) {
            System.out.printf("O valor " + valor2 + " é maior que o valor " + valor1 + " !");
        } else {
            System.out.printf("Os valores são iguais!");
        }
    }
}*/

/*

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entradas = new Scanner(System.in);

        System.out.printf("Digite um numero e veja sua soma: ");
        int numero = entradas.nextInt();

        int soma = 0;

        for (int i = 1; i <= numero; i++){

            soma += i;
        }

        System.out.printf("A soma de 1 até " + numero + " é " + soma);
    }
}
*/

/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entradas = new Scanner(System.in);

        System.out.println("Digite um numero e veja sua fatorial: ");
        int numero = entradas.nextInt();

        int resultado = 1;

        for (int i = 1; i != numero; i++){
            resultado *= i;

        }
        System.out.printf(numero + "! = " + resultado);
    }
}*/

/*
import java.util.Scanner;

public class Main {

    public static double media(double [] valores) {

        double notaMedia = (valores[0] + valores[1] + valores[2] + valores[3] + valores[4]) / 5;

        return notaMedia;
    }
    public static void main(String[] args) {

        Scanner entradas = new Scanner(System.in);

        double[] notas = new double[5];

        System.out.println("Veja a media de suas 5 notas!");

        for (int i = 1; i - 1 != notas.length; i++){

            System.out.printf("Digite sua " + i + "° nota: ");
            notas[i - 1] = entradas.nextDouble();
        }

        double mediaFinal = media(notas);

        System.out.printf("Sua media final foi " + mediaFinal);
    }
}*/

/*
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entradas = new Scanner(System.in);

        int [] valores = new int[10];
        int positivos = 0;

        System.out.println("Digite 10 valores e veja quantos são positivos!");

        for (int i = 1; i - 1 != valores.length; i++){

            System.out.printf("Digite o " + i + "° valor: ");
            valores[i - 1] = entradas.nextInt();

            if (valores[i - 1] > 0){

                positivos = positivos + 1;
            }
        }

        System.out.printf(positivos + " valores são positivos");
    }
}*/

/*
import java.util.Scanner;

public class Main {
    public static double soma(double num1, double num2){
        return num1 + num2;
    }

    public static double subtracao(double num1, double num2){
        return num1 - num2;
    }

    public static double multiplicacao(double num1, double num2){
        return num1 * num2;
    }

    public static double divisao(double num1, double num2){
        return num1 / num2;
    }

    public static void menu(){

         System.out.println("------------------");
         System.out.println("   Calculadora   ");
         System.out.println("------------------");

         System.out.println("[1] Soma");
         System.out.println("[2] Subtracao");
         System.out.println("[3] Multiplicacao");
         System.out.println("[4] Divisao");
         System.out.println("[0] Sair");
         System.out.print("Escolha: ");
    }

    public static void main(String[] args) {

        Scanner entradas = new Scanner(System.in);

        int opcao;
        double numero1, numero2;

        do{
           menu();
           opcao = entradas.nextInt();

           switch (opcao){
               case 0:
                   System.out.printf("Até mais!");
                   break;

               case 1:
                   System.out.println("Escolha os numeros da sua soma!");

                   System.out.printf("Primeiro numero: ");
                   numero1 = entradas.nextDouble();

                   System.out.printf("Segundo numero: ");
                   numero2 = entradas.nextDouble();

                   System.out.println("A soma de " + numero1 + " e " + numero2 + " é " + soma(numero1,numero2));
                   break;

               case 2:
                   System.out.println("Escolha os numeros da sua subtração!");

                   System.out.printf("Primeiro numero: ");
                   numero1 = entradas.nextDouble();

                   System.out.printf("Segundo numero: ");
                   numero2 = entradas.nextDouble();

                   System.out.println("A subtração de " + numero1 + " e " + numero2 + " é " + subtracao(numero1,numero2));
                   break;

               case 3:
                   System.out.println("Escolha os numeros da sua multiplicação!");

                   System.out.printf("Primeiro numero: ");
                   numero1 = entradas.nextDouble();

                   System.out.printf("Segundo numero: ");
                   numero2 = entradas.nextDouble();

                   System.out.println("A multiplicação de " + numero1 + " por " + numero2 + " é " + multiplicacao(numero1,numero2));
                   break;

               case 4:
                   System.out.println("Escolha os numeros da sua divisão");

                   System.out.printf("Primeiro numero: ");
                   numero1 = entradas.nextDouble();

                   System.out.printf("Segundo numero: ");
                   numero2 = entradas.nextDouble();

                   if (numero2 != 0){
                       System.out.println("A divisão de " + numero1 + " por " + numero2 + " é " + divisao(numero1,numero2));
                   } else {
                       System.out.println("Divisão invalida, não é possivel dividir por 0!");
                   }
                   break;

               default:
                   System.out.println("Opção invalida!");
           }

        }while (opcao != 0);

    }
}*/
