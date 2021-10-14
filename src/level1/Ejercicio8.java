package parteUno;
//Crear una aplicación que solicite de entrada los datos de una persona en este orden:
//  Nombre y Apellido
//  Edad
//  Dirección
//  Ciudad
//  Luego imprimirá el siguiente mensaje:
// {Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre= sc.nextLine();
        System.out.println("Ingrese su edad: ");
        byte edad= sc.nextByte();
        sc.nextLine();
        System.out.println("Cual es su direccion?: ");
        String direccion=sc.nextLine();
        System.out.println("Cual es su ciudad?: ");
        String ciudad=sc.nextLine();
        System.out.println(ciudad+" - "+direccion+" - "+edad+ " - "+nombre);
    }
}