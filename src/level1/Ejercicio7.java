package parteUno;

        //Realizar un programa que dado un String de entrada en minúsculas
        //lo convierta por completo a mayúsculas.
        //Sin uso de métodos o librerías que realicen toUppercase().

public class Ejercicio7 {
    public static void main(String[] args) {
      printLowerCase("informatorio");
    }
    public static void printLowerCase(String a){
        for(char ch: a.toCharArray()) {
            if(ch >= 'a' && ch <= 'z')
                ch += 'A' - 'a';
            System.out.print(ch);
        }
    }
}
