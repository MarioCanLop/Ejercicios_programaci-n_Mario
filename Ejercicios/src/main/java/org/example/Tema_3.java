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

                
                for (int i = 0; i < nums.length - 1; i++) {

                    temp = Integer.toString(numtemp);

                }
                for (int i = nums.length - 1; i >= 0; i++) {

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

    public void Ejercicio_Samurai(){//Guia no se puede usar asi tienes que hacerlo con split guiate con este
        Scanner entrada = new Scanner(System.in);
        int samuray1 [] = new int[7];
        int samuray2 [] = new int[7];
        int result1 = 0;
        int result2 = 0;
        int equipo_1 = 0;
        int equipo_2 = 0;
        Random aleatorio = new Random();
        boolean error = true;
        while (error = true) {
            try {
                while (result1 < 30) {
                    System.out.println("Introduce la potencia de los samurais: ");
                    for (int i = 0; i < samuray1.length; i++) {
                        samuray1[i] = entrada.nextInt();
                        result1 = samuray1[i];
                    }
                    if (result1 < 30) {
                        System.out.println("ERROR: La potencia total no suma 30.");
                        continue;
                    }
                }
                while (result2 < 30) {
                    System.out.println("Introduce la potencia de los samurais: ");
                    for (int i = 0; i < samuray2.length; i++) {
                        samuray2[i] = entrada.nextInt();
                        result2 = samuray2[i];
                    }
                    if (result2 < 30) {
                        System.out.println("ERROR: La potencia total no suma 30.");
                        continue;


                    }
                }
                    int comienzo = aleatorio.nextInt(8);
                    System.out.println(comienzo);
                    for (int i = comienzo; i < samuray1.length; i++){
                        if (samuray1[i] > samuray2[i]){
                            System.out.println("Samurai" + i + " Gana Equipo 1" + samuray1[i] + samuray2[i]);
                            equipo_1++;
                        } else if (samuray1[i] == samuray2[i]) {
                            System.out.println("Samurai "+ i+ " Empate " + samuray1[i] + " "+ samuray2[i] );
                            continue;
                        } else  {
                            System.out.println("Samurai " + i + " Gana Equipo 2 " + samuray1[i] + " "+ samuray2[i]);
                            equipo_2++;
                        }
                        if (equipo_1 > 4){
                            System.out.println("!Equipo 1 gana! Equipo 2 ha tenido " + equipo_1 + "bajas");
                            break;
                        } else if (equipo_2 > 4){
                            System.out.println("!Equipo 2 gana! Equipo 1 ha tenido " + equipo_1 + "bajas");
                            break;
                        }
                    }
                    int antes = comienzo - samuray2.length;
                    for (int i = 0; i < antes; i++){
                        if (equipo_1 > 4){
                            System.out.println("!Equipo 1 gana! Equipo 2 ha tenido " + equipo_1 + "bajas");
                            break;
                        } else if (equipo_2 > 4){
                            System.out.println("!Equipo 2 gana! Equipo 1 ha tenido " + equipo_1 + "bajas");
                            break;
                        }
                        if (samuray1[i] > samuray2[i]){
                            System.out.println("Samurai " + i + " Gana Equipo 1 " + samuray1[i] + " "+ samuray2[i]);
                            equipo_1++;
                        } else if (samuray1[i] == samuray2[i]) {
                            System.out.println("Samurai "+ i+ " Empate " + samuray1[i] + " "+ samuray2[i] );
                            continue;
                        }else {
                            System.out.println("Samurai " + i + " Gana Equipo 2 " + samuray1[i] + " "+ samuray2[i]);
                            equipo_2++;
                        }

                    }
                    break;

            }catch (InputMismatchException e1){
                System.out.println("Error de caracteres ");
                entrada.nextLine();
            }
        }
    }

    public void Ejercicio_Samurai_bien(){
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();
        String samurai1;
        String samurai2;
        String []samurai1_1 = new String[7];
        String []samurai2_1 = new String[7];
        int suma1 = 0;
        int suma2 = 0;
        int result1 = 0;
        int result2= 0;
        int equipo1 = 0;
        int equipo2 = 0;
        int comiezo = 0;
        int antes = 0;
        do {
            try {
                    do {
                        System.out.println("Introduce las potencias de los samurais del equipo 1 : ");
                        samurai1 = entrada.nextLine();
                        samurai1_1 = samurai1.split(" ");
                        for (int i = 0; i< samurai1_1.length ; i++){
                            suma1 += Integer.parseInt(samurai1_1[i]);
                        }
                        if (suma1 < 30) {
                            System.out.println("Error.La potencia total no suma 30.");
                        }else{
                            System.out.println("Equipo Completado");
                        }

                    }while (suma1 < 30);
                    do {
                        System.out.println("Introduce las potencias de los samurais del equipo 2: ");
                        samurai2 = entrada.nextLine();
                        samurai2_1 = samurai2.split(" ");
                        for (int i = 0; i< samurai2_1.length ; i++){
                            suma2 += Integer.parseInt(samurai2_1[i]);
                        }
                        if (suma2 < 30){
                            System.out.println("Error.La potencia total no suma 30.");
                        }else{
                            System.out.println("Equipo Completado");
                        }
                    }while (suma2 < 30);
                    System.out.println("¡Empieza la batalla!");
                    comiezo = aleatorio.nextInt(7);
                    int comienzo = comiezo + 1;
                    System.out.println("La batalla inicia con el Samurai " + comienzo );
                    antes = (7 - comiezo) -1 ;
                    for (int i = comiezo; i < 7; i++){
                        int compar1 = Integer.parseInt(samurai1_1[i]);
                        int compar2 = Integer.parseInt(samurai2_1[i]);
                        int comparar = compar1 - compar2;
                        int imostrar = i + 1 ;
                        if (comparar > 0){
                            System.out.println("Samurai " + imostrar + ". Gana Equipo 1. " + samurai1_1[i]+ " vs " + samurai2_1[i]);
                            equipo1++;
                        } else if (comparar == 0){
                            System.out.println("Samurai " + imostrar + ". Emapte. " + samurai1_1[i]+ " vs " + samurai2_1[i]);
                        }else{
                            System.out.println("Samurai " + imostrar + ". Gana Equipo 2. " + samurai1_1[i]+ " vs " + samurai2_1[i]);
                            equipo2++;
                        }
                        if (equipo1 >= 4){
                            break;
                        } else if (equipo2 >= 4) {
                            break;
                        }
                    }
                    if (antes < 7) {
                        for (int i = antes; i < comiezo; i++) {
                            if (equipo1 >= 4) {
                                break;
                            } else if (equipo2 >= 4) {
                                break;
                            }
                            int imostrar = i + 1 ;
                            int compar1 = Integer.parseInt(samurai1_1[i]);
                            int compar2 = Integer.parseInt(samurai2_1[i]);
                            int comparar = compar1 - compar2;

                            if (comparar > 0) {
                                System.out.println("Samurai " + imostrar + ". Gana Equipo 1. " + samurai1_1[i] + " vs " + samurai2_1[i]);
                                equipo1++;
                            } else if (comparar == 0) {
                                System.out.println("Samurai " + imostrar + ". Emapte. " + samurai1_1[i] + " vs " + samurai2_1[i]);
                            } else {
                                System.out.println("Samurai " + imostrar + ". Gana Equipo 2. " + samurai1_1[i] + " vs " + samurai2_1[i]);
                                equipo2++;
                            }
                        }
                    }
                    if (equipo1 > equipo2){
                        System.out.println("Equipo 1 Ha ganado con " + equipo1 + " samurais derrotados al equipo 2");
                    } else if (equipo1 < equipo2) {
                        System.out.println("Equipo 2 Ha ganado con " + equipo2 + " samurais derrotados al equipo 1");
                    }else {
                        System.out.println("Ha habido un empate");
                    }
                    break;

            }catch (NumberFormatException e1){
                System.out.println("Error de caracter" + e1);

            }
        }while (true);
    }

    public void Ejercicio_navidad (){
        Scanner entrada = new Scanner(System.in);
        String navidad = "NAVIDAD";

        String[] letras = navidad.split("");



        System.out.println("Introduce cuantas letras quieres en la palabra NAVIDAD");
        String cantidad = entrada.nextLine();
        String[] cantidad_1 = cantidad.split(" ");
        System.out.println(Arrays.toString(letras));
        System.out.println(Arrays.toString(cantidad_1));
        for (int i = 0; i< letras.length; i++){
            int z = Integer.parseInt(cantidad_1[i]);
            for (int b = 0; b < z; b++ ){
                System.out.print(letras[i]);
            }
        }
    }

    public void Ejercicio_buscar(){
        String colores []= {"amarillo","azul", "rojo", "naranja"};
        String color = "negro";

        boolean exsisite = Arrays.asList(colores).contains(color);

        if (exsisite){
            System.out.print("El color " + color +" exisiste en el vector");
        }else{
            System.out.print("El color " + color +" no exisiste en el vector");
        }
    }

    public void Ejercicio_rule(){
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();
        String colores [] = {"rojo", "negro"};

        Integer numeros [] = new Integer[37];
        String color = "" ;
        for (int i =0; i<numeros.length;i++){
            numeros[i] = i;
        }

        String pares [] = {"par", "impar"};
        String par = "";
        System.out.println("Numero (0-36): ");
        int numero = entrada.nextInt();

        boolean numero_existe = Arrays.asList(numeros).contains(numero);

        if (!numero_existe){
            System.out.println("Error el numero no es valido.");
            return;
        }else {
            if (numero != 0) {
                System.out.println("Introduce un color (rojo,negro)");
                color = entrada.next();

                boolean color_existe = Arrays.asList(colores).contains(color);
                if (!color_existe){
                    System.out.println("Error el  color no es valido.");
                    return;
                }else {
                    System.out.println("Introduce (par o impar) ");
                    par = entrada.next();


                    boolean par_existe = Arrays.asList(pares).contains(par);
                    if (!par_existe){
                        System.out.println("Error el  par o impar no es valido.");
                    }
                }
            }
        }
        int numero_sorteo = numeros[aleatorio.nextInt(37)];

        String color_sorteo = colores[aleatorio.nextInt(2)];
        String pares_sorteo = "";
        if (numero_sorteo % 2 == 0){
            pares_sorteo = "par";
        }else {
            pares_sorteo = "impar";
        }
        System.out.println("Ha tocado" + numero_sorteo + " " +color_sorteo + " " + pares_sorteo);


        if (numero != 0 && numero_sorteo==numero && color_sorteo.equals(color) && pares_sorteo.equals(par)){
            System.out.println("HAS GANADO !!!");
        } else if (numero != 0 && color_sorteo.equals(color)) {
            System.out.println("Has acertado el color");
        }else if (numero != 0 && pares_sorteo.equals(par)) {
            System.out.println("Has acertado la opción par/impar");
        } else if (numero == numero_sorteo && numero != 0) {
           System.out.println("Has acertado el número");
        } else if (numero == 0 && numero_sorteo == 0) {
            System.out.println("Has Ganado");
        }else {
            System.out.println("Has perdido");
        }
    }

    public void exposicion (){
        int array[] = {8, 3, 5, 9, 1};

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[i]) {  // Cambiamos la condición para que sea de mayor a menor
                    int aux = array[j];
                    array[j] = array[i];
                    array[i] = aux;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    public void sort (){
        int numeros[] = {6,3,5,24,12};
        System.out.println(Arrays.toString(numeros));

        Arrays.sort(numeros);

        System.out.println(Arrays.toString(numeros));

        int num = 24;
        
        int posicion = Arrays.binarySearch(numeros,num);

        System.out.println(posicion);
    }

    public void duplicados(){
        int original [] = {3,3,5,10,16,25,25};
        int auxiliar [] = new int[original.length];
        int tamanyo = 0;
        for (int i = 0; i < original.length;i++){
            if (i != original.length-1 && original[i]==original[i + 1]){
                System.out.println("duplicado: " + original[i]);
            }else{
                auxiliar[i]= original[i];
                tamanyo++;
            }
        }
        System.out.println(Arrays.toString(auxiliar));

        int limpio[] = new int[tamanyo];
        int pos = 0;
        int resta = 0;
        for (int i = 0;i< auxiliar.length; i++){

            if (auxiliar[i] != 0){
                limpio[i - resta]=auxiliar[i];
                pos ++;
            }else{
                resta++;
            }
        }
        System.out.println(Arrays.toString(limpio));


    }

    public void duplicods3(){
        Random aleatorio = new Random();
        int original [] = {3,3,5,10,16,25,25};
        int auxiliar [] = new int[original.length];
        int tamanyo = 0;

        boolean repetir =true;
        while (repetir) {
            repetir = false;
            for (int i = 0; i < original.length; i++) {
                if (i != original.length - 1 && original[i] == original[i + 1]) {
                    System.out.println("duplicado: " + original[i]);
                    original[i] = aleatorio.nextInt(49) + 1;
                    repetir = true;

                }
            }
            Arrays.sort(original);
        }
        System.out.println(Arrays.toString(auxiliar));

        int limpio[] = new int[tamanyo];
        int pos = 0;
        int resta = 0;
        for (int i = 0;i< auxiliar.length; i++){

            if (auxiliar[i] != 0){
                limpio[i - resta]=auxiliar[i];
                pos ++;
            }else{
                resta++;
            }
        }
        System.out.println(Arrays.toString(limpio));

    }

    public void duplicados_facil(){
        int original [] = {3,3,5,10,16,25,25};

        System.out.println(Arrays.toString(original));


        int vector[] = Arrays.stream(original).distinct().toArray();
        System.out.println(Arrays.toString(vector));

    }

    public void Primitiva(){
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();
        String boleto_normal = "";
        String boleto [] = new String[7];
        int sorteo[] = new int [6];
        boolean formato;
        boolean pasa = false;
        int confirm = 0;
        do {
            try {
                do {
                    confirm = 0;
                    System.out.println("Introduce los datos de tu boleto");
                    System.out.println("X-X-X-X-X-X/X");
                    boleto_normal = entrada.nextLine();
                    formato = boleto_normal.matches("([1-4]?[0-9])-([0-4]?[0-9])-([0-4]?[0-9])-([0-4]?[0-9])-([0-4]?[0-9])-([0-4]?[0-9])/[0-9]"); //Comprobamos que el usuario lo introduce de la manera correcta
                    boleto = boleto_normal.split("[-/]"); // lo pasamos al array
                    System.out.println(Arrays.toString(boleto));
                    for (int i = 0; i<boleto.length -1 ;i++){//con estos for comoprobamos si hay numeros iguales si lo hay confirm = 1
                        for (int j = 0; j < i  ; j++){
                                if (boleto [i].equals(boleto[j])){
                                    confirm = 1;
                                    break;
                                }
                        }
                        if (confirm == 1){
                            break;
                        }

                    }
                }while (formato == false || confirm == 1); //si el formato esta mal o hay un numero repetido vuelve al principio del bucle
                for (int i = 0; i < sorteo.length -1; i++) {//creamos el numero del sorteo
                    sorteo[i] = aleatorio.nextInt(50);
                }

                for (int i = 0; i<sorteo.length -1 ;i++) {//si hay algun numero repetido lo cambia para que no se repitan
                    for (int j = 0; j < i; j++) {
                        while (sorteo[i] == sorteo[j]) {
                            sorteo[i] = aleatorio.nextInt(50);
                        }
                    }

                }
                int complement = aleatorio.nextInt(50);//damos un valor random de 0-49
                int reint = aleatorio.nextInt(10); //damos un valor random de 0-9
                System.out.println("HA SALIDO: ");
                System.out.println(Arrays.toString(sorteo));
                for (int i = 0;i<sorteo.length -1 ;i++){
                    while (complement == sorteo[i]){//si el complemento es igual al del sorteo lo cambia
                        complement = aleatorio.nextInt(50);
                    }
                }
                System.out.println("Complementario: " +complement);
                System.out.println("Reintegro: " +  reint);
                int acierto = 0;
                int opcion_com = 0;

                for (int i = 0;i<6;i++){//si son iguales algunos de los numeros del usuario  suma 1 a acierto
                    int numeroBoleto = Integer.parseInt(boleto[i]);
                    for (int j = 0; j < 6;j++ )
                    if (numeroBoleto == sorteo[j]){
                        acierto++;
                    } else if (numeroBoleto == complement) {
                        opcion_com = 1;
                    }
                }
                System.out.println("RESULTADOS: ");//muestra si ha acertado alguna de las 3 opciones
                System.out.println(acierto + " aciertos");
                if (opcion_com == 1){
                    System.out.println("Complementario");
                }
                if (Integer.parseInt(boleto[6]) == reint){
                    System.out.println("Reintegro");
                }

                break;
            }catch (InputMismatchException e1){
                System.out.println("Error al introducir carcateres");
            }
        }while (true);
    }

    public void triangulo_2(){
        Scanner teclado = new Scanner(System.in);
        int altura = teclado.nextInt();

        for(int i=altura;i>=1;i--){
            for(int j=altura;j>=i;j--){

                System.out.print("*");

            }
            System.out.println("");
        }

        for (int i = 0; i <=altura ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

    public void tablas(){
        System.out.println("TABLAS DE MULTIPLICAR!!!");

        for (int i = 1; i <=10 ; i++) {
            System.out.println("TABLA DEL " + i);
            for (int j = 1; j <=10 ; j++) {

                System.out.println(i + "x" + j + "=" + i*j);

            }

        }

    }

    public void matrices(){
        Scanner entrada = new Scanner(System.in);
        int matriz[][] = new int[3][3];

        for (int i = 0; i< matriz.length;i++){
            for (int j = 0; j<matriz[i].length;j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.print("\n");
        }
        int matriz2[][]= {{2,3,4,1},{5,10,22,6}};

        for (int[] fila : matriz2){

            System.out.println(Arrays.toString(fila));

        }

        int matriz3[][] = new int[3][3];

        for (int i = 0; i<matriz3.length;i++){
            for (int j = 0; j<matriz3[i].length;j++){
                System.out.println("Introduce la posición (" + i + "," + j+ ")" );
                matriz3[i][j]=entrada.nextInt();
            }
        }
        for (int i = 0; i< matriz3.length;i++){
            for (int j = 0; j<matriz3[i].length;j++){
                System.out.print(matriz3[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public void matrices2(){
        int m[][] = new int[3][3];

        for (int i = 0; i<m.length;i++){
            for (int j = 0; j<m[i].length;j++){
                if (i==j){
                    m[i][j]= 1;
                }
            }
        }
        for (int i = 0; i<m.length;i++){
            for (int j = 0; j<m[i].length;j++){
                if (m[i][j] == 1){
                    System.out.print("x ");
                }else {
                    System.out.print("- ");
                }
            }
            System.out.println("");
        }
    }

    public void Ejercicio1_bat_matrices(){
        Scanner entrada = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        int num = 0;
        for (int i = 0; i<matriz.length;i++){
            for (int j =0; j< matriz[i].length ;j++){
                System.out.println("Dame un numero para la matriz :");
                matriz[i][j]= entrada.nextInt();
            }
        }
        int exisiste = 0;
        System.out.println("MATRIZ: ");
        for (int i = 0; i<matriz.length;i++){
            for (int j = 0; j<matriz[i].length;j++){
                System.out.print(matriz[i][j] + " ");
                exisiste = 1;

            }
            System.out.println("");

        }
        System.out.println("Dime un numero para buscarlo");
        num = entrada.nextInt();
        System.out.println("Salida");
        for (int i = 0; i<matriz.length;i++){
            for (int j = 0; j<matriz[i].length;j++){
                if (matriz[i][j] == num){
                    System.out.println("El numero " +num+ "se encuentra en la posición (" +i +", " + j + ")");

                }
            }

        }
        if (exisiste == 0){
            System.out.println("El numero no exisiste");
        }

    }

    public void Ejercicio3_bat_matrices(){
        Scanner entrada = new Scanner(System.in);


    }

    public void Sopa_Letras(){
        Scanner entrada = new Scanner(System.in);
        String matriz[][] = new String[10][10];
        String palabra = "";
        boolean error = true;
        do {
            try {


                for (int i = 0; i < matriz.length; i++) {

                    System.out.println("Introduce la fila " + (i + 1) + " : ");
                    String valor_fila[] = entrada.next().split("");

                    for (int j = 0; j < matriz[i].length; j++) {
                        matriz[i][j] = valor_fila[j];
                    }

                }

                for (String[] filas : matriz) {
                    for (String columnas : filas) {
                        System.out.print(columnas + " ");
                    }
                    System.out.print("\n");
                }
                System.out.println("Introduce la palabra a buscar:");
                palabra = entrada.next();
                palabra.matches("[a-zA-Z]");
                int pri = 0;
                int seg = 1;
                String[] letras = palabra.split("");
                System.out.println(Arrays.toString(letras));
                int si = 0;
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++) {
                        if (matriz[i][j].equals(letras[0])) {

                            int pri1 = i;
                            int pri2 = j;
                            if (j - matriz[i].length >= palabra.length() - 1 || matriz.length >= palabra.length() - 1) {

                                boolean lado = (j - matriz[i].length >= palabra.length() - 1) ? true : false;
                                boolean abajo = (matriz.length >= palabra.length() - 1) ? true : false;
                                if (lado = true) {

                                    for (int x = 1; x < letras.length; x++) {
                                        if (matriz[i][j + x].equals(letras[x])) {
                                            si++;
                                            System.out.println(matriz[i][j + x] + letras[x]);
                                            if (si == letras.length - 1) {
                                                System.out.println("Palabra encontrada. En la posición: " + pri1 + ", " + pri2);
                                            }
                                        }
                                    }
                                }

                                if (abajo = true) {
                                    si = 0;
                                }
                                for (int x = 1; x < letras.length - 1; x++) {
                                    if (matriz[i + x][j].equals(letras[x])) {
                                        si++;
                                        System.out.println(matriz[i + x][j] + letras[x]);
                                        if (si == letras.length - 1) {
                                            System.out.println("Palabra encontrada. En la posición: " + pri1 + ", " + pri2);
                                        }
                                    }
                                }


                            }
                        }
                    }
                }

                break;
            }catch (InputMismatchException e1){
                System.out.println("Error");
            }catch (ArrayIndexOutOfBoundsException e2){
                System.out.println("Error");
            }
        }while (error);

    }

}
