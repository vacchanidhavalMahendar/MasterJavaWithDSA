package Chapter6__LoopsInJava;
//Natural numbers: 1 to 4
//Natural numbers  From 1 to 1000
//(1-4) ->1+2+3+4=10

public class Iterative_Loops_4 {

    public static void main(String[] args) {

        int sum=0;
        int n=1000;
        for(int i=1;i<=n;i++){
            sum= sum+i;
            System.out.println(sum);

          //  sum= 0+1=1

        }
    }
}
