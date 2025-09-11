package ooving6_oppg3;

public class Matriser {
    private final int rows;
    private final int cols;
    private final int[][] data;

   
    // Konstruktør som tar inn et ferdig 2D-array
    public Matriser(int[][] values) {
        this.rows = values.length;
        this.cols = values[0].length;
        this.data = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            if (values[i].length != cols) {
                throw new IllegalArgumentException("Alle rader må ha samme lengde");
            }
            for (int j = 0; j < cols; j++) {
                this.data[i][j] = values[i][j];
            }
        }
    }
    
    
    //Printer ut matrisen
   public void printMatrise() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + " ");
            }  
            System.out.println();
        }
    }

    @Override
    public String toString() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            sb.append(data[i][j]).append(" ");
        }
        sb.append("\n");
    }
    return sb.toString();
}

    // Legger sammen to matriser (returnerer null hvis dimensjonene ikke passer)
    public Matriser addMatriser(Matriser A) {
        if (A == null || A.rows != this.rows || A.cols != this.cols) {
            return null; // operasjonen er umulig
        }

        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = this.data[i][j] + A.data[i][j];
            }
        }
        return new Matriser(result);
    }
    //Transponere Matriser
    public Matriser transponer(){                                                         
        int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                result[j][i] = this.data[i][j];
            }
        }
        return new Matriser(result);

    }

    public Matriser matriseProduktet(Matriser A){
        if (A == null || this.cols != A.rows){
            return null;
        }
        int[][] result = new int[this.rows][A.cols];

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < A.cols; j++){
                int sum = 0;
                for (int k = 0; k < cols; k++){
                    sum += this.data[i][k] * A.data[k][j];
                } 
                result[i][j] = sum;              
            }
        }
        return new Matriser(result);


        
    }

    


}
