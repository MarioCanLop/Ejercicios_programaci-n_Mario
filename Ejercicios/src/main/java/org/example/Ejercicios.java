package org.example;

import java.util.Scanner;

public class Ejercicios {

    public void actividad_inicial(){

        System.out.println("¿Como te llamas?");

        Scanner entrada = new Scanner(System.in);

        String nombre = entrada.next();

        System.out.println("¿A que curso vas?");
        String curso = entrada.next();

        System.out.println("Hola" + nombre + "bienvenido a " + curso);

        System.out.println("Introduce un numero...");
        int num1 = entrada.nextInt();
        System.out.println("Introduce otro numero...");
        int num2 = entrada.nextInt();
        int resultado = num1 + num2;
        System.out.println("La suma de los numero es:" + resultado);

    }

    public void ejercicio_1(){
        System.out.println("Dame un numero");
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();
        if ( numero > 0 ) {
            System.out.println("El numero es positivo");}
        else{
            if (numero==0){
                System.out.println("Este numero es neutro");
            }
            else {
                System.out.println("Este numero es negativo");
            }
        }

    }

    public void ejercicio_2(){
        System.out.println("Dame un numero");
        Scanner entrada = new Scanner(System.in);
        int num1 = entrada.nextInt();
        System.out.println("Dame otro numero");
        int num2 = entrada.nextInt();
        if (num1 != num2 ){
            if (num1 > num2){
                System.out.println("El " + num1 + "es mayor que " + num2);}
            else  {
                System.out.println("El " + num2 + "es mayor que " + num1);}
            }
        else {
            System.out.println("ERROR:los numeros introducidos son iguales");
        }

    }

    public void ejercicio_3(){
        System.out.println("Dame un numero");
        Scanner entrada = new Scanner(System.in);
        int num1 = entrada.nextInt();
        System.out.println("Dame otro numero");
        int num2 = entrada.nextInt();
        if(num2 == 0 ){
            System.out.println("ERROR no se puede dividir entre 0");
        }
        else{
            int resultado = num1 / num2;
            System.out.println(+ num1 + " entre " + num2 + " es igual a " + resultado);

        }
    }

    public void ejercicio_4() {
        System.out.println("Dame la base");
        Scanner entrada = new Scanner(System.in);
        int num1 = entrada.nextInt();
        if (num1 < 0) {
            System.out.println("El valor tiene que ser positivo");
        } else {
            if (num1 == 0) {
                System.out.println("El valor tiene que ser mayor a 0");
            } else {
                System.out.println("Dame la altura");
                int num2 = entrada.nextInt();
                if (num2 < 0) {
                    System.out.println("El valor tiene que ser positivo");
                } else {
                    if (num2 == 0) {
                        System.out.println("El valor tiene que ser mayor a 0");
                    } else {
                        int resultado1 = num1 * num2;
                        int resultado2 = resultado1 / 2;
                        System.out.println("El area del triangulo es " + resultado2);
                    }

                }
            }
        }
    }

    public void ejercicio_5(){
        System.out.println("Dame un Numero");
        Scanner entrada = new Scanner(System.in);
        int num1 = entrada.nextInt();
        System.out.println("Dame otro Numero");
        int num2 = entrada.nextInt();
        System.out.println("Dame otro Numero");
        int num3 = entrada.nextInt();
        if (num1 == num2 || num1 == num3 || num2 == num3){
            System.out.println("Error No puedes tener numeros iguales");}
        
    }
}
