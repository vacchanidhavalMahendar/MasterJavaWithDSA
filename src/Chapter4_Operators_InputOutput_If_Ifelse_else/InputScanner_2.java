package Chapter4_Operators_InputOutput_If_Ifelse_else;

import java.util.Scanner;
public class InputScanner_2 {

    public static void main(String[] args){

        //Creating an Object of Scanner class
        Scanner  input= new Scanner(System.in); // Taking the inputs from the users

        System.out.println("Enter the integer  Value::");
        //Taking  input from the  user
        int number = input.nextInt();

        System.out.println("You Entered the Number"+ number);

        float myFloat =  input.nextFloat();
        double myDouble= input.nextDouble();

        String  myString= input.next();
        

    }
}
