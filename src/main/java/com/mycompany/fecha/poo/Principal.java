package com.mycompany.fecha.poo;
import java.util.Scanner;
public class Principal {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fecha fecha1; // Definición
        int dia = sc.nextInt();
        int mes = sc.nextInt();
        int annio = sc.nextInt();
        fecha1 = new Fecha(dia, mes, annio); //Inicialización
        System.out.println(fecha1.validarFecha());
        if (fecha1.validarFecha()==true){
            System.out.println(fecha1.fechaLarga());
        }
    }
}
