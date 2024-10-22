package org.example;

import java.awt.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
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
        boolean error = true;
        while (error == true) {
            System.out.println("Dime tu fecha de nacimiento (dd/mm/aaaa)"); //Pido la fehca
            String fecha = entrada.nextLine(); //La guardo
            if (fecha.length() != 10 || fecha.charAt(2) != '/' || fecha.charAt(5) != '/') { //Compruebo que tenga 10 de largo y que compruebe que las barras estan en los caracteres que deben estar
                System.out.println("Dime tu fecha de nacimiento (dd/mm/aaaa)"); //Pido otra vez la fecha si algo falla
                fecha = entrada.nextLine(); // La guardo de vuelta
            }
            String dia_str = fecha.substring(0, 2); //Separamos el dia
            String mes_str = fecha.substring(3, 5); //Separamos el mes
            String ano_str = fecha.substring(6, 10); //Separamos el año
            try {
                dia = Integer.parseInt(dia_str); // Los convertimos en variable int
                mes = Integer.parseInt(mes_str); // Los convertimos en variable int
                ano = Integer.parseInt(ano_str); // Los convertimos en variable int
                error = false;
            }catch (NumberFormatException e1) { //El error de introducir una letra
                System.out.println("Erro: Introduce numero");

            }
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

    public void errores (){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame un dividendo: ");
        int dividendo = 0; //InputMismatchException
        boolean error = false;

        if(teclado.hasNextInt() == true){
            dividendo = teclado.nextInt();
        }else{
            System.out.println("Has introducido mal el formato, introduce un numero");
            error = true;
        }

        if (error== false){
            System.out.println("Dame un dividendo: ");
            dividendo = teclado.nextInt();
        }
        System.out.println("Dame un divisor: ");
        String divisor = teclado.next(); //NumberFormatException
        int divisor_2 = 0;

        try {
            divisor_2 = Integer.parseInt(divisor); //NumberFormatException
        }catch (NumberFormatException e1){
            System.out.println("Error de formato" + e1.getMessage());
        }
        int resultado = 0;
        try {
            resultado = dividendo / divisor_2;//ArithmeticException

        }catch (ArithmeticException e2){
            System.out.println("No se puede dividir entre 0" + e2.getMessage());
        }
        System.out.println("Resultado = " +resultado);
    }

    public void excepciones_2(){
        Scanner teclado =new Scanner(System.in); //Escaneo lo que introduzca
        boolean error = true;
        int modo = 0;
        int año = 0; //Variables para usar
        int edad = 0;
        int edad_año = 0;
        int caso = 0;
        LocalDateTime año_act = LocalDateTime.now();
        int año_ahora = año_act.getYear();

        while (error == true) { //Bucle para el try catch
            System.out.println("Elige el modo: ");
            System.out.println("Modo 1: ");
            System.out.println("Modo 2: ");

            try { //comprobar que sean numeros y no letras
                modo = teclado.nextInt();
                switch (modo) {
                    case 1: //En caso de que modo sea 1 hace esto
                        System.out.println("Dime tu año de nacimiento");
                        año = teclado.nextInt();
                        while (año < 1900 | año > año_ahora) { //Si no cumple esta variable que pida otra vez el año
                            System.out.println("Dime tu año de nacimiento");
                            año = teclado.nextInt();
                        }
                        error = false;
                        break;

                    case 2: //En caso de que modo sea 2 hace esto
                        System.out.println("Dime tu edad actual");
                        edad = teclado.nextInt();
                        if (edad <= 0 || edad >= 120) { //Si no cumple esta variable que pida otra vez la edad
                            System.out.println("Dime tu edad actual");
                            edad = teclado.nextInt();
                        }
                        año = año_ahora - edad; //Para saber en que año nacio
                        error = false;
                        break;

                }

            } catch (InputMismatchException e1) { //El error de introducir una letra
                System.out.println("Erro: Introduce numero");
                teclado.nextLine();
            }
        }
        if (año >= 1900 && año <= 1927){ //Comrpueba de la generacion que eres
            caso = 1;

        }
        if (año >= 1928 && año <= 1944){
            caso = 2;
        }
        if (año >= 1945 && año <= 1964){
            caso = 3;
        }
        if (año >= 1965 && año <= 1981){

            caso = 4;
        }
        if (año >= 1982 && año <= 1994){
            caso = 5;
        }
        if (año >= 1995 && año <= año_ahora){
            caso = 6;
        }
        switch (caso){//En caso de que valor tenga la variable caso imprime una generación o otra
            case 1:
                System.out.println("Sin Generación bautizada");
                break;
            case 2:
                System.out.println("Generación Silent ");
                break;
            case 3:
                System.out.println("Baby Boomers");
                break;
            case 4:
                System.out.println("Generación X");
                break;
            case 5:
                System.out.println("Millennials");
                break;
            case 6:
                System.out.println("Generación Z");
                break;
        }

    }

    public void ejercicio_calculadora() {
        Scanner entrada = new Scanner(System.in);
        boolean error = true;
        boolean error_2 = true;
        int num1 = 0;  //Estas son las variables que voy a usar durante el programa
        int num2 = 0;
        double result = 0;

        String signo;
        while (error == true) { //creo un while para que si se activa el catch no acabe el programa
            try {
                    System.out.println("BIENVENIDO A LA CALCULADORA RÁPIDA");
                    System.out.println("Intoduce el primer operando");
                    num1 = entrada.nextInt();
                    System.out.println("Introduce el signo a aplicar (+, -, x, /, R)");
                    signo = entrada.next();

                    if (signo.equals("R")) { //Compruebo que sea R por si el num1 es negativo que se añada un positivo
                        while (num1 < 0) {
                            System.out.println("Intoduce el primer operando");
                            num1 = entrada.nextInt();
                        }
                    }
                    switch (signo) { //con este switch hago que depende el signo haga una cosa o otra
                        case "+":
                            System.out.println("Intoduce el segundo operando");
                            num2 = entrada.nextInt();
                            result = num1 + num2;
                            error_2 = false;
                            error = false;
                            break;
                        case "-":
                            System.out.println("Intoduce el segundo operando");
                            num2 = entrada.nextInt();
                            result = num1 - num2;
                            error_2 = false;
                            error = false;
                            break;
                        case "/":
                            System.out.println("Intoduce el segundo operando");
                            num2 = entrada.nextInt();
                            result = num1 / num2;
                            error_2 = false;
                            error = false;
                            break;
                        case "x":
                            System.out.println("Intoduce el segundo operando");
                            num2 = entrada.nextInt();
                            result = num1 * num2;
                            error_2 = false;
                            error = false;
                            break;
                        case "R": //No pido otro numero porque para la raiz cuadrada solo se necesita un numero
                            double result_raiz = Math.sqrt(num1);
                            result = result_raiz;

                            error_2 = false;
                            error = false;
                            break;
                    }


            } catch (InputMismatchException e1) { //Error de caracter
                System.out.println("Error introduce el caracter correcto");
                entrada.nextLine();
            } catch (ArithmeticException e2) {  // Error de dividir entre 0
                System.out.println("No se puede dividir entre 0");
            }
        }
        System.out.println("El resultado de tu operación es: " + result); //Imprimo el resultado de la operación
    }

    public void ejercicio_practica3(){
        Scanner entrada = new Scanner(System.in);
        String isbm;
        int temp2 = 0;
        int divisor = 0;
        int reiduo = 0;
        int x = 10;
        int posicion = 0;
        boolean error = true;
        while (error == true) {
            try {
                System.out.println("Introdcue el ISBN");
                isbm = entrada.next();
                while (isbm.length() != 10) {
                    System.out.println("El ISBN tiene que tener 10 caracteres");
                    isbm = entrada.next();
                }
                for (int i = 0; i < 10; i++) {
                    posicion = i;
                    String temp = String.valueOf(isbm.charAt(i));
                    if (temp.equals("?")){
                        continue;
                    }
                    if (x == 1 && temp.equals("X")) {
                        divisor = divisor + 10;
                        x--;
                    } else {
                        temp2 = Integer.parseInt(temp);
                        divisor += x * temp2;
                        x--;
                    }
                }
                //bulce que ponga numeros hasta que el numero que falta x 8 mas los otros sean divisores entre 11
                reiduo = divisor % 11;
                if (reiduo == 0){
                    System.out.println("El ISBN es valido");
                }else{
                    System.out.println("El ISBN no es valido");
                }
                error = false;
            } catch (NumberFormatException e1) {

                System.out.println("Error:Te has equivocado en el caracter");
            }
        }
    }
}

