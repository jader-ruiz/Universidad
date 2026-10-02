package ESTRUCTURA_DATOS.matrices;

public class Matriz2 {

    public int [][]mat;

    // Constructor
    public Matriz2(){
        mat = new int[][]{
            {10,20,30},
            {40,50,60},
            {70,80,90}
        };
    }
    
    public static void main(String[] args) {
        Matriz2 obj = new Matriz2();
        obj.MostrarMatriz();

    }

    public void MostrarMatriz(){
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
