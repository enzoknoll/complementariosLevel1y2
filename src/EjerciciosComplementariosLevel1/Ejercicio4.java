package parteUno;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int n1;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        n1=scanner.nextInt();
        int i=1;
        int res=1;
        while (i<=n1){
            res*=i;
            i++;
        }
        System.out.println("El factorial de "+n1+" es: "+res);
    }
}
