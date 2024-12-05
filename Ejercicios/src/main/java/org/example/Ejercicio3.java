package Ejercicios.src.main.java.org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
    public static void principal(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime una frase");
        String frase = entrada.nextLine();

        System.out.println(mayus(frase));
        System.out.println("Numero de vocales " + vocales(frase));

    }
    public static String mayus(String frase){


        return frase.toUpperCase();
    }
    public static int vocales(String frase){
        String letras[] = new String[frase.length()];
        letras = frase.split("" );
        int contador = 0;
        for (int i = 0;i<letras.length;i++){
            if (letras[i].equals("a") || letras[i].equals("e")|| letras[i].equals("i") || letras[i].equals("o") || letras[i].equals("u")){
                contador++;
            }
        }
        return contador;
    }
}
