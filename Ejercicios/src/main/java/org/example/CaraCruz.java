package Ejercicios.src.main.java.org.example;

import java.util.Random;
import java.util.Scanner;

public class CaraCruz {

    public static void principal(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Cara o Cruz?");
        String opcion = entrada.next();


        //metodo devolver resultado del sorteo
        String result = sorteo();
        comprobarOpcion(result, opcion);
    }
    public static void comprobarOpcion(String result, String opcion){


        if (result.equals(opcion)){
            System.out.println("Has ganado");
        }else {
            System.out.println("Has perdido");
        }
        System.out.println("Ha salido " + result);
    }
    public static String sorteo(){

        Random aleatrio = new Random();
        String opciones [] = {"cara" , "cruz"};

        String result = opciones[aleatrio.nextInt(2)];

        return result;
    }

}

