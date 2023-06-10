package Chapter5_SwitchStatement_ProblemSolving;

// 3 Question::  Given an Year,Print Whether that year is an  leap year or Not
//Input:2014 and Output:"Leap Year"
//Input:2016 and Output: Not a leap year
//A year is Consider a Leap Year,Based on two things
//If year is Exactly Divisible by 4 and Not Divisible by 100
//If Year is Divisible by 400 ,Then its an Leap Year

import java.util.Scanner;

public class ProblemSolving_5 {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        int year= sc.nextInt();
    if(((year%4==0) &&(year%100!=100) ) || (year%400==0)){
        System.out.println("Its  an Leap Year");
    }
    else{

        System.out.println("Its Not an Leap Year");
    }
    }
}
