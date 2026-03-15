/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.semana13;

/**
 *
 * @author kimso
 */
import java.util.Scanner;
public class Semana13 {
 static double calcularArea(double base, double altura){
        return base * altura;
    }
    public static void main(String[] args) {
               Scanner sc=new Scanner(System.in);

        double base = 6;
        double altura = 5;

        double resultado = calcularArea(base, altura);

        System.out.println("El area del rectangulo es: " + resultado);
    }
}