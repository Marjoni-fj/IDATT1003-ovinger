package ooving6_oppg1;

import java.util.Random;
public class oppg1 {
    public static void main(String[] args){
        Random random = new Random();
        int[] antall =  new int[10];
        int drive = 1000;
                

        for (int i = 1; i <= drive; i++){
            int tall = random.nextInt(10);
            antall[tall]++;
        }

        for (int i = 0; i < antall.length; i++){
            System.out.println(i + ": " + antall[i]);
        }
    }
}
