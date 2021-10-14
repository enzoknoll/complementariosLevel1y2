package parteDos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
public class Ejercicio3 {
    public static void main(String[] args) {
        // Preparar cartas
        // Definir una colección de mapas para almacenar números de marca y tarjetas
        HashMap<Integer, String> pokerMap = new HashMap<Integer, String>();
        // Definir una colección List para almacenar calificaciones
        ArrayList<Integer> pokerNumList = new ArrayList<Integer>();

        String[] colors = "♥-♠-♦-♣".split("-");
        String[] nums = "2-A-K-Q-J-10-9-8-7-6-5-4-3".split("-");

        int index = 2;
        for (String num : nums) {
            for (String color : colors) {
                String thisPoker = color + num;
                //System.out.println(thisPoker);
                // Coloca cartas en la colección de mapas
                pokerMap.put(index, thisPoker);
                // Pon el número de marca en la colección de pokerList
                pokerNumList.add(index);
                index++;
            }
        }

        pokerMap.put(0, "Cartas Aleatorias");
        pokerNumList.add(0);

        //Barajar
        Collections.shuffle(pokerNumList);

        //Licencia
        ArrayList<Integer> player1 = new ArrayList<Integer>();

        // Recorre el conjunto de calificaciones para determinar la calificación indexada
        for (int i = 0; i < pokerNumList.size(); i++) {
            Integer pokerNum = pokerNumList.get(i);
            if (i >= 51) {
            } else if (i % 3 == 0) {
                player1.add(pokerNum);
            } else if (i % 3 == 1) {
            } else if (i % 3 == 2) {
            }
        }

        //Ordenar
        Collections.sort(player1);

        show("Informatorio", player1, pokerMap);

    }

    // Método de definición
    public static void show(String name, ArrayList<Integer> player, HashMap<Integer, String> pokerMap) {
        System.out.print(name + ":");
        for (Integer pokerNum : player) {
            String thisPoker = pokerMap.get(pokerNum);
            System.out.print(thisPoker + " ");
        }
        System.out.println();
    }
}