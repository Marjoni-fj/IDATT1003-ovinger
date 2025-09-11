package ooving6_oppg3;


public class oppg3 {
    public static void main(String[] args){

        Matriser m2 = new Matriser(new int[][] {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        });
        Matriser m3 = new Matriser(new int[][] {
            {2,4,6},
            {8,10,12},
            {14,16,18}
        });
        
        
        //Adding Matrix m2 and m3 together
        Matriser m4 = m2.addMatriser(m3);
        System.out.println("M2 + M3:");
        System.out.println(m2 + " + \n" + m3 + " = \n" + m4);

        //Transponizing m2
        System.out.println("Transponert M2:");
        Matriser m5 = m2.transponer();
        System.out.println(m2 + "^T = \n" + m5);

        //Matrisemultiplikasjon 
        System.out.println("M2 * M3");
        Matriser m6 = m2.matriseProduktet(m3);
        System.out.println(m2 + " * \n" + m3 + " = \n" + m6);


    }

    

    
}
