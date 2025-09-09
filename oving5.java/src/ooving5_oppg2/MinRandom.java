package ooving5_oppg2;

import java.util.Random;

public class MinRandom {
    private Random random;

    public MinRandom(){
        random = new Random();
    }

    public int nesteHeltall(int nedre, int ovre){
        if (nedre > ovre){
            throw new IllegalArgumentException("Du kan ikke ha en nedre grense som er større enn øvre grense");

        }
        else{
            return nedre + random.nextInt(ovre - nedre);
            // EKS: nedre, ovre = 60, 150--> nestedesimaltall = 60 + (0--(150-60)) = 60 + (0--90): 60-150
        }
    
    }

    public double nesteDesimaltall(double nedre, double ovre){
        if (nedre > ovre){
            throw new IllegalArgumentException("Du kan ikke ha en nedre grense som er større enn øvre grense");
        }
        else{
            return nedre + random.nextDouble()*(ovre - nedre); 
            // EKS: nedre, ovre = 2.5, 3,5--> nestedesimaltall = 2.5 + (0 -- 1)*(3.5-2.5) = 2.5 + (0--1)*1: 2.5-3.5
        }
        
    }
    
}
