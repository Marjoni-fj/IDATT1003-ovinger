package ooving6_oppg3;

public class Matriser {
    int rows;
    int cols;
    int[][] data;

   
    // Konstruktør som tar inn et ferdig 2D-array
    public Matriser(int[][] values) {
        this.rows = values.length;
        this.cols = values[0].length;
        this.data = values;
    }
    

   public void printMatrise() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + " ");
            }  
            System.out.println();
        }
    }


}
