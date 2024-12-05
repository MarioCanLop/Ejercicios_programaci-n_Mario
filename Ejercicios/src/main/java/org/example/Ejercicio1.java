package Ejercicios.src.main.java.org.example;

import java.util.Scanner;

public class Ejercicio1 {
    public static void principal(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime un numero");
        int num = entrada.nextInt();

        System.out.println("El resultado es: " + calcular(num));

    }
    public static int calcular(int num){
        int result =num;
        for (int i = 0;i<2;i++){
            result *= num;
        }
        return result ;
    }
}
