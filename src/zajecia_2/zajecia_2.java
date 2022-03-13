package zajecia_2;

import java.util.Random;

public class zajecia_2 {
    public static void main(String[] args) {
        int tablica_1 [] = new int[10];
        Random rnd = new Random();
        for (int i = 0; i < tablica_1.length; i++) {
            tablica_1[i]=rnd.nextInt(10,20);
            System.out.print("Tab_1"+"[" + i +"] = " + tablica_1[i]+" | ");
        }
        System.out.println();
        int tablica_2 [] = new int[10];
        for (int i = 0; i < tablica_2.length; i++) {
            tablica_2[i]=rnd.nextInt(20,30);
            System.out.print("Tab_2"+"[" + i +"] = " + tablica_2[i]+" | ");
        }
        System.out.println();

        for(int i=0; i< tablica_1.length; i++){
                System.out.print("Wynik * : "+tablica_1[i]*tablica_2[i]+ " | ");
       }
    }
}
