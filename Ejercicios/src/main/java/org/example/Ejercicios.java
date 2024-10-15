package org.example;

import java.awt.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicios {
//Tema 1
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

    public void excepciones(){ //Esto hay que usarlo en los programas para que no de un error si en vez de un numero pone una letra
        Scanner entrada = new Scanner(System.in);

        int numero;

        boolean error = true;

        while (error == true){

            try {
                System.out.println("Introduce un numero ...");
                numero = entrada.nextInt();
                error = false;
            }catch (InputMismatchException er){
                System.out.println("ERROR, Introduce un valor vlaido ...");
                entrada.nextLine();
            }
        }
    }

    public void ejercicio_Act3() {
        System.out.println("Introduce tu nombre");
        Scanner entrada = new Scanner(System.in);
        String nombre = entrada.next();
        boolean error = true;
        int edad = 0;
        while (error == true) {
            try {
                System.out.println("Hola " + nombre + " Introduce tu edad: ");
                edad = entrada.nextInt();
                if (edad <= 0) {
                    System.out.println("Hola " + nombre + " Introduce tu edad: ");
                    edad = entrada.nextInt();
                }
                error = false;
            } catch (InputMismatchException er) {
                System.out.println("Error, Introduce un valor valido");
                entrada.nextLine();
            }
        }
        if (edad >= 18) {
            System.out.println("Enorabuena " + nombre + " Puedes votar.");
        } else {
            System.out.println("Lo siento " + nombre + " no puedes votar.");
            int resultado = 18 - edad;
            System.out.println("Te faltan " + resultado + " años para poder votar");
        }
    }

    public void ejercicio_Act4() {
        Scanner entrada = new Scanner(System.in);

        int num2 = 0;
        int num1 = 0;
        int resultado = 0;

        boolean error = false;

        while (error == false) {

            try {
                System.out.println("Dame un numero de 3 cifras");
                num1 = entrada.nextInt();
                while (num1 < 100) {
                    System.out.println("Dame un numero de 3 cifras");
                    num1 = entrada.nextInt();
                }
                System.out.println("Dame otro numero de 3 cifras");
                num2 = entrada.nextInt();
                while (num2 < 100) {
                    System.out.println("Dame otro numero de 3 cifras");
                    num2 = entrada.nextInt();
                }
                error = true;
            } catch (InputMismatchException er) {
                System.out.println("ERROR, Introduce un valor vlaido ...");
                entrada.nextLine();
            }
        }
        String num2_ent = Integer.toString(num2);
        String num2_1 = num2_ent.substring(0,1);
        String num2_2 = num2_ent.substring(1,2);
        String num2_3 = num2_ent.substring(2,3);
        int num2_1_1 = Integer.parseInt(num2_1);
        int num2_2_1 = Integer.parseInt(num2_2);
        int num2_3_1 = Integer.parseInt(num2_3);
        resultado = num1 * num2;
        int par_1 = num1 * num2_1_1;
        int par_2 = num1 * num2_2_1;
        int par_3 = num1 * num2_3_1;
        System.out.println("El producto de la multiplicación es: " + resultado);
        System.out.println("El proceso es:");
        System.out.println(+ num1);
        System.out.println("x" + num2);
        System.out.println("--------");
        System.out.println(+ par_3);
        System.out.println( + par_2 );
        System.out.println("+ "+ par_1 );
        System.out.println("--------");
        System.out.println(+ resultado);



    }

//Tema 2
    public void ejerciciotm2_1(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("INTRODUCE UNA PALABRA O FRASE: ");
        String frase = entrada.nextLine();

        System.out.println("Texto original: "+ frase);
        System.out.println("La longuitud del texto es: "+ frase.length());
        System.out.println("Texto sin espacios: " + frase.replace(" " ,""));

    }

    public void practicatm2_1(){
       Scanner entrada = new Scanner(System.in); //Aqui esta lo que se utiliza para saber lo que añade el usuario en el programa
        int dia = 0;
        int mes = 0;
        int ano = 0;
        int resultado = 0; //Esto son las variables que voy a usar
        int char1 = 0;
        int char2 = 0;
        int char3 = 0;
        int char4 = 0;
        
        System.out.println("Dime tu fecha de nacimiento (dd/mm/aaaa)"); //Pido la fehca
        String fecha = entrada.nextLine(); //La guardo
        if (fecha.length() != 10 || fecha.charAt(2) != '/' || fecha.charAt(5) != '/') { //Compruebo que tenga 10 de largo y que compruebe que las barras estan en los caracteres que deben estar
            System.out.println("Dime tu fecha de nacimiento (dd/mm/aaaa)"); //Pido otra vez la fecha si algo falla
            fecha = entrada.nextLine(); // La guardo de vuelta
        }
        String dia_str = fecha.substring(0, 2); //Separamos el dia 
        String mes_str = fecha.substring(3, 5); //Separamos el mes 
        String ano_str = fecha.substring(6, 10); //Separamos el año
        dia = Integer.parseInt(dia_str); // Los convertimos en variable int
        mes = Integer.parseInt(mes_str); // Los convertimos en variable int
        ano = Integer.parseInt(ano_str); // Los convertimos en variable int
        if (dia <= 0 || dia > 31) { //Comprobamos que el dia se posible que sea de un mes
            System.out.println("Dime el dia en que naciste (dd)");
            dia = entrada.nextInt();
        }
        if (mes <= 0 || mes > 12) { //Comprobamos que sea un mes posible y si no nos pide el mes posible
            System.out.println("Dime el mes en que naciste (mm)"); 
            mes = entrada.nextInt();
        }
        if (ano < 1000 || ano > 2024) {//Comprobamos que el año sea posible y si no nos pide el año posible
            System.out.println("Dime el dia en que año (aaaa)"); 
            ano = entrada.nextInt();
        }
        System.out.println(dia + "/" + mes + "/" + ano ); //Imprimimos la fecha
        resultado = dia + mes + ano; //Sumamos la fehca
        System.out.println(dia + "+" + mes + "+" + ano + "=" + resultado); //Enseñamos la operación junto al resultado
        String res_str = Integer.toString(resultado); //Convertimos el resultado a string
        String char1_str = res_str.substring(0, 1); // Sacamos cada caracter del resultado
        String char2_str = res_str.substring(1, 2); // Sacamos cada caracter del resultado
        String char3_str = res_str.substring(2, 3); // Sacamos cada caracter del resultado
        String char4_str = res_str.substring(3, 4); // Sacamos cada caracter del resultado
        char1 = Integer.parseInt(char1_str); //Los convertimos en int
        char2 = Integer.parseInt(char2_str); //Los convertimos en int
        char3 = Integer.parseInt(char3_str); //Los convertimos en int
        char4 = Integer.parseInt(char4_str); //Los convertimos en int
        int resultado_2 = char1 + char2 + char3 + char4; // los sumamos para saber el resultado
        System.out.println(char1 + "+" + char2 + "+" + char3 + "+" + char4 +"=" + resultado_2); // Enseñamos la operación y el resultado
        System.out.println("Tu numero de la suerte es " + resultado_2); //Enseñamos el numero de la suerte

            }
        }


    }
}

