package org.example;

import javax.xml.transform.Source;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Tema_3 {

    public void vectores(){

        int vector[];

        vector = new int[7];

        vector[2] = 7;
        vector[5] = vector [2] + 4;
        System.out.println(vector [2]+ " " + vector[5]);

        for (int i=0; i< vector.length;i++){
            vector[i] += i;
            System.out.print(" " + vector[i] + " " );

        }
        String palabra[] = new String[3];
        palabra[0] = "Tu madre";
        for (int i=0; i< palabra.length;i++) {

            System.out.print(" " + palabra[i] + " ");
        }
    }

    public void Ejercicio1_bat1(){
        Random random = new Random();
        int numeros[] = new int[8];
        int numero = 0;
        int resultado = 0;
        for (int i = 0; i <numeros.length; i++){
            numeros[i] = random.nextInt(501);
        }
        for (int i = 0; i< numeros.length; i++){
            numero = numeros[i];
            resultado += numero;
        }
        System.out.println("La suma de todos los elementos es: " + resultado);
    }

    public void Ejercicio2_bat1(){
        int numeros[] = new int[5];

        for (int i = 0; i < numeros.length; i++){
            numeros[i] = i;
            System.out.print(" " + numeros[i] + " ");
        }
        System.out.println(" ");
        for(int i = numeros.length -1; i >= 0; i--){
            System.out.print(" " + numeros[i] +" ");


        }
    }

    public void Ejercicio3_bat1(){
        Random aleatorio = new Random();
        Scanner entrada = new Scanner(System.in);
        int numeros[] = new int[25];
        int busc = 0;
        int veces = 0;
        for (int i = 0; i < numeros.length; i++){
            numeros[i] = aleatorio.nextInt(26);
        }
        System.out.println("Ingresa un numero para buscar [0-100]: " );
        busc = entrada.nextInt();

        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] == busc){
                veces++;
            }else{
                continue;
            }
        }
        System.out.println("El numero " + busc+ " aparece " + veces+  " veces en el arrray");
    }

    public void Ejercicio4_bat1(){
        Random aleatorio = new Random();
        Scanner entrada = new Scanner(System.in);
        int array[] = new int[6];
        int array_2[]= new int [5];
        int elim = 0;
        for (int i = 0; i < array.length; i++ ){
            array[i] = aleatorio.nextInt(10);
            System.out.print(" " + array[i] +" ");
        }
        System.out.println("Ingresa el indice a eliminar: ");
        elim = entrada.nextInt();
        for (int i =0; i <=array.length -1;i++){
            if (i == elim){
                continue;

            }else{
                int b = 0;
                array_2[b] = array[i];
                System.out.print(" " + array_2[b] +" ");
                b++;
            }
        }

    }

    public void Ejercicio5_bat1(){
        int numeros [] = {3,5,2,1,4};
        int ultpos = numeros[numeros.length -1];

        for (int i = numeros.length -1; i >= 0; i--){
            if (i == 0){
                numeros[i] = ultpos;
            }else {
                numeros[i] = numeros[i-1];
            }
        }
        for ( int i = 0; i< numeros.length; i++){
            System.out.print(" " + numeros[i] + " ");
        }
    }

    public void Ejercicio6_bat1(){
        Scanner entrada = new Scanner(System.in);
        String temp ="" ;
        int numtemp = 0;
        String temp2 = "";
        String nums[] = new String[6];
        boolean error = true;
        while (error == true) {
            try {
                System.out.println("Introduce 5 numeros");

                
                for (int i = 0; i < nums.length() - 1; i++) {
                    numtemp = nums[i];
                    temp = Integer.toString(numtemp);

                }
                for (int i = nums.length() - 1; i >= 0; i++) {
                    numtemp = nums[i];
                    temp2 = Integer.toString(numtemp);
                }
                if (temp.equals(temp2)) {
                    System.out.println("Es simetrico: Si");
                } else {
                    System.out.println("Es simetrico: No");
                }
            }catch (InputMismatchException e1){
                System.out.println("Caracter erroneo");
                entrada.nextLine();
            }catch (ArrayIndexOutOfBoundsException e2){
                System.out.println("Has puesto numeros de mas");
            }
        }
    }
}
