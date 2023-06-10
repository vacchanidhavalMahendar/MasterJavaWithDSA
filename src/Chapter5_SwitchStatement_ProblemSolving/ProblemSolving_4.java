package Chapter5_SwitchStatement_ProblemSolving;

//Problem Solving 2:
//2Question :: Given Triangle, and it has 3 angles of a triangle and You need to check Whether a  valid
//Triangle can be formed from those  3 angels
//Input:: 60,30,90
//Output: Valid traingle or else invalid
//Condition: In order of triangle, to be a valid triangle,the  sum of al triangle is 180
//90 0 90 =180
//Every side angel is greater than 0


import java.util.Scanner;

public class ProblemSolving_4 {
    public static void main(String[] args){

    Scanner sc= new Scanner(System.in);
     int a= sc.nextInt();
      int b = sc.nextInt();
      int c= sc.nextInt();

      int sum = a+b+c;

      if(sum==180&&a>0&&b>0&&c>0){
          System.out.println("THIS IS A VALID TRIANGLE");

      }


      else{
          System.out.println("InValid Triangle");
      }



    }
}
