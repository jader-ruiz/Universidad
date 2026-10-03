public class SecuenciaFibonacci{
    final int tam = 50;
    long[] v;

    public SecuenciaFibonacci(){
        v = new long[tam];
    }

    public void operacion(){
        long a = 0;
        long b = 1;
        long siguiente = 0;
        String secuencia = "";

        for (int i = 0; i < v.length; i++) {
            v[i] = siguiente;
            siguiente = a+b;
            a = b;
            b = siguiente;
            secuencia += "\n"+v[i];
            
        }

        System.out.println(secuencia);

    }

    public static void main(String[] args){
        SecuenciaFibonacci op = new SecuenciaFibonacci();
        op.operacion();
    }
}