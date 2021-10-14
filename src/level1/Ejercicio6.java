package parteUno;

//Se desea una aplicación que solicite 2 números enteros y realice la operación de potencia (sin uso de librerías).

public class Ejercicio6 {
    public static void main(String args[]){
        int number = 5;
        int power = 3;
        int result = calculatePower(number,power);
        System.out.println(number+"^"+power+"="+result);
    }
    static int calculatePower(int num, int power){
        int answer = 1;
        if(num > 0 && power==0){
            return answer;
        }
        else if(num == 0 && power>=1){
            return 0;
        }
        else{
            for(int i = 1; i<= power; i++){
                answer = answer*num;
            }
            return answer;
        }
    }
}
