package com.mycompany.examen1p1_salvadormacias;

/**
 *
 * @author salvador
 */
import java.util.Scanner;

public class Examen1p1_salvadormacias {

    public static void main(String[] args) {
    
    menu();
   
    }
    
        public static void menu(){
        Scanner entrada = new Scanner(System.in);
        boolean bool = true;
        do {
            System.out.println("----------------------------------------------------------------");
            System.out.println("Bienvenido al menu!");
            System.out.println("Estas son las opciones disponibles: ");
            System.out.println("1.Conjuntos\n2.Cifrado por subistitucion\n3.Sobre");
            System.out.println("Por favor ingrese una de las opciones disponibles: ");
            int opc = entrada.nextInt();

            switch (opc) {
                case 1: {
                    conjuntos();

                }//fin case 1
                break;
                case 2: {
                    cifrado();

                }//fin case 2
                break;

                case 3: {
                    sobre();

                }//fin case 3
                break;

                default:
                    bool = false;
                    System.out.println("La opcion ingresada no es valida, abandonara el menu");
            }//fin case
        } while (bool != false);
    }//fin menu

    public static void conjuntos() {
        Scanner conjuntos = new Scanner(System.in);
        System.out.println("A = {a, b, c, d, e} ");
        System.out.println("Utilizando el ejemplo visualizado, ingrese un conjunto en forma de cadena: ");
        String con1 = conjuntos.nextLine();
        System.out.println("Vuelva a ingresar otro conjunto: ");
        String con2 = conjuntos.nextLine();
        if (con1.equals(con2)) {
            System.out.println("Ambos conjuntos son iguales");

        } else {

            System.out.println("Ambos conjuntos no son iguales");
            String union = "";
            String interseccion = "";
            union = con1 += con2;
            for (int i = 0; i < con1.length(); i++) {

            }
            System.out.println("La union es: C="+union);
            System.out.println("La interseccion es :" + interseccion);
        }

    }// fin conjuntos

    public static void cifrado() {
        Scanner cad = new Scanner(System.in);
        System.out.println("Ingrese una cadena: ");
        String cadena = cad.nextLine();
        String cad_cif = cadena.replace("a", "z");
        cadena.replace("b", "y");
        cadena.replace("c", "x");
        cadena.replace("d", "w");
        cadena.replace("e", "v");
        cadena.replace("f", "u");
        cadena.replace("g", "t");
        cadena.replace("h", "s");
        cadena.replace("i", "r");
        cadena.replace("j", "q");
        cadena.replace("k", "p");
        cadena.replace("l", "o");
        cadena.replace("m", "n");
        cadena.replace("n", "m");
        cadena.replace("o", "l");
        cadena.replace("p", "k");
        cadena.replace("q", "j");
        cadena.replace("r", "i");
        cadena.replace("s", "h");
        cadena.replace("t", "g");
        cadena.replace("u", "f");
        cadena.replace("v", "e");
        cadena.replace("w", "d");
        cadena.replace("x", "c");
        cadena.replace("y", "b");
        cadena.replace("z", "a");
        //replaceAll{('a':'x', 'b':'y')};
        System.out.println("Cadena cifrada: " + cad_cif);

    }// fin cifrado

    public static void sobre() {
        Scanner contor = new Scanner(System.in);
        Scanner numero = new Scanner(System.in);
        System.out.println("Ingrese un numero positivo n: ");
        int tamano = numero.nextInt();
        System.out.println("Ingrese el contorno del sobre(solo puede ser un caracter): ");
        String contorno = contor.nextLine();

        for (int i = 1; i <= tamano; i++) {
            for (int j = 1; j <= tamano; j++) {
                if ((i == 1 || i == tamano) || (j == 1 || j == tamano)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");

                    int PP = (tamano / 2) + 1;
                    for (int a = 0; a < PP; a++) {
                        for (int b = 0; b < a; b++) {
                            System.out.print(" ");
                        }//Fin for espacios
                        for (int b = PP - a; b > 0; b--) {
                            if (a == 0 || b == PP - a) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }//Fin for j asteriscos derechos
                        for (int b = PP - 1 - a; b > 0; b--) {
                            if (a == 0 || b == 1) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }//Fin for j asteriscos izquierdos
                        System.out.println("");
                    }//Fin for i 
                    System.out.println("");

                }//Fin for externo         

            }//fin sobre
        }
    }
}//}fin clase
