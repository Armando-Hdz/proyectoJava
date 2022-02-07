package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double primerParcial=0, segundoParcial = 0, tercerParcial = 0;

        System.out.println("Ingresa la Calificacion de tu Primer Parcial: ");
        primerParcial = sc.nextDouble();
        System.out.println("Ingresa la calificacon de Segundo Parcial: ");
        segundoParcial = sc.nextDouble();
        System.out.println("Ingresa la Calificación del Tercer Parcial: ");
        tercerParcial = sc.nextDouble();

        double caliFinal = ((primerParcial+segundoParcial+tercerParcial)/3);
        System.out.println("Tu calificacion es: " + caliFinal);

        if (caliFinal >=0 && caliFinal <=10){
            if(caliFinal < 8){
                System.out.println("Tu calificación es Reprobatoria Gallo! ");
            }
            if(caliFinal >= 8){
                System.out.println("Tu Calificacion es Aprobatoria, Rifaste Carnal!");
            }
        }
        else{
            System.out.println("Estas fuera del rango de calificacion, ingresa un valor correcto");
        }

    }//Fin Args
} //Fin Class
