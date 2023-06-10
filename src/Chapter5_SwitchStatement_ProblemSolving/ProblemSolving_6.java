package Chapter5_SwitchStatement_ProblemSolving;
//Question:Given three integer values and  Find the Maximum  of the three of them
//Eg
//Input:10 20 15  -->Output is 20
//Input:20 45 60 -->Output is 60


import java.util.Scanner;

public class ProblemSolving_6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        if(a>=b&&a>=c){
            System.out.println(a);
        }

        else if(b>=a&&b>=c){
            System.out.println(b);
        }

        else{
            System.out.println(c);

        }

    }
}
