public class arreglos1{
    public static void main(String[] args) {
        int[] vect = {0,1,2,3,4,5,6,7,8,9};
        String cad = "Serie de los numeros naturales \n";

        for(int i = 0; i<vect.length;i++){
            cad+= vect[i]+"\n";
        }
        System.out.println(cad);
    }
}