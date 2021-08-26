public class Fatorial{

    public static void main(String args[]){

        //fatorial de 20, 30, 40

        //regra n*n-1.....n==1
        long fatorial=1;
        for(int i=30; i>=1;i--){
            fatorial=fatorial*i;

        }
        System.out.println(fatorial);


    }
}