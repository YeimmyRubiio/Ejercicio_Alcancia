package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            /* Scanner teclado= new Scanner(System.in);
            int a,b, suma;
            System.out.println("Ingrese primer valor");
            a=teclado.nextInt();
            System.out.println("Ingrese segundo valor");
            b=teclado.nextInt();

            suma=a+b;
            System.out.println("lA SUMA DE : " + a + "CON" + b + ":" +suma); */

        Scanner teclado= new Scanner(System.in);
        int u,a;
        int g=0;
        int v=0;
        int c=0;
        int ci=0;
        int d=0;
        int q=0;

        System.out.println("**********       BIENVENID@      *********");

        do {
            System.out.println("**********        MENU           *********");
            System.out.println(" 1) AGREGAR MONEDA ");
            System.out.println(" 2) CONOCER LA CANTIDAD DE MONEDAS POR DENOMINACIÓN");
            System.out.println(" 3) CONOCER LA CANTIDAD DE DINERO AHORRADO ");
            System.out.println(" 4) ROMPER ALCANCIA ");
            System.out.println(" 5) SALIR ");
            System.out.println(" DIGITE EL NÚMERO DE LA OPCIÓN DESEADA" );
            u=teclado.nextInt();

            switch(u) {
                case 1:
                    System.out.println(" MONEDAS DISPONIBLES ");
                    System.out.println(" 1) $20 ");
                    System.out.println(" 2) $50 ");
                    System.out.println(" 3) $100 ");
                    System.out.println(" 4) $200 ");
                    System.out.println(" 5) $500 ");
                    System.out.println(" DIGITE EL NÚMERO DE LA OPCIÓN DESEADA");
                    a = teclado.nextInt();

                    switch (a) {
                        case 1:
                            System.out.println(" INGRESO UNA MONEDA DE $20 ");
                            v = v + 1;
                            g = g + 20;
                            break;

                        case 2:
                            System.out.println(" INGRESO UNA MONEDA DE $50 ");
                            c = v + 1;
                            g = g + 50;
                            break;

                        case 3:
                            System.out.println(" INGRESO UNA MONEDA DE $100 ");
                            c = c + 1;
                            g = g + 100;
                            break;

                        case 4:
                            System.out.println(" INGRESO UNA MONEDA DE $200 ");
                            d = d + 1;
                            g = g + 200;
                            break;

                        case 5:
                            System.out.println(" INGRESO UNA MONEDA DE $500 ");
                            q = q + 1;
                            g = g + 500;
                            break;
                        default:
                            System.out.println(" ");
                    }
                    break;

                case 2:
                    System.out.println("HAY " + v + " " + "MONEDAS DE $20");
                    System.out.println("HAY " + c + " " + "MONEDAS DE $50");
                    System.out.println("HAY " + ci + " " + "MONEDAS DE $100");
                    System.out.println("HAY " + d + " " + "MONEDAS DE $200");
                    System.out.println("HAY " + q + " " + "MONEDAS DE $500");
                    break;
                default:
                    System.out.println(" ");

                case 3:
                    System.out.println("LA CANTIDAD DE DINERO AHORRADO ES:" + g);
                    break;

                case 4:
                    v=0;
                    c=0;
                    ci=0;
                    d=0;
                    q=0;
                    g=0;
                    System.out.println(" YA NO HAY AHORROS :-( !!!!! ");
                    break;

                case 5:
                    System.out.println(" HASTA PRONTO !  ");
                    break;

            }


        } while(u!=5);
    }

}