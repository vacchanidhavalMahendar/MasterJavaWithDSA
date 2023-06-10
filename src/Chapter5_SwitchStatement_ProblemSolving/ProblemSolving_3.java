package Chapter5_SwitchStatement_ProblemSolving;

import java.util.Scanner;

//1 Question::: Take the User Input  ,Which is an Integer.If the input  value is even or odd
//Input: 4 ,Output is:: Even
//Input 7: Output is: odd
//Even values are  Divisble by 0 and multiple of 2 and 4
//Odd Values are not Divisible by 2

public class ProblemSolving_3 {

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        int takingUserInput =sc.nextInt();
          int takingUserInputForOdd= sc.nextInt();
          if(takingUserInput%2==0){
              System.out.println("Even");
          }

          else{

              System.out.println("Odd");
          }


          }

    }

