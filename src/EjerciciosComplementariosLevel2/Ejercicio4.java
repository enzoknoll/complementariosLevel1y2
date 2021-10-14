package parteDos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Cargar un arrayList con 12 nombres de estudiantes (String),
        //luego separarlos en 3 cursos (3 arrayList) e imprimir dichos cursos.
public class Ejercicio4 {
            public static void main(String[] args) {
                String nombre;
                List<String> estudiantes=new ArrayList<>();
                Scanner consola=new Scanner(System.in);
                for (int i=0; i<12; i++){
                    System.out.println("Elija el nombre del estudiante"+i+":");
                    nombre=consola.nextLine();
                    estudiantes.add(nombre);
                }
                List curso1=estudiantes.subList(0,4);
                List curso2=estudiantes.subList(4,8);
                List curso3=estudiantes.subList(8,12);

                System.out.println("CURSO 1: ");
                System.out.println(curso1);
                System.out.println("CURSO 2: ");
                System.out.println(curso2);
                System.out.println("CURSO 3: ");
                System.out.println(curso3);
            }
}
