package Chapter7_ProblemSolvingandTernaryOperator;

//Problem 1:Given an Integer value n ,nth and need to find out Fibonacii number

public class ProblemSolving_FibonacciSeries_1 {
    public static void main(String[] args) {
        int n=13;
    //Print till  nth fibonacci series
       //print first n fibonacci series
        //print the nth fibonacci series


        int a=0;
        int b=1;

        int count=1;

        while(count<=n+1){
            System.out.println(a);
             int sum=a+b;
             a=b;
             b=sum;
             count= count+1;
        }
    }
}
