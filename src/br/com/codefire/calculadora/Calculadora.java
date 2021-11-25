package br.com.codefire.calculadora;

import java.util.Scanner;
import java.util.function.IntToDoubleFunction;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        System.out.println("Informe o primeiro valor: ");
        a = scanner.nextInt();
        System.out.println("Informe o segundo valor: ");
        b = scanner.nextInt();

        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        int multiplicar = multiplicar(a, b);
        float dividir = dividir(a, b);

        System.out.println(a + " + " + b + " = " + somar);
        System.out.println(a + " - " + b + " = " + subtrair);
        System.out.println(a + " * " + b + " = " + multiplicar);
        System.out.println(a + " / " + b + " = " + dividir);
    }

    public static int somar(int a, int b){
        return a + b;
    }
    public static int subtrair(int a, int b){
        return a - b;
    }
    public static int multiplicar(int a, int b){
        return a * b;
    }
    //correção do problema da divisão inteira
    public static float dividir(int a, int b){
        float num1, num2;
        num1 = Float.intBitsToFloat(a);
        num2 = Float.intBitsToFloat(b);
        return num1 / num2;
    }


}
